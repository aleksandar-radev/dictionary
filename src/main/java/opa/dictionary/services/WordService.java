package opa.dictionary.services;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class WordService {
    private BufferedReader reader;
    private File file;

    public WordService() throws FileNotFoundException {
        this.file = new File("src/main/resources/words.txt");
        this.reader = new BufferedReader(new FileReader(file));
    }


    public Set<String> getWords() throws IOException {
        Set<String> words = new TreeSet<>();
        String word = reader.readLine();

        while (word != null) {
            if (isValid(word)) {
                words.add(word);
            }
            word = reader.readLine();
        }
        return words;
    }

    public boolean isValid(String word) {
        String pattern = "^[ад]{2}$";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(word);

        return matcher.find();
    }
    
}

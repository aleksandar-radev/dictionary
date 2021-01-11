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

    public WordService() {
    }

    public Set<String> getWords(String letters) throws IOException {

        this.file = new File("words.txt");
        this.reader = new BufferedReader(new FileReader(file));

        Set<String> words = new TreeSet<>();
        String word = reader.readLine();

        while (word != null) {
            if (isValid(word, letters)) {
                words.add(word);
            }
            word = reader.readLine();
        }
        return words;
    }

    public boolean isValid(String word, String letters) {
        String pattern = String.format("^([%s]{2,50})$", letters);
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(word);

        return matcher.find();
    }

}

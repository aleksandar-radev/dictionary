package opa.dictionary;

import opa.dictionary.gui.DictGUI;
import opa.dictionary.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class Engine implements CommandLineRunner {

    private WordService wordService;

    @Autowired
    public Engine(WordService wordService) {
        this.wordService = wordService;
    }


    @Override
    public void run(String... args) throws IOException {
        DictGUI gui = new DictGUI(wordService);
        gui.start();

        File curDir = new File(".");
        System.out.println("before");
        getAllFiles(curDir);
        System.out.println("after");

    }

    private static void getAllFiles(File curDir) {

        File[] filesList = curDir.listFiles();
        for (File f : filesList) {
            if (f.isDirectory())
                getAllFiles(f);
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }

    }
}

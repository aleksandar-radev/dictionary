package opa.dictionary;

import opa.dictionary.gui.DictGUI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Engine implements CommandLineRunner {



    @Override
    public void run(String... args) {
//        List<Word> words = this.wordService.getAllWords();
        System.out.println(1);
        DictGUI gui = new DictGUI();
    }
}

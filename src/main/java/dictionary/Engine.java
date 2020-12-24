package dictionary;

import dictionary.gui.App;
import dictionary.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class Engine implements CommandLineRunner {

//    public static class GUI {
//        public GUI() {
//            JFrame frame = new JFrame();
//
//            JPanel panel = new JPanel();
//            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
//            panel.setLayout(new GridLayout(0, 1));
//            frame.add(panel, BorderLayout.CENTER);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setTitle("Hello");
//            frame.pack();
//            frame.setVisible(true);
//        }
//    }

    private WordService wordService;

    @Autowired
    public Engine(WordService wordService) {
        this.wordService = wordService;
    }



    @Override
    public void run(String... args) throws Exception {
//        List<Word> words = this.wordService.getAllWords();
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        System.out.println();
    }
}

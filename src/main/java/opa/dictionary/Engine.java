package opa.dictionary;

import opa.dictionary.gui.DictGUI;
import opa.dictionary.services.WordService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class Engine implements CommandLineRunner {

    private WordService wordService;

    public Engine() {
    }


    @Override
    public void run(String... args) throws IOException {
        DictGUI gui = new DictGUI(wordService);
        gui.start();

    }
}



//    List<Word> words = this.wordService.getAllWords();



//package opa.dictionary.gui;
//
//        import javax.swing.*;
//        import java.awt.*;
//
//public class DictGUI {
//    private JPanel panel;
//
//    public DictGUI() {
////        this.init();
////        button1.addActionListener(e -> JOptionPane.showMessageDialog(null, "Hello World"));
//    }
//
//    private void init() {
////        this.jFrame = new JFrame();
////        this.jPanel = new JPanel();
////        this.jPanel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
////        this.jPanel.setLayout(new GridLayout(3, 2));
////        this.jFrame.setSize(400, 400);
////        this.jFrame.add(this.jPanel, BorderLayout.CENTER);
////        this.button1.setBounds(100, 100, 100, 40);
////        this.jFrame.add(button1);
////        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        this.jFrame.setTitle("Hello");
////        this.jFrame.pack();
////        this.jFrame.setVisible(true);
//    }
//}

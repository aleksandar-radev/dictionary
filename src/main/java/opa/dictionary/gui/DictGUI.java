package opa.dictionary.gui;

import opa.dictionary.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;

public class DictGUI {
    private WordService wordService;
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextPane textPane1;
    private JButton getWordsButton;

    @Autowired
    public DictGUI(WordService wordService) {
        this.wordService = wordService;
        frame = new JFrame();
        frame.add(mainPanel);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void start() {
        this.frame.pack();
        this.frame.setVisible(true);
    }
}

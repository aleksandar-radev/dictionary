package opa.dictionary.gui;

import opa.dictionary.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.io.IOException;
import java.util.Set;

public class DictGUI {
    private WordService wordService;
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField letters;
    private JTextPane result;
    private JButton getWordsButton;

    @Autowired
    public DictGUI(WordService wordService) {
        this.wordService = wordService;
        frame = new JFrame();
        frame.add(mainPanel);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getWordsButton.addActionListener(e -> {
            result.setText("");
            String l = letters.getText();
            try {
                Set<String> words = wordService.getWords(l);
                for (String word : words) {
                    result.getStyledDocument()
                            .insertString(0, System.lineSeparator(), null);
                    result.getStyledDocument()
                            .insertString(0, word.trim(), null);
                }
            } catch (IOException | BadLocationException ioException) {
                ioException.printStackTrace();
            }
        });
    }

    public void start() {
        this.frame.pack();
        this.frame.setVisible(true);
    }


}

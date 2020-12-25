package opa.dictionary.gui;

import javax.swing.*;
import java.awt.*;

public class DictGUI {
    private JFrame jFrame;
    private JPanel jPanel;
    private JTextPane helloWorldTextPane;
    private JButton button1;
    private JTextArea newTextArea;

    public DictGUI() {
        this.init();
//        button1.addActionListener(e -> JOptionPane.showMessageDialog(null, "Hello World"));
    }

    private void init() {
        this.jFrame = new JFrame();
        this.jPanel = new JPanel();
        this.jPanel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        this.jPanel.setLayout(new GridLayout(3, 2));

        this.jFrame.add(this.jPanel, BorderLayout.CENTER);
        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jFrame.setTitle("Hello");
        this.jFrame.pack();
        this.jFrame.setVisible(true);
    }
}

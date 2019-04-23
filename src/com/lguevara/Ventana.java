package com.lguevara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    public Ventana() {
        this.setTitle("Mi primer ventana Java");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout());

        JButton button1 = new JButton("Button 1");
        JLabel label1 = new JLabel("This is a label");
        JTextField textField = new JTextField("Default text");
        JPasswordField password = new JPasswordField();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3));

        JRadioButton redRadioButton = new JRadioButton("Red");
        JRadioButton greenRadioButton = new JRadioButton("Green");
        JRadioButton blueRadioButton = new JRadioButton("Blue");

        label1.setForeground(Color.RED);
        redRadioButton.setSelected(true);

        ButtonGroup colourGroup = new ButtonGroup();

        redRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setForeground(Color.RED);
            }
        });

        greenRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setForeground(Color.GREEN);
            }
        });

        blueRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setForeground(Color.BLUE);
            }
        });

        colourGroup.add(redRadioButton);
        colourGroup.add(greenRadioButton);
        colourGroup.add(blueRadioButton);

        JCheckBox boldCheckBox = new JCheckBox("Bold");
        JCheckBox italicCheckBox = new JCheckBox("Italic");

        panel.add(redRadioButton);
        panel.add(greenRadioButton);
        panel.add(blueRadioButton);
        panel.add(boldCheckBox);
        panel.add(italicCheckBox);

        this.add(textField, BorderLayout.NORTH);
        this.add(password, BorderLayout.SOUTH);
        this.add(label1, BorderLayout.WEST);
        this.add(button1, BorderLayout.EAST);
        this.add(panel, BorderLayout.CENTER);

        this.setVisible(true);
    }
}

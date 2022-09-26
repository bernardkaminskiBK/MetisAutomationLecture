package java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Locale;

public class HlavneOkno extends JFrame
{
    private JButton btnKlikni;
    private JTextArea txaText;

    public HlavneOkno()
    {
        setTitle("Grafika 03");

        setLayout(new BorderLayout());

        btnKlikni = new JButton("Klikni");

        txaText = new JTextArea();
        txaText.setBackground(Color.LIGHT_GRAY);
        txaText.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        txaText.setEditable(false);

        ActionListener lambda = (ActionEvent e) ->
        {
            // vloz do viacriadkoveho pola -> aktualny cas
            // System.out.println(LocalTime.now());
            txaText.append("Klikol si na tlacidlo Klikni!\n");
            // txaText.setText(txaText.getText() + "Klikol si na tlacidlo Klikni!\n");
        };

        btnKlikni.addActionListener(lambda);

        add(txaText, BorderLayout.CENTER);
        add(btnKlikni, BorderLayout.SOUTH);

        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


package java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_2;

import javax.swing.*;
import java.awt.*;

public class HlavneOkno extends JFrame
{
    private JButton btnKlikni;
    private JTextArea txaText;

    public HlavneOkno()
    {
        setTitle("Grafika 02");

        setLayout(new BorderLayout());

        btnKlikni = new JButton("Klikni");
        txaText = new JTextArea();
        txaText.setBackground(Color.LIGHT_GRAY);
        txaText.setFont(new Font("TimesRoman", Font.PLAIN, 22));

        add(txaText, BorderLayout.CENTER);
        add(btnKlikni, BorderLayout.SOUTH);

        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


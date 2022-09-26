package java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HlavneOkno extends JFrame
{
    private JButton btnKlikni;
    private TextovyPanel pnlText;
    private PanelNastrojov pnlNastrojov;

    public HlavneOkno()
    {
        setTitle("Grafika 05");

        setLayout(new BorderLayout());

        btnKlikni = new JButton("Klikni");
        pnlText = new TextovyPanel();
        pnlNastrojov = new PanelNastrojov();

        ActionListener lambda = (ActionEvent e) ->
        {
            // vloz text na textovy panel
            pnlText.vlozText("Klikol si na tlacidlo Klikni!\n");
        };

        btnKlikni.addActionListener(lambda);

        add(pnlNastrojov, BorderLayout.NORTH);
        add(pnlText, BorderLayout.CENTER);
        add(btnKlikni, BorderLayout.SOUTH);

        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


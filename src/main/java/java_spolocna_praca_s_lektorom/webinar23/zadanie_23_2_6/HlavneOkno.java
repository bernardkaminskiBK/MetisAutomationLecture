package java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_6;

import javax.swing.*;
import java.awt.*;

public class HlavneOkno extends JFrame
{
    private TextovyPanel pnlText;
    private PanelNastrojov pnlNastrojov;

    public HlavneOkno()
    {
        setTitle("Grafika 06");

        setLayout(new BorderLayout());

        pnlText = new TextovyPanel();
        pnlNastrojov = new PanelNastrojov();

        // pridat odkaz na textovy panel, panelu nastrojov
        pnlNastrojov.setTextovyPanel(pnlText);

        add(pnlNastrojov, BorderLayout.NORTH);
        add(pnlText, BorderLayout.CENTER);

        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


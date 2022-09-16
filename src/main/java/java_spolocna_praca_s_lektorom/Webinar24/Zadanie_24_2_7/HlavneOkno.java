package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_7;

import javax.swing.*;
import java.awt.*;

public class HlavneOkno extends JFrame {
    private TextovyPanel pnlText;
    private PanelNastrojov pnlNastrojov;

    public HlavneOkno() {
        super("Grafika 07");

        setLayout(new BorderLayout());

        pnlText = new TextovyPanel();
        pnlNastrojov = new PanelNastrojov();

        // vytvor lambdu typu RetazecListener
        RetazecListener lambda = (String text) -> pnlText.vlozText(text);

        // riesenie pomocou anonymnej vnutornej triedy
        RetazecListener listener = new RetazecListener() {
            @Override
            public void vlozText(String text) {
                pnlText.vlozText(text);
            }
        };

        // inline lambda vyraz
        pnlNastrojov.setListener((String text) -> pnlText.vlozText(text));

        add(pnlNastrojov, BorderLayout.NORTH);
        add(pnlText, BorderLayout.CENTER);

        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

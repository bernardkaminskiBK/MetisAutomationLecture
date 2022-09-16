package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_5;

import javax.swing.*;
import java.awt.*;

public class PanelNastrojov extends JPanel {
    private JButton btnPotvrd;
    private JButton btnZrus;

    public PanelNastrojov() {
        btnPotvrd = new JButton("Potvrd");
        btnZrus = new JButton("Zrus");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(btnPotvrd);
        add(btnZrus);
    }
}

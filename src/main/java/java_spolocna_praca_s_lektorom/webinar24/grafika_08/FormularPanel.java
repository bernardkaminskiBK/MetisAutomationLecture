package java_spolocna_praca_s_lektorom.webinar24.grafika_08;

import javax.swing.*;
import java.awt.*;

public class FormularPanel extends JPanel {

    public FormularPanel() {

        Dimension velkost = getPreferredSize();
        System.out.println("Povodna velkost: " + velkost);

        velkost.width = 200;

        setPreferredSize(velkost);
    }
}

package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_8;

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

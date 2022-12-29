package javazaklady.lecture24.activity2.Zadanie_24_2_9;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormularPanel extends JPanel {

    public FormularPanel() {

        Dimension velkost = getPreferredSize();
        System.out.println("Povodna velkost: " + velkost);

        velkost.width = 200;

        setPreferredSize(velkost);

        // setBorder(BorderFactory.createLineBorder(Color.RED));
        // setBorder(BorderFactory.createTitledBorder("Info o zamestnancovi"));

        Border vonkajsie = BorderFactory.createTitledBorder("Info o zamestnancovi");
        Border vnutorne = BorderFactory.createEmptyBorder(30, 20, 30, 20);
        Border zlozene = BorderFactory.createCompoundBorder(vnutorne, vonkajsie);

        setBorder(zlozene);
    }
}

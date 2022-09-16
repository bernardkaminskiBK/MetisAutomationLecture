package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_11;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormularPanel extends JPanel {

    private JLabel lblMeno;
    private JLabel lblZamestnanie;
    private JTextField txtMeno;
    private JTextField txtZamestnanie;
    private JButton btnOK;

    public FormularPanel() {

        Dimension velkost = getPreferredSize();
        System.out.println("Povodna velkost: " + velkost);

        velkost.width = 350;

        setPreferredSize(velkost);

        Border vnutorneOhranicenie = BorderFactory.createTitledBorder("Info o osobe");
        Border vonkajsieOhranicenie = BorderFactory.createEmptyBorder(30, 20, 30, 20);
        Border zlozene = BorderFactory.createCompoundBorder(vonkajsieOhranicenie, vnutorneOhranicenie);

        setBorder(zlozene);

        lblMeno = new JLabel("Meno: ");
        lblZamestnanie = new JLabel("Zamestnanie: ");
        txtMeno = new JTextField(10);
        txtZamestnanie = new JTextField(10);

        btnOK = new JButton("OK");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        /* PRVY RIADOK */
        gc.weightx = 1; // pomer volneho miesta v danej bunke voci ostatnym komponentam
        gc.weighty = 0.1;

        gc.gridx = 0;   // lavy horny roh
        gc.gridy = 0;

        gc.insets = new Insets(0, 0, 0, 10);
        gc.fill = GridBagConstraints.NONE;  // akl vyplni komponenta danu bunku
        // vertikalne, horizonatlne, obidvomi smermi, 1:1
        gc.anchor = GridBagConstraints.LINE_END;

        add(lblMeno, gc);

        // stale sme v 1. riadku, ale v 2. stlpci
        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(txtMeno, gc);

        /* DRUHY RIADOK */
        gc.weightx = 1;
        gc.weighty = 0.1;

        // sme v 2. riadku, v 1. stlpci
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0, 0, 0, 10);
        add(lblZamestnanie, gc);

        // sme 2. riadku, v 2. stlpci
        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(txtZamestnanie, gc);

        /* TRETI RIADOK */

        // sme v 3. riadku, v 2. stlpci
        gc.weightx = 1;
        gc.weighty = 3;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(btnOK, gc);
    }
}

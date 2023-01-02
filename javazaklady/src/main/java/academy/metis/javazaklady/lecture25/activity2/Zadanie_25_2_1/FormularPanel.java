package academy.metis.javazaklady.lecture25.activity2.Zadanie_25_2_1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularPanel extends JPanel
{
    private JLabel lblMeno;
    private JLabel lblZamestnanie;
    private JTextField txtMeno;
    private JTextField txtZamestnanie;
    private JButton btnOK;
    private FormularListener listener;
    private JList<String> lstVekoveKategorie;

    public FormularPanel()
    {
        Dimension velkost = getPreferredSize();

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

        lstVekoveKategorie = new JList<>();

        DefaultListModel<String> vekoveKategoriaModel = new DefaultListModel<>();
        vekoveKategoriaModel.addElement("menej ako 18 rokov");
        vekoveKategoriaModel.addElement("od 18 do 60 rokov");
        vekoveKategoriaModel.addElement("viac ako 60 rokov");

        // je portrebne prepojit JList a model dat
        lstVekoveKategorie.setModel(vekoveKategoriaModel);
        lstVekoveKategorie.setPreferredSize(new Dimension(130, 60));
        lstVekoveKategorie.setBorder(BorderFactory.createEtchedBorder());
        lstVekoveKategorie.setSelectedIndex(1);

        btnOK = new JButton("OK");
        btnOK.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String meno = txtMeno.getText();
                String zamestnanie = txtZamestnanie.getText();
                String vekovaKategoria = lstVekoveKategorie.getSelectedValue();

                // "vynulujeme" textove polia
                txtMeno.setText("");
                txtZamestnanie.setText("");

                FormularUdalost udalost = new FormularUdalost(this, meno, zamestnanie, vekovaKategoria);

                if (listener != null)
                {
                    listener.nastalaUdalostFormulara(udalost);
                }
            }
        });

        // TODO: zmen implementaciu na lambdu

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
        // sme v 3. riadku, v 1. stlpci
        gc.weightx = 1;
        gc.weighty = 0.2;
        gc.gridy = 2;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 10);
        gc.anchor = GridBagConstraints.LINE_END;

        add(new JLabel("Vekove kategorie: "), gc);

        // sme v 3. riadku, v 2. stlpci
        gc.weightx = 1;
        gc.weighty = 0.2;
        gc.gridy = 2;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;

        add(lstVekoveKategorie, gc);

        /* STVRTY RIADOK */

        // sme v 3. riadku, v 2. stlpci
        gc.weightx = 1;
        gc.weighty = 3;
        gc.gridx = 1;
        gc.gridy = 3;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(btnOK, gc);
    }

    public void setFormularListener(FormularListener listener)
    {
        this.listener = listener;
    }
}

package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_12.panely;

import java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_12.RetazecListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelNastrojov extends JPanel implements ActionListener {
    private JButton btnPotvrd;
    private JButton btnZrus;
    private RetazecListener listener;

    public PanelNastrojov() {
        btnPotvrd = new JButton("Potvrd");
        btnPotvrd.addActionListener(this);

        btnZrus = new JButton("Zrus");
        btnZrus.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        setBorder(BorderFactory.createRaisedBevelBorder());

        add(btnPotvrd);
        add(btnZrus);
    }

    public void setListener(RetazecListener listener) {
        this.listener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent udalost) {
        if (listener != null) {
            if (udalost.getSource() == btnPotvrd) {
                listener.vlozText("Klikol si na tlacidlo Potvrd\n");
            }
            if (udalost.getSource() == btnZrus) {
                listener.vlozText("Klikol si na tlacidlo Zrus\n");
            }
        }
    }
}

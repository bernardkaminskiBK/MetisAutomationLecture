package academy.metis.javazaklady.lecture23.activity2.Zadanie_23_2_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelNastrojov extends JPanel implements ActionListener
{
    private JButton btnPotvrd;
    private JButton btnZrus;
    private TextovyPanel pnlText;

    public PanelNastrojov()
    {
        btnPotvrd = new JButton("Potvrd");
        btnPotvrd.addActionListener(this);

        btnZrus =  new JButton("Zrus");
        btnZrus.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(btnPotvrd);
        add(btnZrus);
    }

    public void setTextovyPanel(TextovyPanel pnlText)
    {
        this.pnlText = pnlText;
    }

    @Override
    public void actionPerformed(ActionEvent udalost)
    {
        if (pnlText != null)
        {
            if (udalost.getSource() == btnPotvrd)
            {
                pnlText.vlozText("Klikol si na tlacidlo Potvrd\n");
            }

            if (udalost.getSource() == btnZrus)
            {
                pnlText.vlozText("Klikol si na tlacidlo Zrus\n");
            }
        }
    }
}


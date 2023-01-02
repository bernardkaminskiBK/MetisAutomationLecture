package academy.metis.javazaklady.lecture25.activity2.Zadanie_25_2_1;

import javax.swing.*;
import java.awt.*;

public class HlavneOkno extends JFrame
{
    private TextovyPanel pnlText;
    private PanelNastrojov pnlNastrojov;
    private FormularPanel pnlFormular;

    public HlavneOkno()
    {
        super("Grafika 13");

        setLayout(new BorderLayout());

        pnlText = new TextovyPanel();
        pnlNastrojov = new PanelNastrojov();
        pnlFormular = new FormularPanel();

        // FORMULAR_PANEL -> TEXTOVY_PANEL
        pnlFormular.setFormularListener(new FormularListener()
        {
            @Override
            public void nastalaUdalostFormulara(FormularUdalost udalost)
            {
                String meno = udalost.getMeno();
                String zamestnanie = udalost.getZamestnanie();
                String vekovaKategoria = udalost.getVekovaKategoria();

                pnlText.vlozText(meno + " - " + zamestnanie + " -> " + vekovaKategoria + "\n");
            }
        });

        // PANEL_NASTROJOV -> TEXTOVY_PANEL
        // vytvor lambdu typu RetazecListener
        RetazecListener lambda = (String text) -> pnlText.vlozText(text);

        // riesenie pomocou anonymnej vnutornej triedy
        RetazecListener listener = new RetazecListener()
        {
            @Override
            public void vlozText(String text)
            {
                pnlText.vlozText(text);
            }
        };

        // inline lambda vyraz
        pnlNastrojov.setListener((String text) -> pnlText.vlozText(text));

        add(pnlNastrojov, BorderLayout.NORTH);
        add(pnlText, BorderLayout.CENTER);
        add(pnlFormular, BorderLayout.WEST);

        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

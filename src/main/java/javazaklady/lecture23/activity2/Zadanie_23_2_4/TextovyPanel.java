package javazaklady.lecture23.activity2.Zadanie_23_2_4;

import javax.swing.*;
import java.awt.*;

public class TextovyPanel extends JPanel
{
    private JTextArea txaText;

    public TextovyPanel()
    {
        txaText = new JTextArea();
        txaText.setBackground(Color.LIGHT_GRAY);
        txaText.setFont(new Font("TimeRoman", Font.PLAIN, 22));
        txaText.setEditable(false);

        setLayout(new BorderLayout());

        // viacriadkove textove pole bude obsahovat automaticke posuvniky
        add(new JScrollPane(txaText), BorderLayout.CENTER);
    }

    public void vlozText(String text)
    {
        txaText.append(text);
    }
}

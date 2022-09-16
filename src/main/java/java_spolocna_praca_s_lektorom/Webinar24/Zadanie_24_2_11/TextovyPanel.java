package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_11;

import javax.swing.*;
import java.awt.*;

public class TextovyPanel extends JPanel {

    private JTextArea txaText;

    public TextovyPanel() {
        txaText = new JTextArea();
        txaText.setBackground(Color.LIGHT_GRAY);
        txaText.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        txaText.setEditable(false);

        setLayout(new BorderLayout());

        // viacriadkove textove pole bude obsahovat automaticke posuvniky
        add(new JScrollPane(txaText), BorderLayout.CENTER);
    }

    public void vlozText(String text) {
        txaText.append(text);
    }
}

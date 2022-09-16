package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_4;

import javax.swing.*;

public class Aplikacia {
    public static void main(String[] args) {

        Runnable lambda = () -> {
            new HlavneOkno();
        };

        SwingUtilities.invokeLater(lambda);
    }
}

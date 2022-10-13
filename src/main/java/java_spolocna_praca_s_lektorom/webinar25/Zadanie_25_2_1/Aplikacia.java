package java_spolocna_praca_s_lektorom.webinar25.Zadanie_25_2_1;

import javax.swing.*;

public class Aplikacia
{
    public static void main(String[] args)
    {
        Runnable lambda = () -> {
            new HlavneOkno();
        };

        SwingUtilities.invokeLater(lambda);
    }
}

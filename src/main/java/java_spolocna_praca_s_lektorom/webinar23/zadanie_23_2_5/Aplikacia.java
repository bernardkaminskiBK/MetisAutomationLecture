package java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_5;

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

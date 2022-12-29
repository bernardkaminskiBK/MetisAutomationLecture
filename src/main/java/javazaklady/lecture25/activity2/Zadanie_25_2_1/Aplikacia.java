package javazaklady.lecture25.activity2.Zadanie_25_2_1;

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

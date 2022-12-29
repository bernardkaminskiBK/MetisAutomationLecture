package javazaklady.lecture23.activity2.Zadanie_23_2_2;

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

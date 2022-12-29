package javazaklady.lecture24.activity2.Zadanie_24_2_12;

import javax.swing.*;

public class Aplikacia {
    public static void main(String[] args) {

        Runnable lambda = () -> {
            new HlavneOkno();
        };

        SwingUtilities.invokeLater(lambda);
    }
}

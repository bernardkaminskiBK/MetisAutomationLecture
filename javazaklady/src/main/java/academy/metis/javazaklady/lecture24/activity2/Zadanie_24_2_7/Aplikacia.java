package academy.metis.javazaklady.lecture24.activity2.Zadanie_24_2_7;

import javax.swing.*;

public class Aplikacia {
    public static void main(String[] args) {

        Runnable lambda = () -> {
            new HlavneOkno();
        };

        SwingUtilities.invokeLater(lambda);
    }
}

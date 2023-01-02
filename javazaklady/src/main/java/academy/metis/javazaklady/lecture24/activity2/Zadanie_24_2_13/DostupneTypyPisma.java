package academy.metis.javazaklady.lecture24.activity2.Zadanie_24_2_13;

import java.awt.*;

public class DostupneTypyPisma {
    public static void main(String[] args) {
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        Font[] pisma = environment.getAllFonts();

        for (Font pismo : pisma) {
            System.out.println(pismo.getName());
            System.out.println(pismo.getFontName());
            System.out.println(pismo.getFamily());
            System.out.println(pismo.getPSName());
            System.out.println("------------------------------");
        }
    }
}

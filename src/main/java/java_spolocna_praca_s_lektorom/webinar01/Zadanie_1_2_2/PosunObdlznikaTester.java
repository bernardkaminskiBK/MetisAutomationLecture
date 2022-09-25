package java_spolocna_praca_s_lektorom.webinar01.Zadanie_1_2_2;

import javax.swing.*;

// Trieda odkaz = new Trieda();
public class PosunObdlznikaTester {

    public static void main(String[] args) {
        // 1) vytvor objekt triedy JFrame
        JFrame okno = new JFrame();

        // 2) nastav popis okna na - "Prazdne okno"
        okno.setTitle("Prazdne okno");

        // 3) nastav rozmer okna na 800 x 600 pixelov
        okno.setSize(800, 600);

        // 4) nastav tzv. defaultnu operaciu, t.j. co sa ma udiat, ked zatvorim okno
        //    grafickej aplikacie
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.setResizable(false);       // blokovanie zmeny rozmeru okno
        okno.setLocationRelativeTo(null);

        //TODO: volako vymysliet ako ziskat data z komponenty JFramu...

        // 5) vytvor objekt triedy KomponentaObdlznik a nasledne ho pridaj do
        //    okna grafickej aplikacie
        KomponentaObdlznik komponenta = new KomponentaObdlznik();
        okno.add(komponenta);

        // 6) nastav okno viditelnym (zobraz okno grafickej aplikacie)
        okno.setVisible(true);
    }
}

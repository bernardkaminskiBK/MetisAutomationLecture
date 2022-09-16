package java_spolocna_praca_s_lektorom.webinar02.Zadanie_2_2_2;

import javax.swing.*;

public class ZobrazovacAuta {

    public static void main(String[] args) {
        JFrame okno = new JFrame();

        okno.setSize(800, 600);
        okno.setTitle("Zobrazovac auta");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        KomponentaAuto komponentaAuto = new KomponentaAuto();
        okno.add(komponentaAuto);

        okno.setVisible(true);
    }
}

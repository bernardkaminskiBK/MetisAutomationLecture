package java_spolocna_praca_s_lektorom.webinar04.viaccestne_vetvenie;

import java.util.Scanner;

public class ZemetrasenieTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj silu zemetrasenia na Richterovej stupnici:");
        double magnituda = scanner.nextDouble();

        Zemetrasenie zemetrasenie = new Zemetrasenie(magnituda);

        String popis = zemetrasenie.getPopis();
        System.out.println("Popis: " + popis);

    }
}

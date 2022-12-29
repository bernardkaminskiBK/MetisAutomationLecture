package javazaklady2.Webinar14.part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OsobyDemo {
    public static void main(String[] args) {
        int pocet = 0;
        Scanner vstup = new Scanner(System.in);
        ArrayList<Osoba> osoby = new ArrayList<>();

        boolean ukonceneNacitavanie = false;

        while (!ukonceneNacitavanie) {
            System.out.println("Zadaj meno osoby alebo prazdny riadok pre ukoncenie: ");
            String meno = vstup.nextLine();

            if (meno.equals("")) {
                ukonceneNacitavanie = true;
            } else {
                Osoba osoba = new Osoba(meno);
                osoby.add(osoba);
            }
        }

        zisitMenoPrvehoAPoslednehoVZozname(osoby);
    }

    public static String zisitMenoPrvehoAPoslednehoVZozname(ArrayList<Osoba> osoby) {
        Collections.sort(osoby);

        Osoba prva = osoby.get(0);
        Osoba posledna = osoby.get(osoby.size() - 1);

        return "Prva osoba: " + prva.getMeno() + "\n" + "Posledna osoba: " + posledna.getMeno();
    }

}

package javazaklady2.Webinar14.c;

import java.util.Scanner;

public class TriedenieVkladanimCasovac {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.print("Zadaj velkost pola: ");
        int velkost = vstup.nextInt();
        System.out.print("Zadaj hladane cislo: ");
        int hladaneCislo = vstup.nextInt();

        int[] pole = PoleUtil.vygenerujPoleCisel(velkost, 100);
        System.out.println(statistiky(pole, hladaneCislo));
    }

    public static String statistiky(int[] pole, int hladaneCislo) {

        String result = "";

        // vytvorime pole a naplnime ho nahodne vygenerovanym cislami
        TriedicVkladanim triedic = new TriedicVkladanim(pole);
        BinarnyVyhladavac vyhladavac = new BinarnyVyhladavac(pole);

        // pouzite triedu Stopky na meranie vykonnosti algoritmu
        Stopky stopky = new Stopky();

        stopky.spust();
        triedic.zotried();
        stopky.zastav();

        result += "Uplynuly cas triedenia: " + stopky.getUplynulyCas() + " milisekund\n";

        stopky.vynuluj();

        stopky.spust();
        int pozicia = vyhladavac.vyhladaj(hladaneCislo);

        if (pozicia >= 0) {
            result += "hladany prvok " + hladaneCislo + " sa naslo na pozicii " + pozicia + "\n";
            stopky.zastav();
            result += "Uplynuly cas vyhladavania: " + stopky.getUplynulyCas() + " milisekund";
        } else {
            result += "hladany prvok" + hladaneCislo + " sa v poli nenachadza\n";
            stopky.zastav();
            result += "Uplynuly cas vyhladvania: " + stopky.getUplynulyCas() + " milisekund";
        }

        return result;
    }

}

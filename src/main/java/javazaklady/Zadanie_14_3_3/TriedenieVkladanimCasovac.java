package javazaklady.Zadanie_14_3_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TriedenieVkladanimCasovac {
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);
        System.out.print("Zadaj velkost pola: ");
        int velkost = vstup.nextInt();
        System.out.print("Zadaj hladane cislo: ");
        int hladaneCislo = vstup.nextInt();

        // vytvorime pole a naplnime ho nahodne vygenerovanym cislami

        int[] pole = PoleUtil.vygenerujPoleCisel(velkost, 100);
        TriedicVkladanim triedic = new TriedicVkladanim(pole);
        BinarnyVyhladavac vyhladavac = new BinarnyVyhladavac(pole);

        System.out.println(Arrays.toString(pole));

        // pouzite triedu Stopky na meranie vykonnosti algoritmu
        Stopky stopky = new Stopky();

        stopky.spust();
        triedic.zotried();
        stopky.zastav();


        System.out.println("Uplynuly cas triedenia: " + stopky.getUplynulyCas() + " milisekund");
        stopky.vynuluj();

        stopky.spust();
        int pozicia = vyhladavac.vyhladaj(hladaneCislo);

        if (pozicia >= 0) {

            System.out.println("hladany prvok " + hladaneCislo + " sa naslo na pozicii " + pozicia);
            stopky.zastav();
            System.out.println("Uplynuly cas vyhladavania: " + stopky.getUplynulyCas() + " milisekund");
        }
        else {
            System.out.println("hladany prvok" + hladaneCislo + " sa v poli nenachadza");
            stopky.zastav();
            System.out.println("Uplynuly cas vyhladvania: " + stopky.getUplynulyCas() + " milisekund");
        }
    }
}

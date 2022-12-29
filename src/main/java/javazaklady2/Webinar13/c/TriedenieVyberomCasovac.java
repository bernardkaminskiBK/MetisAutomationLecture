package javazaklady2.Webinar13.c;


import java.util.Scanner;

public class TriedenieVyberomCasovac {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj dolnu velkost pola");
        int dolnaVelkost = vstup.nextInt();
        System.out.println("Zadaj hornu velkost pola");
        int hornaVelkost = vstup.nextInt();
        System.out.println("Zadaj pocet merani");
        int pocetMerani = vstup.nextInt();

        for (int i = 1; i <= pocetMerani; i++) {
            System.out.println(vygenerujCasBehuProgramu(dolnaVelkost, hornaVelkost, i));
        }
    }

    public static String vygenerujCasBehuProgramu(int dolnaVelkost, int hornaVelkost, int i) {
        String result = "";

        int n = i * dolnaVelkost;

        Stopky casovac = new Stopky();

        int[] data = PoleUtil.vygenerujPoleCisel(n, 1, hornaVelkost);
        TriedicVyberom triedic = new TriedicVyberom(data);

        casovac.spust();
        triedic.zotried();
        casovac.zastav();

        result += "n: " + n + ", Cas behu programu: " + casovac.getUplynulyCas() + " milisekund";

        return result;
    }

}

package javazaklady.Zadanie_13_3_3;
import java.util.Scanner;

public class TriedenieVyberomCasovac
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadaj dolnu velkost pola:");
        int dolnaVelkost = vstup.nextInt();

        System.out.println("Zadaj hornu velkost pola:");
        int hornaVelkost = vstup.nextInt();

        System.out.println("Zadaj pocet merani: (>=2)");
        int pocetMerani = vstup.nextInt();

        int velkostPola = dolnaVelkost;

        for (int i = 1; i <= pocetMerani; i++)
        {
            int[] data = PoleUtil.vygenerujPoleCisel(velkostPola);
            TriedicVyberom triedic = new TriedicVyberom(data);
            Stopky stopky = new Stopky();
            stopky.spust();
            triedic.zotried();
            stopky.zastav();
            System.out.println("n : "+ data.length + ". Cas behu programu: " + stopky.getUplynulyCas() + " ms");
            velkostPola = velkostPola + dolnaVelkost;
        }
    }
}

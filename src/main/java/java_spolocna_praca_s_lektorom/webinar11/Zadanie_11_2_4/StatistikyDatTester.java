package java_spolocna_praca_s_lektorom.webinar11.Zadanie_11_2_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StatistikyDatTester
{
    public static void main(String[] args)
    {
        try (Scanner citacSuboru = new Scanner(new FileReader("src/main/java/java_spolocna_praca_s_lektorom/" +
                "webinar11/Zadanie_11_2_4/statistiky.txt")))
        {
            double sucetPrvyStlpec = 0;
            double sucetDruhyStlpec = 0;
            int pocet = 0;

            while (citacSuboru.hasNextDouble())
            {
                sucetPrvyStlpec += citacSuboru.nextDouble();
                sucetDruhyStlpec += citacSuboru.nextDouble();
                pocet++;
            }

            System.out.println("Priemer cisel v 1. stlpci: " + sucetPrvyStlpec / pocet);
            System.out.println("Priemer cisel v 2. stlpci: " + sucetDruhyStlpec / pocet);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

package javazaklady.lecture11.activity2.Zadanie_11_2_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class OdstranovaniePrazdnychRiadkovTester
{
    public static void main(String[] args)
    {
        ArrayList<String> riadky = new ArrayList<>();

        // 1) Otvor textovy subor (subor.txt)
        try(Scanner citacSuboru = new Scanner(new FileReader("subor.txt")))
        {
            while (citacSuboru.hasNextLine())
            {
                String riadok = citacSuboru.nextLine();

                // 2) Odstran vsetky prazdne riadky zo suboru
                if (!riadok.trim().isEmpty())
                {
                    riadky.add(riadok); // pridame si vsetky neprazdne riadky do ArrayListu
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        try
        {
            PrintWriter zapisovac = new PrintWriter("subor.txt");

            for (String riadok : riadky) //zapisujeme len neprazdne riadky
            {
                zapisovac.println(riadok);
            }

            zapisovac.close();

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        // 3) Zatvor textovy subor (vyuzili sme rozhranie Autocloseable - zatvorilo sa to automaticky same)

        // 4) Otvor textovy subor (subor.txt)

        // 5) Vypis vsetky riadky na konzolu

        // 6) zatvor textovy subor


        // Try-with-resources - skopirovali sme si uz existujuci kod z prveho bodu a doplnili nieco navyse
        try(Scanner citacSuboru = new Scanner(new FileReader("subor.txt")))
        {
            while (citacSuboru.hasNextLine())
            {
                String riadok = citacSuboru.nextLine();
                System.out.println(riadok);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

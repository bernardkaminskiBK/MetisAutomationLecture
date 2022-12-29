package javazaklady.lecture11.activity2.Zadanie_11_2_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CitacMnozinyDat
{
    double[] citajSubor(String nazovSuboru) throws IOException, VlastnaVynimka
    {
        FileReader citac = new FileReader(nazovSuboru);
        Scanner citacSuboru = null;
        double[] data = null;

        citacSuboru = new Scanner(citac);
        data = nacitajCisla(citacSuboru);

        if(citac != null)
        {
            citac.close();
        }
        if(citacSuboru != null)
        {
            citacSuboru.close();
        }

        return data;
    }

    private double[] nacitajCisla(Scanner citacSuboru) throws VlastnaVynimka
    {
        if (!citacSuboru.hasNextInt())
        {
            throw new VlastnaVynimka("Ocakavany parameter - velkost mnoziny dat");
        }

        int velkostMnozinyDat = citacSuboru.nextInt();

        double[] data = new double[velkostMnozinyDat]; // 0.0 , 0.0...

        for (int i = 0; i < velkostMnozinyDat; i++)
        {
            nacitajCislo(data, i, citacSuboru);
        }

        if (citacSuboru.hasNext())
        {
            throw new VlastnaVynimka("Ocakavame koniec suboru");
        }

        return data;
    }

    private void nacitajCislo(double[] data, int index, Scanner citacSuboru) throws VlastnaVynimka
    {
        if (!citacSuboru.hasNextDouble())
        {
            throw new VlastnaVynimka("Ocakavame desatinne cislo");
        }
        data[index] = citacSuboru.nextDouble();
    }
}

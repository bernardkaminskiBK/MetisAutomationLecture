package java_spolocna_praca_s_lektorom.webinar11.Zadanie_11_2_1.analyzator_dat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CitacMnozinyDat
{
    double[] citajSubor(String nazovSuboru) throws IOException, NespravnyFormatDat
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

    private double[] nacitajCisla(Scanner citacSuboru) throws NespravnyFormatDat
    {
        if (!citacSuboru.hasNextInt())
        {
            throw new NespravnyFormatDat("Ocakavany parameter - velkost mnoziny dat");
        }

        int velkostMnozinyDat = citacSuboru.nextInt();

        double[] data = new double[velkostMnozinyDat]; // 0.0 , 0.0...

        for (int i = 0; i < velkostMnozinyDat; i++)
        {
            nacitajCislo(data, i, citacSuboru);
        }

        if (citacSuboru.hasNext())
        {
            throw new NespravnyFormatDat("Ocakavame koniec suboru");
        }

        return data;
    }

    private void nacitajCislo(double[] data, int index, Scanner citacSuboru) throws NespravnyFormatDat
    {
        if (!citacSuboru.hasNextDouble())
        {
            throw new NespravnyFormatDat("Ocakavame desatinne cislo");
        }
        data[index] = citacSuboru.nextDouble();
    }
}

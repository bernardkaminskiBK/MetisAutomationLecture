package javazaklady.lecture11.activity2.Zadanie_11_2_1;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class AnalyzatorDat
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        CitacMnozinyDat citac = new CitacMnozinyDat();

        boolean precitaneVsetkyData = false;
        String nazovSuboru = "";

        while(!precitaneVsetkyData)
        {
            try
            {
                System.out.println("Zadaj nazov suboru: ");
                nazovSuboru = vstup.next();

                double[] data = citac.citajSubor(nazovSuboru);

                double sucet = 0;

                for (double cislo : data)
                {
                    sucet += cislo;
                }
                System.out.println("Sucet vsetkych cisel v subore: " + nazovSuboru + " je " + sucet);
                precitaneVsetkyData = true;
            }

            catch (FileSystemNotFoundException vynimka)
            {
                System.out.println("Subor s nazvom " + nazovSuboru + " sa nenasiel!");
                break;
            }
            catch (IOException vynimka)
            {
                System.out.println("Nastala vstupno/vystupna chyba!");
                break;
            }
            catch (VlastnaVynimka vynimka)
            {
                System.out.println("Nastal problem: " + vynimka.getMessage());
                break;
            }
        }
    }
}

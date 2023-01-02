package academy.metis.javazaklady.lecture22.activity2.Zadanie_22_2_6.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KrajinyStream_v1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // 1) klasicky OOP sposob
        Scanner vstup = new Scanner(new File("krajiny.txt"));

        List<String> krajiny = new ArrayList<>();

        while (vstup.hasNextLine())
        {
            String krajina = vstup.nextLine();
            krajiny.add(krajina);
        }

        for (String krajina : krajiny)
        {
            if (krajina.startsWith("R"))
            {
                System.out.println(krajina);
            }
        }
    }
}

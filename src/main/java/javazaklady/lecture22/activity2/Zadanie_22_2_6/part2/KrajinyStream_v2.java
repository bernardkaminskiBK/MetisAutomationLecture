package javazaklady.lecture22.activity2.Zadanie_22_2_6.part2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class KrajinyStream_v2
{
    public static void main(String[] args) throws IOException
    {
        // 2) klasicky OOP citanie pomocou triedy Files
       List<String> krajiny = Files.readAllLines(Paths.get("krajiny.txt"));

        for (String krajina : krajiny)
        {
            if (krajina.startsWith("R"))
            {
                System.out.println(krajina);
            }
        }
    }
}

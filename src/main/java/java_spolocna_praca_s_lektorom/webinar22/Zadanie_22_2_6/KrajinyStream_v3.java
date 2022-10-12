package java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class KrajinyStream_v3
{
    public static void main(String[] args) throws IOException
    {
        // 3) riesenie pomocou Streamu
        Files.lines(Paths.get("krajiny.txt"))
               .filter(krajina -> krajina.startsWith("R"))
               .forEach(krajina -> System.out.println(krajina));

        long pocetKrajin = Files.lines(Paths.get("krajiny.txt"))
                .filter(krajina -> krajina.startsWith("R"))
                .count();
        System.out.println("Pocet krajin: " + pocetKrajin);
    }
}

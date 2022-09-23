package java_spolocna_praca_s_lektorom.webinar20.Zadanie_20_2_1.genericka_trieda;

import java.io.File;

public class DvojicaTester
{
    public static void main(String[] args)
    {
        Dvojica<Integer, String> cisloText = new Dvojica<>(123,"Karol");
        Dvojica<File, String> suborText = new Dvojica<>(new File("subor.txt"), "subor.txt");

        Dvojica<Dvojica<Integer, String>, Dvojica<File, String>> haluz = new Dvojica<>(cisloText, suborText);

        System.out.println("Cislo: " + cisloText.getPrvy());
        System.out.println("Meno: " + cisloText.getDruhy());
        System.out.println();

        System.out.println("Subor: " + suborText.getPrvy().getAbsolutePath());
        System.out.println("Nazov suboru: " + suborText.getDruhy());
        System.out.println();

        System.out.println("Cislo : " + haluz.getPrvy().getPrvy());
        System.out.println("Nazov suboru: " + haluz.getDruhy().getDruhy());
    }
}

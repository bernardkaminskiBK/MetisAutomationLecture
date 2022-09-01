package javazaklady.Zadanie_11_3_3;


import java.io.*;
import java.util.Scanner;

public class KopirovacSuborov {

    /**
     * Program kopiruje obsah jedneho suboru do ineho suboru.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("Pouzitie: java KopirovacSuborov subor.txt zaloha.txt");
        } else {
            String originalTextovySubor = args[0];
            String kopiaTextovySubor = args[1];
            nakopiruj(originalTextovySubor, kopiaTextovySubor);
        }

    }

    public static void nakopiruj(String originalTextovySubor, String kopiaTextovySubor) {
        //TODO: Doplnit...
    }

}



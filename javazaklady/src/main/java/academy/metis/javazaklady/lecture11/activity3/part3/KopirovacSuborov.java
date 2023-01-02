package academy.metis.javazaklady.lecture11.activity3.part3;


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
        try {
            FileReader citac = new FileReader(originalTextovySubor);
            PrintWriter zapisovac = new PrintWriter(kopiaTextovySubor);
            Scanner citacSuboru = new Scanner(citac);

            while (citacSuboru.hasNextLine()) {
                String riadok = citacSuboru.nextLine();
                zapisovac.println(riadok);
            }
            zapisovac.close();
            citac.close();
            citacSuboru.close();
            System.out.println("Kopirovanie prebehlo uspesne...");
        } catch (Exception e) {
            System.out.println("Vyskytla sa chyba pri kopirovani...");
        }
    }

}



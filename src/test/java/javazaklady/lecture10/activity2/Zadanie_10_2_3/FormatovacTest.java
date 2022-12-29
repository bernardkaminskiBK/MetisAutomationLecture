package javazaklady.lecture10.activity2.Zadanie_10_2_3;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormatovacTest {
    @Test
    void formatovacIOTest() {

        File file = new File("vystup.txt");
        assertTrue(file.exists());
    }

    @Test
    void formatovacTest() throws IOException {
        String nazovVstupnehoSuboru = "src/test/java/java_spolocna_praca_s_lektorom/" + "webinar10/Zadanie_10_2_3/" + "suborTest.txt";
        String nazovVystupnehoSuboru = "src/test/java/java_spolocna_praca_s_lektorom/" + "webinar10/Zadanie_10_2_3/" + "vystupTest.txt";

        FileReader citac = new FileReader(nazovVstupnehoSuboru);
        Scanner citacSuboru = new Scanner(citac);

        PrintWriter zapisovac = new PrintWriter(nazovVystupnehoSuboru);

        int cisloRiadka = 1;

        while (citacSuboru.hasNextLine())
        {
            String riadok = citacSuboru.nextLine();
            String naformatovanyRiadok = "/* " + cisloRiadka + " */ " + riadok;
            zapisovac.println(naformatovanyRiadok);
            cisloRiadka ++;
        }
        zapisovac.close();
        citac.close();
        citacSuboru.close();
    }

    @Test
    void formatovacVystupTest() {

        File file = new File("src/test/java/java_spolocna_praca_s_lektorom/" + "webinar10/Zadanie_10_2_3/" +
                "vystupTest.txt");
        assertTrue(file.exists());
    }
}



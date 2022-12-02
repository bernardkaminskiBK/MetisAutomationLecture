package javazaklady.Webinar08_Test.a_Test;

import javazaklady.Webinar08.a.Kocka;
import javazaklady.Webinar08.a.MnozinaDat;
import org.apache.commons.lang3.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimulaciaHoduKockouTest {

    @Test
    void getPriemerTest() {

        MnozinaDat hodyKockou = new MnozinaDat();
        for (int i = 1; i <= 3; i++) {
            Kocka kocka = new Kocka(6);
            int cislo = kocka.hod();
            hodyKockou.pridaj(kocka);
            System.out.println(cislo + " ");
        }

        Range<Double> myRange = Range.between(1.0, 6.0);
        Assertions.assertTrue(myRange.contains(hodyKockou.getPriemer()));

    }
}
package javazaklady.Zadanie_8_3_4_Test;

import javazaklady.Webinar08.Zadanie_8_3_4.Kocka;
import javazaklady.Webinar08.Zadanie_8_3_4.MnozinaDat;
import org.apache.commons.lang3.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SimulaciaHoduKockouTest {

    private MnozinaDat hodyKockou;

    private final Range<Integer> myRange = Range.between(1, 6);

    @BeforeEach
    public void setUp() {
        hodyKockou = new MnozinaDat();
        for (int i = 1; i <= 3; i++) {
            Kocka kocka = new Kocka(6);
            kocka.hod();
            hodyKockou.pridaj(kocka);
        }
    }

    @Test
    void getPriemerTest() {
        Range<Double> myRange = Range.between(1.0, 6.0);
        Assertions.assertTrue(myRange.contains(hodyKockou.getPriemer()));
    }

    @Test
    void getMinCisloTest() {
        Assertions.assertTrue(myRange.contains(hodyKockou.getMinCislo()));
    }

    @Test
    void getMaxCisloTest() {
        Assertions.assertTrue(myRange.contains(hodyKockou.getMaxCislo()));
    }

}

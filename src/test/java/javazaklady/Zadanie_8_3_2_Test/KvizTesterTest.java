package javazaklady.Zadanie_8_3_2_Test;

import javazaklady.Webinar08.Zadanie_8_3_2.Kviz;
import javazaklady.Webinar08.Zadanie_8_3_2.MnozinaDat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KvizTesterTest {

    @ParameterizedTest
    @CsvSource(value = {"100,A,89,B+,94", "89,B+,100,A,94", "73,C,89,B+,81"})
    public void getPridajTest(double percentaKviz1, String znamkaKviz1, double percentaKviz2, String znamkaKviz2, double expectedResult) {

        Kviz kviz1 = new Kviz(percentaKviz1, znamkaKviz1);
        Kviz kviz2 = new Kviz(percentaKviz2, znamkaKviz2);
        MnozinaDat mnozinaKvizy = new MnozinaDat();

        mnozinaKvizy.pridaj(kviz1);
        mnozinaKvizy.pridaj(kviz2);

        Assertions.assertEquals(expectedResult, mnozinaKvizy.getPriemer());
    }


    @ParameterizedTest
    @CsvSource(value = {"100,A,89,B+,94", "89,B+,100,A,94", "73,C,89,B+,81"})
    public void getPriemerTest(double percentaKviz1, String znamkaKviz1, double percentaKviz2, String znamkaKviz2, double expectedResult) {

        Kviz kviz1 = new Kviz(percentaKviz1, znamkaKviz1);
        Kviz kviz2 = new Kviz(percentaKviz2, znamkaKviz2);
        MnozinaDat mnozinaKvizy = new MnozinaDat();

        mnozinaKvizy.pridaj(kviz1);
        mnozinaKvizy.pridaj(kviz2);

        Assertions.assertEquals(expectedResult, mnozinaKvizy.getPriemer());
    }

    @ParameterizedTest
    @CsvSource(value = {"100,A,89,B+,100,A", "89,B+,95,A-,95,A-", "73,C+,89,B+,89,B+"})
    public void getMaximumTest(double percentaKviz1, String znamkaKviz1, double percentaKviz2, String znamkaKviz2, double expectedResult1, String expectedResult2) {

        Kviz kviz1 = new Kviz(percentaKviz1, znamkaKviz1);
        Kviz kviz2 = new Kviz(percentaKviz2, znamkaKviz2);
        MnozinaDat mnozinaKvizy = new MnozinaDat();

        mnozinaKvizy.pridaj(kviz1);
        mnozinaKvizy.pridaj(kviz2);

        Assertions.assertEquals(expectedResult1, mnozinaKvizy.getMaximum().getPrecenta());
        Assertions.assertEquals(expectedResult2, mnozinaKvizy.getMaximum().getZnamka());

    }
}

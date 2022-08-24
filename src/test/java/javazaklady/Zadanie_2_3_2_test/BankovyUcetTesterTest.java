package javazaklady.Zadanie_2_3_2_test;

import Zadanie_2_3_2.BankovyUcet;
import Zadanie_2_3_2.BankovyUcetTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankovyUcetTesterTest {
    @ParameterizedTest
    @CsvSource(value = {"100,10,110"})
    public void BankovyUcetTesterTest(double pociatocnyVklad,double urokovaSadzba, double expectedResult){
        BankovyUcet ucet = new BankovyUcet(pociatocnyVklad);
        BankovyUcetTester.spracujTransakcie(ucet,urokovaSadzba);
        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }
}

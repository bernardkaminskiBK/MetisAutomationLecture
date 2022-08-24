package javazaklady.Zadanie_2_3_1_test;


import Zadanie_2_3_1.BankovyUcet;
import Zadanie_2_3_1.BankovyUcetTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankovyUcetTesterTest {

    @ParameterizedTest
    @CsvSource(value = {"2000,1000,1000"})
    public void BankovyUcetTesterTest(double vklad, double vyber, double expectedResult){
        BankovyUcet ucet = new BankovyUcet();
        BankovyUcetTester.spracujTransakcie(ucet,vklad,vyber);
        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }
}

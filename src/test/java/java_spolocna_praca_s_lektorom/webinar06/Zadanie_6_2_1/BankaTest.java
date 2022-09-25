package java_spolocna_praca_s_lektorom.webinar06.Zadanie_6_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankaTest {

    @ParameterizedTest
    @CsvSource(value = {"6,1000,'1_1000.0_2_2000.0_3_3000.0_4_4000.0_5_5000.0_6_6000.0_6_5000.0_5_6_6000.0_4_3200.0_900.0'"})
    public void banka_test(int pocetUctov,int navysenaCiastka, String expectedResult){

        Banka banka = new Banka();
        int ciastka = 0;

        String actualResult = "";

        for (int i = 0; i < pocetUctov ; i++) {
            ciastka += navysenaCiastka ;
            BankovyUcet ucet = new BankovyUcet(i+1, ciastka);
            banka.zalozUcet(ucet);
            System.out.println(ucet.getAktualnyZostatok());
            actualResult += ucet.getCisloUctu() + "_" + ucet.getAktualnyZostatok() + "_";
        }

        actualResult += banka.getPocetUctov() + "_" + banka.vyhladajUcet(5).getAktualnyZostatok() + "_";

        banka.zmazUcet(2);
        actualResult += banka.getPocetUctov() + "_" + banka.najdiMaxUcet().getCisloUctu() + "_" + banka.najdiMaxUcet().getAktualnyZostatok() + "_" + banka.najdiPocetUctovSoZostatkomVyssimAko(2000) + "_";
        banka.vyhladajUcet(3).vloz(200);
        banka.vyhladajUcet(1).vyber(100);

        actualResult += banka.vyhladajUcet(3).getAktualnyZostatok() + "_" + banka.vyhladajUcet(1).getAktualnyZostatok();

        Assertions.assertEquals(expectedResult,actualResult);

    }
}

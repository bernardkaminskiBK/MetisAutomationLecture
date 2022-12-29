package javazaklady2.Webinar02_Test.b_Test;



import javazaklady2.Webinar02.b.BankovyUcet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankovyUcetTest {

    @ParameterizedTest
    @CsvSource(value = {"500,0.05,500.05","1000,0.05,1000.05","2500,0.05,2500.05"})
    public void pripisUrok(double pociatocnyVklad, double urok, double expectedResult){

        BankovyUcet ucet = new BankovyUcet(pociatocnyVklad);
        ucet.pripisUrok(urok);
        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }
}

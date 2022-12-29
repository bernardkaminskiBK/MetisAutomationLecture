package javazaklady.lecture5.activity3.part1;



import javazaklady.lecture5.activity3.part1.KonvertorMeny;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class KonvertorMenyTest {


    @ParameterizedTest
    @CsvSource(value = {"100,1.50,150.0","50,1.50,75.0","200,1.50,300.0"})
    public void getKoverziaTest(double vstupPouzivatela, double kurz, double expectedResult){

        KonvertorMeny konvertor = new KonvertorMeny(vstupPouzivatela,kurz);

        Assertions.assertEquals(expectedResult,konvertor.getDolare());
    }
}

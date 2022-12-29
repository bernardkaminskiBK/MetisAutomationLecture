package javazaklady2.Webinar04_Test.part1;



import javazaklady2.Webinar04.part1.KvadratickaRovnica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class KvadratickaRovnicaTest {

    @ParameterizedTest
    @CsvSource(value = {"2,2,2,false","2,2,-4,true","5,2,3,false"})
    public void jeRiesitelnaTest(double a, double b, double c, boolean expectedResult){

        KvadratickaRovnica rovnica = new KvadratickaRovnica(a,b,c);

        //double diskriminant = (b*b) - 4 * a * c;

        Assertions.assertEquals(expectedResult,rovnica.jeRiesitelna());
    }

    @ParameterizedTest
    @CsvSource(value = {"2,2,2,NaN","2,2,-4,-2.0","5,2,-7,-1.4"})
    public void getRiesenie1Test(double a, double b, double c, double expectedResult){

        KvadratickaRovnica rovnica = new KvadratickaRovnica(a,b,c);

        Assertions.assertEquals(expectedResult,rovnica.getRiesenie1());
    }

    @ParameterizedTest
    @CsvSource(value = {"2,2,2,NaN","2,2,-4,1","5,2,-7,1"})
    public void getRiesenie2Test(double a, double b, double c, double expectedResult){

        KvadratickaRovnica rovnica = new KvadratickaRovnica(a,b,c);

        Assertions.assertEquals(expectedResult,rovnica.getRiesenie2());
    }
}

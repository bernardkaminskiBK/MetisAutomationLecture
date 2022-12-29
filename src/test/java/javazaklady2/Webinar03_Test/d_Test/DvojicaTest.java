package javazaklady2.Webinar03_Test.d_Test;

import javazaklady2.Webinar03.d.Dvojica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DvojicaTest {

    @ParameterizedTest
    @CsvSource(value = {"1.0,2.0,3.0","5.0,6.0,11.0","8.0,90.50,98.50"})
    public void dvojicaSucetTest(double prveCislo, double druheCislo, double expectedResult) {
        Dvojica dvojica = new Dvojica(prveCislo, druheCislo);
        Assertions.assertEquals(expectedResult, dvojica.getSucet());
    }

    @ParameterizedTest
    @CsvSource(value = {"1.0,2.0,-1.0","80.0,2.0,78.0","5.0,80.0,-75.0"})
    public void dvojicaRozdielTest(double prveCislo, double druheCislo, double expectedResult) {
        Dvojica dvojica = new Dvojica(prveCislo, druheCislo);
        Assertions.assertEquals(expectedResult, dvojica.getRozdiel());
    }

    @ParameterizedTest
    @CsvSource(value = {"1.0,2.0,2.0","80.0,100.0,8000.0","60.0,60.0,3600.0"})
    public void dvojicaSucinTest(double prveCislo, double druheCislo, double expectedResult) {
        Dvojica dvojica = new Dvojica(prveCislo, druheCislo);
        Assertions.assertEquals(expectedResult, dvojica.getSucin());
    }

    @ParameterizedTest
    @CsvSource(value = {"1.0,2.0,1.5","100.0,50.0,75.0","1000.0,700.0,850.0"})
    public void dvojicaPriemerTest(double prveCislo, double druheCislo, double expectedResult) {
        Dvojica dvojica = new Dvojica(prveCislo, druheCislo);
        Assertions.assertEquals(expectedResult, dvojica.getPriemer());
    }

    @ParameterizedTest
    @CsvSource(value = {"1.0,2.0,1.0","100.0,50.0,50.0","1000.0,700.0,300.0"})
    public void dvojicaVzdialenostTest(double prveCislo, double druheCislo, double expectedResult) {
        Dvojica dvojica = new Dvojica(prveCislo, druheCislo);
        Assertions.assertEquals(expectedResult, dvojica.getVzdialenost());
    }

    @ParameterizedTest
    @CsvSource(value = {"1.0,2.0,2.0","100.0,50.0,100.0","1000.0,700.0,1000.0"})
    public void dvojicaMaximumTest(double prveCislo, double druheCislo, double expectedResult) {
        Dvojica dvojica = new Dvojica(prveCislo, druheCislo);
        Assertions.assertEquals(expectedResult, dvojica.getMaximum());
    }

    @ParameterizedTest
    @CsvSource(value = {"1.0,2.0,1.0","100.0,50.0,50.0","1000.0,700.0,700.0"})
    public void dvojicaMinimumTest(double prveCislo, double druheCislo, double expectedResult) {
        Dvojica dvojica = new Dvojica(prveCislo, druheCislo);
        Assertions.assertEquals(expectedResult, dvojica.getMinimum());
    }

}

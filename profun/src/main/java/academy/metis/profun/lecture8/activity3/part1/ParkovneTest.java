package academy.metis.profun.lecture8.activity3.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ParkovneTest {

    @ParameterizedTest()
    @CsvSource(value = {"1.5,2.00", "4.0,2.50", "24.0,10.00", "3.0,2.00", "6.00,3.50"})
    public void spocitajPoplatkyTest(double hodiny, double ocakavanaHodnota) {
       double aktualnaHodnota = Parkovne.spocitajPoplatky(hodiny);

       Assertions.assertEquals(ocakavanaHodnota, aktualnaHodnota);
    }

}

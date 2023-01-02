package academy.metis.profun.Lekcia08.part2;

import academy.metis.profun.Utils.Listeners.ResultSetListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


@ExtendWith(ResultSetListener.class)
public class MocninaTest {

    @ParameterizedTest
    @CsvSource({"5,3,125", "3,4,81", "5,5,3125"})
    public void umocniTest(int cislo, int exponent, int ocakavanyVysledok) {
       int aktualnaHodnota = Mocnina.umocni(cislo, exponent);

       Assertions.assertEquals(ocakavanyVysledok, aktualnaHodnota);
    }

}

package profun.Zadanie_8_3_2_Test;

import profun.Utils.Listeners.ResultSetListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


@ExtendWith(ResultSetListener.class)
public class MocninaTest {

    @ParameterizedTest
    @CsvSource({"5,3,125", "3,4,81", "5,5,3125"})
    public void umocniTest(int cislo, int exponent, int ocakavanyVysledok) {
//        int aktualnaHodnota = sk.itvkurze.antoska.zadanie_8_3_2.Mocnina.umocni(cislo, exponent);
//        int aktualnaHodnota = sk.itvkurze.hubay.zadanie_8_3_2.Mocnina.umocni(cislo, exponent);
        int aktualnaHodnota = sk.itvkurze.mesko.zadanie_8_3_2.Mocnina.umocni(cislo, exponent);

        Assertions.assertEquals(ocakavanyVysledok, aktualnaHodnota);
    }

}

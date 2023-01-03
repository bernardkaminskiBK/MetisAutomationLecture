package academy.metis.profun.lecture8.activity3.part3;

import academy.metis.profun.Utils.Listeners.ResultSetListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@ExtendWith(ResultSetListener.class)
public class NasobokTest {

    @ParameterizedTest
    @CsvSource(value = {"2,10,true", "5,20,true", "3,696,true"})
    public void jeDelitelnyTest(int prveCislo, int druheCislo, boolean ocakavanaHodnota) {
        boolean aktualnaHodnota = Nasobok.jeDelitelne(prveCislo, druheCislo);
        Assertions.assertEquals(ocakavanaHodnota, aktualnaHodnota);
    }

    @ParameterizedTest
    @CsvSource(value = {"2,13,false", "5,19,false", "3,700,false"})
    public void nieJeDelitelnyTest(int prveCislo, int druheCislo, boolean ocakavanaHodnota) {
        boolean aktualnaHodnota = Nasobok.jeDelitelne(prveCislo, druheCislo);
        Assertions.assertEquals(ocakavanaHodnota, aktualnaHodnota);
    }
}
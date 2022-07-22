package Zadanie_8_3_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DelitelnostTest {

    @ParameterizedTest
    @CsvSource(value = {"2,10,true", "5,20,true", "3,696,true"})
    public void jeDelitelnyTest(int prveCislo, int druheCislo, boolean ocakavanaHodnota) {
        boolean aktualnaHodnota = Delitelnost.jeDelitelne(prveCislo, druheCislo);
        Assertions.assertEquals(ocakavanaHodnota, aktualnaHodnota);
    }

    @ParameterizedTest
    @CsvSource(value = {"2,13,false", "5,19,false", "3,700,false"})
    public void nieJeDelitelnyTest(int prveCislo, int druheCislo, boolean ocakavanaHodnota) {
        boolean aktualnaHodnota = Delitelnost.jeDelitelne(prveCislo, druheCislo);
        Assertions.assertEquals(ocakavanaHodnota, aktualnaHodnota);
    }
}

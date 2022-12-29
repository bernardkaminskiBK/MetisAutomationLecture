package javazaklady.lecture10.activity3.part2;

import javazaklady.lecture10.activity3.part4.Prvocislo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class PrvocisloTest {

    private Prvocislo prvocislo;

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 19})
    void zistiPrvocisloTest(int prvoCislo) {
        prvocislo = new Prvocislo(prvoCislo);
        Assertions.assertTrue(prvocislo.zistiPrvocislo());
    }

    @ParameterizedTest
    @CsvSource(value = {"2,1", "3,2", "19,8"})
    void getPoradiePrvocislaTest(int prvoCislo, int poradie) {
        prvocislo = new Prvocislo(prvoCislo);
        Assertions.assertEquals(poradie, prvocislo.getPoradiePrvocisla());
    }
}

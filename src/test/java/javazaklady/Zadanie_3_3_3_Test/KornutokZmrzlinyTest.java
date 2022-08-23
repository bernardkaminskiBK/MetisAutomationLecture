package javazaklady.Zadanie_3_3_3_Test;

import javazaklady.Zadanie_3_3_3.KornutokZmrzliny;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class KornutokZmrzlinyTest {

    @ParameterizedTest
    @CsvSource(
            value = {"5,1,5.235987755982988,16.01904224441409",
                    "10,5,261.79938779914943,175.62036827601816",
                    "8,3,75.39822368615503,80.52533819559969"}
    )
    public void objemPovrchkornutokZmrzlinyTest(double vyska, double polomer, double ocakavanaHodnotaObjemu, double ocakavanaHodnotaPorvrchu) {
        KornutokZmrzliny kornutokZmrzliny = new KornutokZmrzliny(vyska, polomer);

        Assertions.assertEquals(ocakavanaHodnotaObjemu, kornutokZmrzliny.getObjem());
        Assertions.assertEquals(ocakavanaHodnotaPorvrchu, kornutokZmrzliny.getPovrch());
    }

}

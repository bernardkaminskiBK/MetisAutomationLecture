package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_4;
import java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_4.init_blok.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ?? Neviem, či je to správne ??
 */
public class InicializacnyBlokTest {

    @ParameterizedTest
    @CsvSource(value = {"2,2"})
    void inicializacnyBlokTest(int actualResult, int expectedResult)
    {
        InicializacnyBlok inicializacnyBlok = new InicializacnyBlok();
        InicializacnyBlok inicializacnyBlok1 = new InicializacnyBlok();
        actualResult = InicializacnyBlok.getPocetVytvorenychObjektov();
        assertEquals(expectedResult, actualResult);
    }
}
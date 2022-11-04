package javazaklady.Webinar04_Test.d_Test;


import javazaklady.Webinar04.d.RozpoznavacVstupu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RozpoznavacVstupuTest {

    @ParameterizedTest
    @CsvSource(value = {"OK,true","Nie,false","Asi,false","A,true", "Áno,true", "OK,true", "iste,true","PREČO nie?,true"})
    public void jeToKladnaOdpovedTest(String vstupPouzivatela, boolean expectedResult){

        RozpoznavacVstupu vstup = new RozpoznavacVstupu(vstupPouzivatela);

        Assertions.assertEquals(expectedResult,vstup.jeToKladnaOdpoved());
    }

    @ParameterizedTest
    @CsvSource(value = {"N,true","Nie,true","Asi,false","n,true"})
    public void jeToZapornaOdpovedTest(String vstupPouzivatela, boolean expectedResult){

        RozpoznavacVstupu vstup = new RozpoznavacVstupu(vstupPouzivatela);

        Assertions.assertEquals(expectedResult,vstup.jeToZapornaOdpoved());
    }
}



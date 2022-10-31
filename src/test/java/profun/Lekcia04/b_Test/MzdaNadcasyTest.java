package profun.Lekcia04.b_Test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia04.b.MzdaNadcasy;


public class MzdaNadcasyTest {

    @ParameterizedTest
    @CsvSource(value = {"50,10,550","39,10,390","70,10,850","20,10,200"})
    public void vypocetTyzdennaMzda(int odpHodiny,int hodSadzba,double expectedResult) {

        double actualResult = MzdaNadcasy.vypocetTyzdennaMzda(odpHodiny,hodSadzba);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
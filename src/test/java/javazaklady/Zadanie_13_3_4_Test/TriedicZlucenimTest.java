package javazaklady.Zadanie_13_3_4_Test;



import javazaklady.Zadanie_13_3_4.TriedicZlucenim;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class TriedicZlucenimTest {


    @ParameterizedTest
    @CsvSource(value = {"D,B,e,A,C,'[A, B, C, D, e]'","O,v,s,j,P,'[j, O, P, s, v]'","e,e,V,u,n,'[e, e, n, u, V]'"})
    public void triedicVyberomTest(String char1,String char2,String char3,String char4,String char5,String expectedResult) {

        String[] retazce = {char1,char2,char3,char4,char5};
        TriedicZlucenim triedic = new TriedicZlucenim(retazce);
        triedic.zotried();

        String actualResult = Arrays.toString(retazce);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

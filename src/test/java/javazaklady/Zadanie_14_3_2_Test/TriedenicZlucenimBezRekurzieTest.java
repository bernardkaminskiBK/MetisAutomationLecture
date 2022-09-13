package javazaklady.Zadanie_14_3_2_Test;

import javazaklady.Zadanie_14_3_2.TriedicZlucenimBezRekurzie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class TriedenicZlucenimBezRekurzieTest {

    @ParameterizedTest
    @CsvSource(value = {"51,92,73,41,36,78,'[36, 41, 51, 73, 78, 92]'","44,85,14,63,12,5,'[5, 12, 14, 44, 63, 85]'","99,67,67,35,28,19,'[19, 28, 35, 67, 67, 99]'"})
    public void triedicVyberomTest(int cislo1,int cislo2, int cislo3,int cislo4,int cislo5,int cislo6,String expectedResult) {

        int[] pole = {cislo1,cislo2,cislo3,cislo4,cislo5,cislo6};

        TriedicZlucenimBezRekurzie.zotried(pole,6);

        String actualResult = Arrays.toString(pole);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

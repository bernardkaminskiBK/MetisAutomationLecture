package javazaklady.Zadanie_13_3_1_Test;


import javazaklady.Zadanie_13_3_1.OpacnyTriedicVyberom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class OpacnyTriedicVyberomTest {

    @ParameterizedTest
    @CsvSource(value = {"10,100,'[100, 99, 99, 96, 96, 91, 91, 84, 84, 75]'","13,500,'[500, 499, 499, 496, 496, 491, 491, 484, 484, 475, 475, 464, 451]'","20,985,'[985, 984, 984, 981, 981, 976, 976, 969, 969, 960, 960, 949, 936, 921, 904, 885, 864, 841, 816, 789]'"})
    public void zotried(int pocetCisel, int hodnota, String expectedResult){

        int[] pole = new int[pocetCisel];
        for (int i = 0; i < pocetCisel; i++)
        {
            pole[i] = hodnota - (i - 5) * (i - 5);
        }

        OpacnyTriedicVyberom opacnyTriedicVyberom = new OpacnyTriedicVyberom(pole);
        opacnyTriedicVyberom.opacneZotried();

        String actualResult = Arrays.toString(pole);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}

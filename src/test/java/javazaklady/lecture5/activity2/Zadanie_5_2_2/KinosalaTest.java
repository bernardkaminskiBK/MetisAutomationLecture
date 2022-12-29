package javazaklady.lecture5.activity2.Zadanie_5_2_2;

import javazaklady.lecture5.activity2.Zadanie_5_2_2.Kinosala;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KinosalaTest {

    @Test
    public void vytvorTest() {
        Kinosala kinosala = new Kinosala(10);
        String expectedResult = "[] \n" +
                "[] [] \n" +
                "[] [] [] \n" +
                "[] [] [] [] \n" +
                "[] [] [] [] [] \n" +
                "[] [] [] [] [] [] \n" +
                "[] [] [] [] [] [] [] \n" +
                "[] [] [] [] [] [] [] [] \n" +
                "[] [] [] [] [] [] [] [] [] \n" +
                "[] [] [] [] [] [] [] [] [] [] \n";

        String actualResult = kinosala.vytvor();
        Assertions.assertEquals(expectedResult,actualResult);
    }
}

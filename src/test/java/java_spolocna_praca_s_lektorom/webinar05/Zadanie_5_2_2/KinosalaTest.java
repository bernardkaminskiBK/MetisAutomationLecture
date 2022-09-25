package java_spolocna_praca_s_lektorom.webinar05.Zadanie_5_2_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;

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

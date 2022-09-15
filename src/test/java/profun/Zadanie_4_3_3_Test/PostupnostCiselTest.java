package profun.Zadanie_4_3_3_Test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profun.Zadanie_4_3_3.PostupnostCisel;


public class PostupnostCiselTest {

    @Test
    public void vypisPostupnostCisel() {

        String actualResult = PostupnostCisel.vypisPostupnostCisel();
        String expectedResult = "1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t";

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

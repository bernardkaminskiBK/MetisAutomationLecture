package profun.Lekcia04.part3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PostupnostCiselTest {

    @Test
    public void vypisPostupnostCisel() {

        String actualResult = PostupnostCisel.vypisPostupnostCisel();
        String expectedResult = "1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t";

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

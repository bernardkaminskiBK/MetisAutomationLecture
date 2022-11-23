package profun.Lekcia04.c_Test;


import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profun.Lekcia02.a.NasobokCisla;
import profun.Lekcia04.c.PostupnostCisel;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PostupnostCiselTest extends InputOutputStreamHelper {

    @Test
    public void vypisPostupnostCisel() {

        PostupnostCisel.main(new String[0]);
        String expectedResult = "1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t";

        assertTrue(getOutput().contains(expectedResult));
    }
}

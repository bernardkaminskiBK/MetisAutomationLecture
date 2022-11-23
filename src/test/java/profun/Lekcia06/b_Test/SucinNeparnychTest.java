package profun.Lekcia06.b_Test;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profun.Lekcia06.b.SucinNeparnychCisel;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class SucinNeparnychTest extends InputOutputStreamHelper {

    @Test
    public void sucinNeparnychCiselTest() {

        String expectedResult = "2027025";
        SucinNeparnychCisel.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
        //Assertions.assertEquals(expectedResult, actualResult);
    }

}

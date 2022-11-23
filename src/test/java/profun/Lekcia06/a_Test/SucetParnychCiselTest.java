package profun.Lekcia06.a_Test;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profun.Lekcia06.a.SucetParnychCisel;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SucetParnychCiselTest extends InputOutputStreamHelper {

    @Test
    public void sucetParnychCiselTest() {

        String expectedResult = "240";
        SucetParnychCisel.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));

       //Assertions.assertEquals(expectedResult,actualResult);

        //assertTrue(actualResult==expectedResult,"false");
    }
}

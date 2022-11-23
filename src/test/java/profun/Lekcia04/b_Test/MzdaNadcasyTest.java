package profun.Lekcia04.b_Test;


import base.InputOutputStreamHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia04.b.MzdaNadcasy;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MzdaNadcasyTest extends InputOutputStreamHelper {

    @ParameterizedTest
    @CsvSource(value = {"50,10,550,-1","39,10,390,-1","70,10,850,-1","20,10,200,-1"})
    public void vypocetTyzdennaMzda(String firstInput, String secondInput, String expectedResult, String thirdInput) {

        final String input = firstInput + " " + secondInput + " " + thirdInput;
        provideInput(input);

        MzdaNadcasy.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
    }
}

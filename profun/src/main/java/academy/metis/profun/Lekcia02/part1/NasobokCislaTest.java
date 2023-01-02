package academy.metis.profun.Lekcia02.part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NasobokCislaTest {

    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @ParameterizedTest
    @CsvSource(value = {"50,50,1", "88,50,nie je deliteľné", "33,50,nie je deliteľné"})
    public void overCisloTest(String firstInput, String secondInput, String expectedResult) {
        final String input = firstInput + " " + secondInput;
        provideInput(input);

        NasobokCisla.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(System.in);
        System.setOut(System.out);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    private String getOutput() {
        return testOut.toString();
    }

}

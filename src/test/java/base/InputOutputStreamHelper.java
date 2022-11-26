package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class InputOutputStreamHelper {

    private static final InputStream systemIn = System.in;
    private static final PrintStream systemOut = System.out;

    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterAll
    public static void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    public void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    public String getOutput() {
        return testOut.toString();
    }

}


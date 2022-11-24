package profun_spolocna_praca_s_lektorom.Lekcia4.zadanie2;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Assertions;
import profun_spolocna_praca_s_lektorom.Lekcia04.zadanie2.StavNaUcteTester;
import utils.StorePrintStream;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

/*
 * Priklad na ucinost refactoringu z StorePrintStremu na InputOutputStreamHelper
 * */
class StavNaUcteTest extends InputOutputStreamHelper {

    @Test
    public void limitNaKreditkeTest() {
//        System.setOut(new StorePrintStream(System.out));

        String input = "1000\n" + "1000\n" + "500\n" + "1000\n" + "100\n" + "-1\n";

        provideInput(input);
        StavNaUcteTester.main(new String[0]);

        Assertions.assertTrue(getOutput().contains("limit na kreditke bol prekroceny.") && getOutput().contains("1000") && getOutput().contains("100") && getOutput().contains("500"));
    }
}

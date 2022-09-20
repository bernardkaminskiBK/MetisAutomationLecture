package profun_spolocna_praca_s_lektorom.Lekcia6.zadanie2;

import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

import java.util.Scanner;

class VypocitajPriemerTest {

    @Test
    public void vypocitajPriemerTest() {
        System.setOut(new StorePrintStream(System.out));

        String input = "5\n" + "5\n" + "5\n" + "5\n" + "9999\n";
        VypocitajPriemerTester.vypocitajPriemer(new Scanner(input));

        System.out.println("\n\nactual result print: " + StorePrintStream.printlnList);
        System.out.println("actual result printf: " + StorePrintStream.printfList);
    }

}

package profun_spolocna_praca_s_lektorom.Lekcia2;

import org.junit.jupiter.api.Assertions;
import profun_spolocna_praca_s_lektorom.lekcia4.zadanie2.StavNaUcteTester;
import utils.StorePrintStream;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;


class StavNaUcteTest {

    @Test
    public void limitNaKreditkeTest() {
        System.setOut(new StorePrintStream(System.out));

        String input = "1000\n" + "1000\n" + "500\n" + "1000\n" + "100\n" + "-1\n";
        StavNaUcteTester.zistiStavNaUcte(new Scanner(input));

        System.out.println("\n\nactual result print: " + StorePrintStream.printlnList);
        System.out.println("actual result printf: " + StorePrintStream.printfList);

        List<String> printList = StorePrintStream.printlnList;
        List<String> printfList = StorePrintStream.printfList;


        if(!printList.isEmpty()) {
            Assertions.assertTrue(printList.get(0).contains("1000"));
        }

        if(!printfList.isEmpty()) {
            Assertions.assertTrue(printfList.get(0).contains("100.0"));
        }
    }

}

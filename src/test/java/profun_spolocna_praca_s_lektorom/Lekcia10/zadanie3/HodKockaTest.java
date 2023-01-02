package profun_spolocna_praca_s_lektorom.Lekcia10.zadanie3;

import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

class HodKockaTest {
    @Test
    public void zobrazTest() {
        System.setOut(new StorePrintStream(System.out));
        HodKocka.main(new String[0]);

        System.out.println("\n\nactual result print: " + StorePrintStream.printlnList);
        System.out.println("actual result printf: " + StorePrintStream.printfList);
    }
}

package java_spolocna_praca_s_lektorom.webinar10.Zadanie_10_2_3;

import org.junit.jupiter.api.Test;
import java.io.*;



import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormatovacTest {
    @Test
    void formatovacIOTest() {

        File file = new File("vystup.txt");
        assertTrue(file.exists());
    }

//    @Test
//    void formatovacTest() throws IOException {
//
//        System.setOut(new StorePrintStream(System.out));
//        Formatovac.main(new String[0]);
//
//    }
}

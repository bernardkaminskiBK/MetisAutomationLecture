package java_spolocna_praca_s_lektorom.webinar22.Zadanie22_2_6;

import java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_6.b.KrajinyStream_v2;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KrajinyTest {

    @Test
    void readFile()
    {
        File file = new File("krajiny.txt");
        assertTrue(file.exists());
    }

    @Test
    void krajinaTest() throws IOException {
        System.setOut(new StorePrintStream(System.out));
        KrajinyStream_v2.main(new String[0]);

        assertTrue(StorePrintStream.printList.get(0).contains("Rakusko"));
    }


}







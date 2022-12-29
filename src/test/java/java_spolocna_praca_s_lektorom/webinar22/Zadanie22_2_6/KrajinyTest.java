package java_spolocna_praca_s_lektorom.webinar22.Zadanie22_2_6;

import javazaklady.lecture22.activity2.Zadanie_22_2_6.part2.KrajinyStream_v2;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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

    @Test
    void krajina2Test() throws IOException {
        List<String> krajiny = Files.readAllLines(Paths.get("krajiny.txt"));
        for (String krajina : krajiny) {
            System.out.print(krajina + " ");
            assertTrue(krajiny.contains("Polsko"));
        }
    }
}







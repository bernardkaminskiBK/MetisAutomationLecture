package java_spolocna_praca_s_lektorom.webinar10.Zadanie_10_2_3;


import org.junit.jupiter.api.Test;
import java.io.File;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormatovacTest {
    @Test
    void formatovacTest() {

        File file = new File("subor.txt");
        assertTrue(file.exists());

    }
}

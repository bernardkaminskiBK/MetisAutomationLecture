package java_spolocna_praca_s_lektorom.webinar22.Zadanie22_2_6;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KrajinyTest {

    @Test
    void readFile()
    {
        File file = new File("krajiny.txt");
        assertTrue(file.exists());
    }

}

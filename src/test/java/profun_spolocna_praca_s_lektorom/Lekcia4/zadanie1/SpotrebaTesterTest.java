package profun_spolocna_praca_s_lektorom.Lekcia4.zadanie1;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Test;
import profun_spolocna_praca_s_lektorom.Lekcia04.zadanie1.SpotrebaTester;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpotrebaTesterTest extends InputOutputStreamHelper
{
    @Test
    public void SpotrebaTesterTest() {
        final String input = "70" + " " + "855" + " " + "65" + " " + "937" + " " + "-1";
        provideInput(input);

        SpotrebaTester.main(new String[0]);

        assertTrue(getOutput().contains("7.56"));
    }
}

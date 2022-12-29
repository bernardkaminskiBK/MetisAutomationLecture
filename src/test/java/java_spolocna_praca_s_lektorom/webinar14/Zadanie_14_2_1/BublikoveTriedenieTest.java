package java_spolocna_praca_s_lektorom.webinar14.Zadanie_14_2_1;

import javazaklady.lecture14.activity2.Zadanie_14_2_1.PoleUtil;
import javazaklady.lecture14.activity2.Zadanie_14_2_1.TriedicBublinkovymTriedenim;
import org.apache.commons.lang3.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BublikoveTriedenieTest {

    @Test
    public void bublinkoveTriedenieTest() {
        int[] data = PoleUtil.vygenerujPoleCisel(10, 1, 10);
        int[] pole = {10,25,6,4};
        TriedicBublinkovymTriedenim triedic = new TriedicBublinkovymTriedenim(pole);

        triedic.zotried();

        Range<Integer> myRange = Range.between(1, 10);
        for (int i = 0; i < data.length; i++) {
            Assertions.assertTrue(myRange.contains(data[i]));
        }
        Assertions.assertEquals(10,data.length);
        String actualResult = Arrays.toString(pole);
        Assertions.assertEquals("[4, 6, 10, 25]",actualResult);
    }
}

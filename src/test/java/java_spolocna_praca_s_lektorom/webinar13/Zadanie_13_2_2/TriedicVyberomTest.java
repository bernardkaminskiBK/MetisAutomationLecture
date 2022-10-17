package java_spolocna_praca_s_lektorom.webinar13.Zadanie_13_2_2;

import java_spolocna_praca_s_lektorom.webinar13.Zadanie_13_2_1.Stopky;
import java_spolocna_praca_s_lektorom.webinar13.Zadanie_13_2_2.a.PoleUtil;
import java_spolocna_praca_s_lektorom.webinar13.Zadanie_13_2_2.a.TriedicVyberom;
import org.apache.commons.lang3.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class TriedicVyberomTest {

    @Test
    public void triedicVyberomTest() {
        int[] data = PoleUtil.vygenerujPoleCisel(10,1,10);
        int[] pole = {10,25,6,4};
        TriedicVyberom triedic = new TriedicVyberom(pole);
        triedic.zotried();
        Stopky stopky = new Stopky();
        stopky.spust();//individualna hodnota zavisi od PC

        Range<Integer> myRange = Range.between(1, 10);
        for (int i = 0; i < data.length; i++) {
            Assertions.assertTrue(myRange.contains(data[i]));
        }
        Assertions.assertEquals(10,data.length);
        String actualResult = Arrays.toString(pole);
        Assertions.assertEquals("[4, 6, 10, 25]",actualResult);

        stopky.zastav();
        System.out.println(stopky.getUplynulyCas());
    }
}

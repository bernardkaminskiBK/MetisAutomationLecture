package profun_spolocna_praca_s_lektorom.Lekcia10.zadanie3;

import org.junit.jupiter.api.Test;
import profun_spolocna_praca_s_lektorom.Lekcia10.zadanie3.HodKocka;

class HodKockaTest {
    @Test
    public void zobrazTest()
    {
        int [] sucty = {2, 5, 8, 11, 9, 4, 3, 6, 9, 10, 7, 12, 7};
        int[] ocakavaneHodnoty = {0, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        //profun_spolocna_praca_s_lektorom.Lekcia10.zadanie3.HodKocka.zobraz(sucty, ocakavaneHodnoty);

        System.out.println(HodKocka.zobraz(sucty, ocakavaneHodnoty));
    }
}

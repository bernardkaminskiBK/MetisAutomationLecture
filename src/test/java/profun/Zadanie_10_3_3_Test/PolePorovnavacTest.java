package profun.Zadanie_10_3_3_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profun.Zadanie_10_3_3.PolePorovnavac;

public class PolePorovnavacTest {
    //hocico

    @Test
    public void poliaZhodneTest() {
        int[] prvePole = {1, 2, 3, 4, 5};
        int[] druhePole = {1, 2, 3, 4, 5};

        boolean actualResult = PolePorovnavac.suPoliaZhodne(prvePole, prvePole.length, druhePole, druhePole.length);

        Assertions.assertTrue(actualResult);
    }

    @Test
    public void poliaNezhodneTest() {
        int[] prvePole = {12, 2, 3, 4, 5};
        int[] druhePole = {1, 22, 31, 400, 455, 3, 1};

        boolean actualResult = PolePorovnavac.suPoliaZhodne(prvePole, prvePole.length, druhePole, druhePole.length);

        Assertions.assertFalse(actualResult);
    }

}

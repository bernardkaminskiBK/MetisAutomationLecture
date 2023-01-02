package academy.metis.profun.Lekcia10.part3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PolePorovnavacTest {

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

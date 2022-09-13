package javazaklady.Zadanie_15_3_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZasobnikTesterTest {

    private Zasobnik zasobnik;

    @BeforeEach
    public void setUp() {
        zasobnik = new Zasobnik();

        for (int i = 1; i <= 1000; i++) {
            zasobnik.vloz(i);
        }
        for (int i = 1; i <= 500; i++) {
            zasobnik.vyber();
        }
    }

    @Test
    public void vyberZasobnikTest() {
        Assertions.assertEquals(500, zasobnik.vyber());
    }

    @Test
    public void prvokNaVrcholeZasobnikTest() {
        zasobnik.vyber();
        Assertions.assertEquals(499, zasobnik.prvokNaVrchole());
    }

    @Test
    public void getVelkostZasobnikTest() {
        zasobnik.vyber();
        Assertions.assertEquals(499, zasobnik.getVelkost());
    }

    @Test
    public void jePrazdnyZasobnikTest() {
        while (!zasobnik.jePrazdny()) {
            zasobnik.vyber();
        }

        Assertions.assertEquals(0, zasobnik.getVelkost());
    }

}

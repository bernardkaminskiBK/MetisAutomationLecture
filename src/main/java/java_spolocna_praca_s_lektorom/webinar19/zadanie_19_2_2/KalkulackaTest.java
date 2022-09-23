package java_spolocna_praca_s_lektorom.webinar19.zadanie_19_2_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KalkulackaTest
{
    private Kalkulacka kalkulacka = new Kalkulacka();

    @Test
    public void testVyhodnoteniaKonstatnehoVyrazu()
    {
        int vysledok = kalkulacka.vyhodnot("11");
        Assertions.assertEquals(11, vysledok, "Vysleok by mal byt 11");
    }

    @Test
    public void testSuctuDvochCisel()
    {
        int vysledok = kalkulacka.vyhodnot("1 + 2");
        Assertions.assertEquals(3, vysledok, "Vysledok by mal byt 3");
    }

    @Test
    public void testRozdielu()
    {
        int vysledok = kalkulacka.vyhodnot("1 - 2");
        Assertions.assertEquals(-1, vysledok, "Vysledok by mal byt -1");
    }

    @Test
    public void testZlozitejsiehoVyrazu()
    {
        int vysledok = kalkulacka.vyhodnot("1 - 3 + 2 + 4");
        Assertions.assertEquals(4, vysledok, "Vysledok by mal byt 4");
    }
}

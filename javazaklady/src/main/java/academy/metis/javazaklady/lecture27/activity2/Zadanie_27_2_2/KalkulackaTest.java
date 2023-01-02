package academy.metis.javazaklady.lecture27.activity2.Zadanie_27_2_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KalkulackaTest {

    private Kalkulacka kalkulacka = new Kalkulacka();

    @Test
    public void testSuctu()
    {
        int ocakavanyVysledok = 11;
        int skutocnyVysledok = kalkulacka.spocitaj(5,6);
        Assertions.assertEquals(ocakavanyVysledok,skutocnyVysledok,"Sucet by mal byt 11");
    }

    @Test
    public void testRozdielu()
    {
        int ocakavanyVysledok = 7;
        int skutocnyVysledok = kalkulacka.odcitaj(11, 4);
        Assertions.assertEquals(ocakavanyVysledok,skutocnyVysledok, "Rozdiel by mal byt 11");
    }
}

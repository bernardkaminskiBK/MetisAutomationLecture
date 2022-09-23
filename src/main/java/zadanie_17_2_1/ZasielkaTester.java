package zadanie_17_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZasielkaTester
{
    private Zasielka zasielka = new Zasielka();

    @Test
    public void testPridaniaVyrobkov()
    {
        zasielka.pridaj(Sklad.dvere);
        zasielka.pridaj(Sklad.okno);

        //assertThat(zasielka, contains(Sklad.dvere, Sklad.okno));
    }
}

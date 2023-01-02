package academy.metis.javazaklady.lecture17.activity2.Zadanie_17_2_1;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ZasielkaTester
{
    private Zasielka zasielka = new Zasielka();

    public ZasielkaTester()
    {
        System.out.println("... zavolal sa konstruktor: ZasielkaTester()");
    }

    @Test
    public void testPridaniaVyrobkov()
    {
        zasielka.pridaj(Sklad.dvere);
        zasielka.pridaj(Sklad.okno);

        assertThat(zasielka, Matchers.contains(Sklad.dvere, Sklad.okno));
    }

    @Test
    public void testNahradeniaExistujucehoVyrobku()
    {
        zasielka.pridaj(Sklad.dvere);
        zasielka.pridaj(Sklad.okno);

        zasielka.nahrad(Sklad.dvere, Sklad.dlazobnaKocka);

        assertThat(zasielka, Matchers.contains(Sklad.dlazobnaKocka, Sklad.okno));
    }

    @Test
    public void testNahradeniaNeexistujucehoVyrobku()
    {
        zasielka.pridaj(Sklad.dvere);
        zasielka.pridaj(Sklad.okno);

        zasielka.nahrad(Sklad.dlazobnaKocka, Sklad.dvere);

        assertThat(zasielka, Matchers.contains(Sklad.dvere, Sklad.okno));
    }

    @Test
    public void testRozdeleniaVyrobkov()
    {
        zasielka.pridaj(Sklad.dvere);
        zasielka.pridaj(Sklad.okno);
        zasielka.pridaj(Sklad.dlazobnaKocka);

        zasielka.priprav();

        assertThat(zasielka.getLahkeVyrobky(), Matchers.contains(Sklad.dlazobnaKocka, Sklad.dvere));
        assertThat(zasielka.getTazkeVyrobky(), Matchers.contains(Sklad.okno));
    }
}

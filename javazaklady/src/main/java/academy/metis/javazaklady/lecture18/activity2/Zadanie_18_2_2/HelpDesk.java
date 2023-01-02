package academy.metis.javazaklady.lecture18.activity2.Zadanie_18_2_2;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk
{
    private final Queue<Poziadavka> poziadavky = new ArrayDeque<>();

    public void zaevidujPoziadavku(final Zakaznik zakaznik, final Kategoria kategoria)
    {
        poziadavky.add(new Poziadavka(zakaznik, kategoria));
    }

    // pouziva metodu poll()
    public void spracujVsetkyPoziadavky()
    {
        Poziadavka poziadavka;

        while ((poziadavka = poziadavky.poll()) != null)
        {
            poziadavka.getZakaznik().posliSpravu("Skusili ste dane zariadenie vypnut a zapnut?");
        }
    }

    // pouziva metodu remove()
    public void spracujVsetkyPoziadavky2()
    {
        while (!poziadavky.isEmpty())
        {
            final Poziadavka poziadavka = poziadavky.remove();
            poziadavka.getZakaznik().posliSpravu("Skusili ste dane zariadenie vypnut a zapnut?");
        }
    }

    public static void main(String[] args)
    {
        HelpDesk helpDesk = new HelpDesk();

        helpDesk.zaevidujPoziadavku(Zakaznik.PISTA, Kategoria.TELEFON);
        helpDesk.zaevidujPoziadavku(Zakaznik.KAROL, Kategoria.TLACIAREN);
        helpDesk.zaevidujPoziadavku(new Zakaznik("Jozef"), Kategoria.TABLET);
        helpDesk.zaevidujPoziadavku(Zakaznik.KATKA, Kategoria.POCITAC);

        // helpDesk.spracujVsetkyPoziadavky();
        helpDesk.spracujVsetkyPoziadavky2();
    }
}

package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_2.fronta;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk
{
    private final Queue<fronta.Poziadavka> poziadavky = new ArrayDeque<>();

    public void zaevidujPoziadavku(final Zakaznik zakaznik, final Kategoria kategoria)
    {
        poziadavky.add(new fronta.Poziadavka(zakaznik, kategoria));
    }

    // pouziva metodu poll()
    public void spracujVsetkyPoziadavky()
    {
        fronta.Poziadavka poziadavka;

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
            final fronta.Poziadavka poziadavka = poziadavky.remove();
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

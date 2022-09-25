package java_spolocna_praca_s_lektorom.webinar19.zadanie_19_2_1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioritnyHelpDesk
{
    private static final Comparator<Poziadavka> PODLA_KATEGORIE = new Comparator<Poziadavka>() {
        @Override
        public int compare(Poziadavka p1, Poziadavka p2) {
            return p1.getKategoria().compareTo(p2.getKategoria());
        }
    };

    private final Queue<Poziadavka> poziadavky = new PriorityQueue<>(PODLA_KATEGORIE);

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
        PrioritnyHelpDesk helpDesk = new PrioritnyHelpDesk();

        helpDesk.zaevidujPoziadavku(Zakaznik.PISTA, Kategoria.TELEFON);
        helpDesk.zaevidujPoziadavku(Zakaznik.KAROL, Kategoria.TLACIAREN);
        helpDesk.zaevidujPoziadavku(new Zakaznik("Jozef"), Kategoria.TABLET);
        helpDesk.zaevidujPoziadavku(Zakaznik.KATKA, Kategoria.POCITAC);

        helpDesk.spracujVsetkyPoziadavky2();
    }
}

package academy.metis.javazaklady.lecture19.activity2.Zadanie_19_2_1.part1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class KategorizovanyHelpDesk
{
    private final Queue<Poziadavka> poziadavky = new ArrayDeque<>();

    public void zaevidujPoziadavku(final Zakaznik zakaznik, final Kategoria kategoria)
    {
        poziadavky.add(new Poziadavka(zakaznik, kategoria));
    }

    public void spracujPoziadavkuTlaciaren()
    {
//        Predicate<Poziadavka> kriteriumTlaciaren = new Predicate<Poziadavka>()
//        {
//            @Override
//            public boolean test(Poziadavka poziadavka) {
//                return poziadavka.getKategoria() == Kategoria.TLACIAREN;
//            }
//        };

        spracujPoziadavku(poziadavka -> poziadavka.getKategoria() == Kategoria.TLACIAREN,
                "Nedosiel vam nahodou v tlaciarni papier?");
    }

    public void spracujVseobecnuPoziadavku()
    {
        spracujPoziadavku(poziadavka -> poziadavka.getKategoria() != Kategoria.TLACIAREN,
                "Skusili ste dane zariadenie vypnut a zapnut?");
    }

    // predikat - vlastnost, podmienka, poziadavka, kriterium
    private void spracujPoziadavku(Predicate<Poziadavka> kriterium, String sprava)
    {
        Poziadavka poziadavka = poziadavky.peek();      // peek neodstrani poziadavku z fronty

        if (poziadavka != null && kriterium.test(poziadavka))
        {
            poziadavky.remove();        // odstranim z fronty poziadavku, ktora bola na rade
            poziadavka.getZakaznik().posliSpravu(sprava);
        }
        else
        {
            System.out.println("Nemam co robit, netyka sa ma to. Idem na kavicku ... :-)");
        }
    }

    public static void main(String[] args)
    {
        KategorizovanyHelpDesk helpDesk = new KategorizovanyHelpDesk();

        helpDesk.zaevidujPoziadavku(Zakaznik.PISTA, Kategoria.TELEFON);
        helpDesk.zaevidujPoziadavku(Zakaznik.KAROL, Kategoria.TLACIAREN);

        helpDesk.spracujPoziadavkuTlaciaren();
        helpDesk.spracujVseobecnuPoziadavku();
        helpDesk.spracujPoziadavkuTlaciaren();
    }
}

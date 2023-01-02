package academy.metis.javazaklady.lecture18.activity2.Zadanie_18_2_2;

public class Zakaznik
{
    public static final Zakaznik KAROL = new Zakaznik("Karol");
    public static final Zakaznik PISTA = new Zakaznik("Pista");
    public static final Zakaznik KATKA = new Zakaznik("Katka");

    private final String meno;

    public Zakaznik(final String meno)
    {
        this.meno = meno;
    }

    public void posliSpravu(final String sprava)
    {
        System.out.printf("%s: %s%n", meno, sprava);
    }
}

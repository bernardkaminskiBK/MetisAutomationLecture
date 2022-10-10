package java_spolocna_praca_s_lektorom.webinar19.zadanie_19_2_1.b;

public class Zakaznik
{
    public static final Zakaznik KAROL = new Zakaznik("Karol");
    public static final Zakaznik PISTA = new Zakaznik("Pista");
    public static final Zakaznik KATKA = new Zakaznik("Katka");

    private final String meno;

    public Zakaznik(String meno)
    {
        this.meno = meno;
    }

    public void posliSpravu(final String sprava)
    {
        System.out.printf("%s: %s%n", meno, sprava);
    }
}

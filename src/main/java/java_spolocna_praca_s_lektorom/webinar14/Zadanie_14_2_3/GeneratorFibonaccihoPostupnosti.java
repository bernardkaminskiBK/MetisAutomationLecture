package java_spolocna_praca_s_lektorom.webinar14.Zadanie_14_2_3;

public class GeneratorFibonaccihoPostupnosti
{
    public int n;

    public GeneratorFibonaccihoPostupnosti(int n)
    {
        this.n = n;
    }

    public long dalsieCislo()
    {
        long predchadzajuciVysledok = 0;
        long aktualnyVysledok = 1;
        long novyVysledok;
        for (int i = 1; i < n; i++)
        {
            novyVysledok = predchadzajuciVysledok + aktualnyVysledok;
            predchadzajuciVysledok = aktualnyVysledok;
            aktualnyVysledok = novyVysledok;
        }
        return aktualnyVysledok;
    }
}

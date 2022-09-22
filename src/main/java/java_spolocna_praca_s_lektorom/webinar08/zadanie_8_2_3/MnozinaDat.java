package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_3;

public class MnozinaDat
{
    private Meratelny maximum;
    private Meratelny minimum;
    private int pocetPrvkov;
    private double sucet;

    public void pridajPrvok(Meratelny minca)
    {
        double zostatok = minca.getMiera();
        sucet += zostatok;

        if (pocetPrvkov == 0 || zostatok > maximum.getMiera())
        {
            maximum = minca;
        }

        if (pocetPrvkov == 0 || zostatok < minimum.getMiera())
        {
            minimum = minca;
        }

        pocetPrvkov ++;
    }

    public Meratelny getMaximum()
    {
        return maximum;
    }

    public Meratelny getMinimum()
    {
        return minimum;
    }

    public double getPriemer()
    {
        if (pocetPrvkov == 0)
        {
            return 0;
        }
        return sucet / pocetPrvkov;
    }
}

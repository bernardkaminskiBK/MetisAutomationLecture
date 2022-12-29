package javazaklady2.Webinar08.part3;

public class MnozinaDat
{
    private Osoba maxOsoba;
    private double sucetVysok;
    private double pocetOsob = 0;

    public void pridaj(Osoba osoba)
    {
        sucetVysok += osoba.getVyska();

        if (pocetOsob == 0 || osoba.getVyska() > maxOsoba.getVyska())
        {
            maxOsoba = osoba;
        }

        pocetOsob++;
    }

    public double getPriemer()
    {
        return sucetVysok / pocetOsob;
    }

    public Osoba getMaxOsoba()
    {
        return maxOsoba;
    }

}

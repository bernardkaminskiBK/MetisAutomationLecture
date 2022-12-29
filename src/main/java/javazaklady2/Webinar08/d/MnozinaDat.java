package javazaklady2.Webinar08.d;

public class MnozinaDat
{
    private double priemer;
    private int maxCislo;
    private int minCislo;
    private double sucetCisel = 0;
    private double pocetHodov = 0;

    public void pridaj(Kocka kocka)
    {
        sucetCisel += kocka.getHodeneCislo();
        if (pocetHodov == 0 || kocka.getHodeneCislo() > maxCislo)
        {
            maxCislo = kocka.getHodeneCislo();
        }
        if (pocetHodov == 0 || kocka.getHodeneCislo() < minCislo)
        {
            minCislo = kocka.getHodeneCislo();
        }
        pocetHodov++;
    }

    public double getPriemer()
    {
        priemer = sucetCisel / pocetHodov;
        return priemer;
    }

    public int getMaxCislo()
    {
        return maxCislo;
    }

    public int getMinCislo()
    {
        return minCislo;
    }
}

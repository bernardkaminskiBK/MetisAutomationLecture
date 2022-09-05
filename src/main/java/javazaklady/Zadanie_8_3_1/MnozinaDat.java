package javazaklady.Zadanie_8_3_1;

public class MnozinaDat
{
    private double priemer;
    private double sucetCisel = 0;
    private double pocetHodov = 0;

    public void pridaj(Kocka kocka)
    {
        sucetCisel += kocka.getHodeneCislo();
        pocetHodov++;
    }

    public double getPriemer()
    {
        priemer = sucetCisel / pocetHodov;
        return priemer;
    }
}

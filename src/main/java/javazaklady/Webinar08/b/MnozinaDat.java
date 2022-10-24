package javazaklady.Webinar08.b;

public class MnozinaDat
{
    private Kviz najlepsiKviz;
    private int pocetKvizov = 0;
    private int sucetPercent;

    public void pridaj(Kviz kviz)
    {
       sucetPercent += kviz.getPrecenta();
       if (pocetKvizov == 0 || kviz.getPrecenta() > najlepsiKviz.getPrecenta())
       {
           najlepsiKviz = kviz;
       }
        pocetKvizov++;
    }

    public double getPriemer()
    {
       return sucetPercent / pocetKvizov;
    }

    public Kviz getMaximum()
    {
        return najlepsiKviz;
    }
}

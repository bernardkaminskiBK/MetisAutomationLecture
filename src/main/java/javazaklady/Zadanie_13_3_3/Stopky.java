package javazaklady.Zadanie_13_3_3;


public class Stopky
{
    private boolean suSpustene;
    private long casSpustenia;
    private long uplynulyCas;

    public Stopky()
    {
        vynuluj();
    }

    private void vynuluj()
    {
        suSpustene = false;
        casSpustenia = uplynulyCas = 0;
    }

    public void spust()
    {
        if(suSpustene)
        {
            return;
        }

        suSpustene = true;
        casSpustenia = System.currentTimeMillis();
    }

    public void zastav()
    {
        if (!suSpustene)
        {
            return;
        }

        suSpustene = false;
        long casZastavenia = System.currentTimeMillis();
        uplynulyCas = uplynulyCas + (casZastavenia - casSpustenia);
    }

    public long getUplynulyCas()
    {
        if (suSpustene)
        {
            long casZastavenia = System.currentTimeMillis();
            return uplynulyCas = (casZastavenia - casSpustenia);
        }
        else
        {
            return uplynulyCas;
        }
    }
}

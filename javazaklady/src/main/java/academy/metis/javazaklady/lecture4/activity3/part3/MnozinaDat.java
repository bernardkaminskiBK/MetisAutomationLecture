package academy.metis.javazaklady.lecture4.activity3.part3;

public class MnozinaDat
{
    public double cislo1;
    public double cislo2;
    public double cislo3;

    public MnozinaDat(double cislo1, double cislo2, double cislo3)
    {
        this.cislo1 = cislo1;
        this.cislo2 = cislo2;
        this.cislo3 = cislo3;
    }

    public double getNajmensie()
    {
        double minimum;
        if (cislo1 < cislo2 && cislo1 < cislo3)
        {
            minimum = cislo1;
        }
        else if (cislo2 < cislo1 && cislo2 < cislo3)
        {
            minimum = cislo2;
        }
        else
        {
            minimum = cislo3;
        }
        return minimum;
    }
    public double getProstredne()
    {
        double prostredne;
        if ((cislo2 < cislo1 && cislo1 < cislo3) || (cislo3 < cislo1 && cislo1 < cislo2))
        {
            prostredne = cislo1;
        }

        else if ((cislo1 < cislo2 && cislo2 < cislo3) || (cislo3 < cislo2 && cislo2 < cislo1))
        {
            prostredne = cislo2;
        }
        else
        {
            prostredne = cislo3;
        }
        return prostredne;
    }
    public double getNajvacsie()
    {
        double maximum;
        if (cislo1 > cislo2 && cislo1 > cislo3)
        {
            maximum = cislo1;
        }
        else if (cislo2 > cislo1 && cislo2 > cislo3)
        {
            maximum = cislo2;
        }
        else
        {
            maximum = cislo3;
        }
        return maximum;
    }
}

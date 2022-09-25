package java_spolocna_praca_s_lektorom.webinar21.zadanie_21_2_2;

public class Oslovovac
{
    public void pozdrav(Oslovenie oslovenie)
    {
        oslovenie.zrealizuj();
    }

    public static void main(String[] args)
    {
        Oslovovac oslovovac = new Oslovovac();

        Oslovenie ahoj = new OslovenieAhoj();
        oslovovac.pozdrav(ahoj);

        Oslovenie nazdar = new OslovenieNazdar();
        oslovovac.pozdrav(nazdar);

        Oslovenie dobryDen = new OslovenieDobryDen();
        oslovovac.pozdrav(dobryDen);
    }
}

class OslovenieAhoj implements Oslovenie
{
    @Override
    public void zrealizuj()
    {
        System.out.println("Ahoj!");
    }
}

class OslovenieDobryDen implements Oslovenie
{
    @Override
    public void zrealizuj()
    {
        System.out.println("Dobry den!");
    }
}

class OslovenieNazdar implements Oslovenie
{
    @Override
    public void zrealizuj()
    {
        System.out.println("Nazdar!");
    }
}

interface Oslovenie
{
    void zrealizuj();
}

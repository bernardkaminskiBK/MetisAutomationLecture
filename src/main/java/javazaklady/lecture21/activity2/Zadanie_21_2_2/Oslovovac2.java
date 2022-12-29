package javazaklady.lecture21.activity2.Zadanie_21_2_2;

public class Oslovovac2
{
    public void pozdrav(Oslovenie oslovenie)
    {
        oslovenie.zrealizuj();
    }

    public static void main(String[] args)
    {
        Oslovovac2 oslovovac = new Oslovovac2();

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

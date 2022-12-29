package javazaklady.lecture21.activity2.Zadanie_21_2_3;

public class Oslovovac3
{
    public void pozdrav(Oslovenie oslovenie)
    {
        oslovenie.zrealizuj();
    }

    public static void main(String[] args)
    {
        Oslovovac3 oslovovac = new Oslovovac3();

        oslovovac.pozdrav(() -> System.out.println("Ahoj!"));
        oslovovac.pozdrav(() -> System.out.println("Nazdar!"));
        oslovovac.pozdrav(() -> System.out.println("Dobry den!"));
    }
}

interface Oslovenie
{
    void zrealizuj();
}
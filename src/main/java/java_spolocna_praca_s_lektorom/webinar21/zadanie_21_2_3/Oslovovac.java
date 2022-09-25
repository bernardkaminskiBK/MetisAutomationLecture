package java_spolocna_praca_s_lektorom.webinar21.zadanie_21_2_3;

public class Oslovovac
{
    public void pozdrav(Oslovenie oslovenie)
    {
        oslovenie.zrealizuj();
    }

    public static void main(String[] args)
    {
        Oslovovac oslovovac = new Oslovovac();

        oslovovac.pozdrav(() -> System.out.println("Ahoj!"));
        oslovovac.pozdrav(() -> System.out.println("Nazdar!"));
        oslovovac.pozdrav(() -> System.out.println("Dobry den!"));
    }
}

interface Oslovenie
{
    void zrealizuj();
}
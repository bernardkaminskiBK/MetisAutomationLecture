package academy.metis.javazaklady.lecture8.activity2.zadanie_8_2_3;

public class Minca implements Meratelny
{
    private String nazov;
    private double hodnota;

    public Minca(String nazov, double hodnota)
    {
        this.nazov = nazov;
        this.hodnota = hodnota;
    }

    public String getNazov()
    {
        return nazov;
    }

    public double getHodnota()
    {
        return hodnota;
    }

    @Override
    public double getMiera()
    {
        return hodnota;
    }
}

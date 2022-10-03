package javazaklady.Webinar14.Zadanie_14_3_1;

public class Minca
{
    private double hodnota;
    private String nazov;

    public Minca(double hodnota, String nazov)
    {
        this.hodnota = hodnota;
        this.nazov = nazov;
    }

    public double getHodnota()
    {
        return hodnota;
    }

    public String getNazov()
    {
        return nazov;
    }

    public String toString()
    {
        return "Minca [hodnota=" + hodnota + ", nazov=" + nazov + "]";
    }
}

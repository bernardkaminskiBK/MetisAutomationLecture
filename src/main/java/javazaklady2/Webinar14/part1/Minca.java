package javazaklady2.Webinar14.part1;

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

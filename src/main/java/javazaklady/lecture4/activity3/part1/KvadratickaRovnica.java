package javazaklady.lecture4.activity3.part1;

public class KvadratickaRovnica
{
    private double a;
    private double b;
    private double c;

    public KvadratickaRovnica(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean jeRiesitelna()
    {
        double diskriminant;
        diskriminant = (b * b) - (4 * a * c);

        if (diskriminant >= 0)
        {
            return true;
        }
        return false;
    }

    public double getRiesenie1()
    {
        double diskriminant = (b * b) - (4 * a * c);
        double mensiKoren;

        mensiKoren = (-b - Math.sqrt(diskriminant)) / (2 * a);
        return mensiKoren;

    }

    public double getRiesenie2()
    {
        double diskriminant = (b * b) - (4 * a * c);
        double vacsiKoren;

        vacsiKoren = (-b + Math.sqrt(diskriminant)) / (2 * a);
        return vacsiKoren;
    }

}

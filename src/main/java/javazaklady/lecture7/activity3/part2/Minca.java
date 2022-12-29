package javazaklady.lecture7.activity3.part2;

public class Minca
{
    private String nazovMince;
    private double hodnotaMince;

    public Minca(String nazovMince, double hodnotaMince)
    {
        this.nazovMince = nazovMince;
        this.hodnotaMince = hodnotaMince;
    }

    public double getHodnota()
    {
        return hodnotaMince;
    }

    public String getNazovMince()
    {
        return nazovMince;
    }
}

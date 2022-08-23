package javazaklady.Zadanie_3_3_3;

public class KornutokZmrzliny {

    private final double vyska;
    private final double polomer;

    public KornutokZmrzliny(double vyska, double polomer)
    {
        this.vyska = vyska;
        this.polomer = polomer;
    }

    public double getObjem()
    {
        return 1/3.0 * Math.PI * polomer * polomer * vyska;
    }

    public double getPovrch()
    {
        double s = Math.sqrt((polomer * polomer) + (vyska * vyska));
        return Math.PI * polomer * s;
    }

}

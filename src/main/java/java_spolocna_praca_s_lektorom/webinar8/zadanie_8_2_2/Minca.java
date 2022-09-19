package java_spolocna_praca_s_lektorom.webinar8.zadanie_8_2_2;

public class Minca
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
}

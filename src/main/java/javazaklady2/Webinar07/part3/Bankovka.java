package javazaklady2.Webinar07.part3;

public class Bankovka
{
    public String nazovBankovky;
    public double hodnotaBankovky;

    public Bankovka(String nazovBankovky, double hodnotaBankovky)
    {
        this.nazovBankovky = nazovBankovky;
        this.hodnotaBankovky = hodnotaBankovky;
    }

    public double getHodnotaBankovky()
    {
        return hodnotaBankovky;
    }

    public String getNazovBankovky()
    {
        return nazovBankovky;
    }


}

package javazaklady.lecture25.activity2.Zadanie_25_2_1;

import java.util.EventObject;

public class FormularUdalost extends EventObject
{
    private String meno;
    private String zamestnanie;
    private String vekovaKategoria;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public FormularUdalost(Object source, String meno, String zamestnanie, String vekovaKategoria)
    {
        super(source);
        this.meno = meno;
        this.zamestnanie = zamestnanie;
        this.vekovaKategoria = vekovaKategoria;
    }

    public String getMeno()
    {
        return meno;
    }

    public String getZamestnanie()
    {
        return zamestnanie;
    }

    public String getVekovaKategoria()
    {
        return vekovaKategoria;
    }
}

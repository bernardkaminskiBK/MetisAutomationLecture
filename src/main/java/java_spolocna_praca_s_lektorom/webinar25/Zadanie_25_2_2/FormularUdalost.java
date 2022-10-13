package java_spolocna_praca_s_lektorom.webinar25.Zadanie_25_2_2;

import java.util.EventObject;

public class FormularUdalost extends EventObject
{
    private String meno;
    private String zamestnanie;
    private int vekKatID;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public FormularUdalost(Object source, String meno, String zamestnanie, int vekKatID)
    {
        super(source);
        this.meno = meno;
        this.zamestnanie = zamestnanie;
        this.vekKatID = vekKatID;
    }

    public String getMeno()
    {
        return meno;
    }

    public String getZamestnanie()
    {
        return zamestnanie;
    }

    public int getVekKatID()
    {
        return vekKatID;
    }
}

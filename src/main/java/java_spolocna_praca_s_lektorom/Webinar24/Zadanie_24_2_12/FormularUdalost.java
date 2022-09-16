package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_12;

import java.util.EventObject;

public class FormularUdalost extends EventObject {
    private String meno;
    private String zamestnanie;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public FormularUdalost(Object source, String meno, String zamestnanie) {
        super(source);
        this.meno = meno;
        this.zamestnanie = zamestnanie;
    }

    public String getMeno() {
        return meno;
    }

    public String getZamestnanie() {
        return zamestnanie;
    }
}

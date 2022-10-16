package java_spolocna_praca_s_lektorom.webinar25.Zadanie_25_2_2;

public class VekovaKategoria
{
    private int id;
    private String nazov;

    public VekovaKategoria(int id, String nazov)
    {
        this.id = id;
        this.nazov = nazov;
    }

    public int getId()
    {
        return id;
    }

    public String getnazov()
    {
        return nazov;
    }

    // TODO: dopln chybajucu metodu toString()

    @Override
    public String toString()
    {
        return nazov;
    }
}

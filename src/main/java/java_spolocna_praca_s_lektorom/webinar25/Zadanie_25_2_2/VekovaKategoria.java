package java_spolocna_praca_s_lektorom.webinar25.Zadanie_25_2_2;

public class VekovaKategoria
{
    private int id;
    private String mazov;

    public VekovaKategoria(int id, String mazov)
    {
        this.id = id;
        this.mazov = mazov;
    }

    public int getId()
    {
        return id;
    }

    public String getMazov()
    {
        return mazov;
    }

    // TODO: dopln chybajucu metodu toString()

    @Override
    public String toString()
    {
        return mazov;
    }
}

package java_spolocna_praca_s_lektorom.webinar14.faktor_generator;

public class FaktorGenerator
{
    public int cislo;

    public FaktorGenerator(int cislo)
    {
        this.cislo = cislo;
    }

    public int dalsiFaktor()
    {
        if (existujeDalsiFaktor())
        {
            for (int i = 2; i <= cislo; i++)
            {
                if (cislo % i == 0)
                {

                    cislo = cislo / i;
                    return i;
                }
            }
        }
        return 0;
    }
    public boolean existujeDalsiFaktor()
    {
        for (int i = 2; i <= cislo; i++)
        {
            if (cislo % i == 0)
            {
                return true;
            }
        }
        return false;
    }
}

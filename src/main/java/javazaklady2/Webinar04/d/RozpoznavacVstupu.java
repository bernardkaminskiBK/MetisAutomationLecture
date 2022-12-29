package javazaklady2.Webinar04.d;

import java.util.Locale;

public class RozpoznavacVstupu
{
    public String vstupPouzivatela;

    public RozpoznavacVstupu(String vstupPouzivatela)
    {
        this.vstupPouzivatela = vstupPouzivatela;
    }

    public boolean jeToKladnaOdpoved()
    {
        boolean jeKladna = false;
        String kladna1 = "a";
        String kladna2 = "ano";
        String kladna3 = "á";
        String kladna4 = "áno";
        String kladna5 = "ok";
        String kladna6 = "iste";
        String kladna7 = "preco nie?";
        String kladna8 = "prečo nie?";

        String vstupPouzivatelaMale = vstupPouzivatela.toLowerCase(Locale.ROOT);
        if (kladna1.equals(vstupPouzivatelaMale) || kladna2.equals(vstupPouzivatelaMale) || kladna3.equals(vstupPouzivatelaMale) || kladna4.equals(vstupPouzivatelaMale) || kladna5.equals(vstupPouzivatelaMale) || kladna6.equals(vstupPouzivatelaMale) || kladna7.equals(vstupPouzivatelaMale) || kladna8.equals(vstupPouzivatelaMale))
        {
            jeKladna = true;
        }
        return jeKladna;
    }
    public boolean jeToZapornaOdpoved()
    {
        boolean jeZaporna = false;
        String zaporna1 = "n";
        String zaporna2 = "nie";
        String vstupPouzivatelaMale = vstupPouzivatela.toLowerCase(Locale.ROOT);
        if (zaporna1.equals(vstupPouzivatelaMale) || zaporna2.equals(vstupPouzivatelaMale))
        {
            jeZaporna = true;
        }
        return jeZaporna;
    }
}

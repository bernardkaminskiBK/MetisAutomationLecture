package javazaklady.Zadanie_6_3_4;

import java.util.ArrayList;

public class Penazenka
{
    private ArrayList<String> mince;

    public Penazenka()
    {
        mince = new ArrayList<String>();
    }

    public void pridajMincu(String nazovMince)
    {
        boolean mincaJeVhodna = nazovMince.equals("Dvojeurovka") || nazovMince.equals("Eurovka")
                || nazovMince.equals("Patdesiatcentovka") || nazovMince.equals("Dvadsatcentovka")
                || nazovMince.equals("Desatcentovka") || nazovMince.equals("Patcentovka")
                || nazovMince.equals("Dvojcentovka") || nazovMince.equals("Centovka");

        if(mincaJeVhodna)
        {
            mince.add(nazovMince);
        }
        else
        {
            System.out.println("Vlozili ste neexistujucu mincu");
        }
    }

    public String toString()
    {
        return mince.toString();
    }

    public boolean jeObsahovoTotoznaS(Penazenka inaPenazenka)
    {
        if (mince.size() == inaPenazenka.mince.size())
        {
            if (mince.containsAll(inaPenazenka.mince) && inaPenazenka.mince.containsAll(mince))
            {
                return true;
            }
        }
        return false;
    }
}

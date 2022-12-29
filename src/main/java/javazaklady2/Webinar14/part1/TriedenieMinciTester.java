package javazaklady2.Webinar14.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TriedenieMinciTester
{
    public static void main(String[] args)
    {
        ArrayList<Minca> mince = new ArrayList<Minca>();
        mince.add(new Minca(0.05, "Patcentovka"));
        mince.add(new Minca(0.20, "Dvadsatcentovka"));
        mince.add(new Minca(0.10, "Desatcentovka"));
        mince.add(new Minca(0.50, "Patdesatcentovka"));
        mince.add(new Minca(0.01, "Centovka"));
        mince.add(new Minca(1.0, "Eurovka"));

        Comparator<Minca> porovnavac = new ReverznyPorovnavacMinci();

        Collections.sort(mince, porovnavac);
        System.out.println(mince);
        System.out.println("Ocakavana hodnota: [Minca[hodnota=1.0,nazov=Eurovka],Minca[hodnota=0.5,nazov=Patdesiatcentovka],Minca[hodnota=0.2,nazov=Dvadsatcentovka],Minca[hodnota=0.1,nazov=Desatcentovka],Minca[hodnota=0.05,nazov=Patcentovka],Minca[hodnota=0.01,nazov=Centovka]]");
    }
}

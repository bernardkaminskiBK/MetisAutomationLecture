package javazaklady2.Webinar14.part2;

import java.util.Arrays;

public class TriedicZlucenimTester {
    public static void main(String[] args)
    {
        int[] cisla = new int[16];
        for (int i = 0; i < 16; i++)
        {
            cisla[i] = 100 - (8 - i) * (8 - i);
        }

        TriedicZlucenim triedic = new TriedicZlucenim(cisla);
        triedic.zotried();
        System.out.println(Arrays.toString(cisla));
        System.out.println("Ocakavane hodnoty: [36, 51, 51, 64, 64, 75, 75, 84, 84, 91, 91, 96, 96, 99, 99, 100]");
    }
}

package javazaklady.Zadanie_13_3_3;

import java.util.Random;

public class PoleUtil
{
    private static Random generator = new Random();

    public static int[] vygenerujPoleCisel(int velkost)
    {
        int[] data = new int[velkost];

        for (int i = 0; i < data.length; i++)
        {
            data[i] = generator.nextInt(0, 1000001);
        }
        return data;
    }
}

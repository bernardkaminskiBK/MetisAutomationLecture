package javazaklady2.Webinar13.part3;

import java.util.Random;

public class PoleUtil {
    private static Random generator = new Random();

    public static int[] vygenerujPoleCisel(int velkost, int dolnaHranica, int hornaHranica){
        int[] data = new int[velkost];

        for (int i = 0; i < data.length; i++){
            data[i] = generator.nextInt(dolnaHranica,hornaHranica);
        }
        return data;
    }
}

package javazaklady.Zadanie_13_3_1;



import java.util.Arrays;

public class TriedenieVyberomTester
{
    public static void main(String[] args)
    {
        int[] data = new int[10];
        for (int i = 0; i < 10; i++)
        {
            data[i] = 100 - (i - 5) * (i - 5);
        }

        OpacnyTriedicVyberom opacnyTriedicVyberom = new OpacnyTriedicVyberom(data);
        opacnyTriedicVyberom.opacneZotried();

        System.out.println(Arrays.toString(data));
        System.out.println("Ocakavany vysledok: 100, 99, 99, 96, 96, 91, 91, 84, 84, 75");
    }
}

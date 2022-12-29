package javazaklady.lecture13.activity3.part1;

public class OpacnyTriedicVyberom
{
    private int[] data;

    public OpacnyTriedicVyberom(int[] data)
    {
        this.data = data;
    }

    public void opacneZotried()
    {
        for (int i = 0; i < data.length - 1; i++)
        {
            int maxIndex = vyhladajIndexNajvacsiehoPrvkuOdIndexu(i);
            vymenPrvky(maxIndex, i);
        }
    }

    private int vyhladajIndexNajvacsiehoPrvkuOdIndexu(int index)
    {
        int maxIndex = index;

        for (int i = maxIndex + 1; i < data.length; i++)
        {
            if (data[i] > data[maxIndex])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void vymenPrvky(int maxIndex, int i)
    {
        int zaloha = data[maxIndex];
        data[maxIndex] = data[i];
        data[i] = zaloha;
    }
}

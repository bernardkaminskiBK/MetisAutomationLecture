package javazaklady.Zadanie_13_3_3;

public class TriedicVyberom
{
    private int[] data;

    public TriedicVyberom(int[] data)
    {
        this.data = data;
    }

    public void zotried()
    {
        for (int i = 0; i < data.length - 1; i++)
        {
            int minIndex = vyhladajIndexNajmensiehoPrvkuOdIndexu(i);
            vymenPrvky(minIndex, i);
        }
    }

    private int vyhladajIndexNajmensiehoPrvkuOdIndexu(int index)
    {
        int minIndex = index;

        for (int i = minIndex + 1; i < data.length; i++)
        {
            if (data[i] < data[minIndex])
            {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void vymenPrvky(int minIndex, int i)
    {
        int zaloha = data[minIndex];
        data[minIndex] = data[i];
        data[i] = zaloha;
    }
}

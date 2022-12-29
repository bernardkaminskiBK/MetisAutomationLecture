package javazaklady2.Webinar13.b;

public class TriedicVyberom
{
    private Minca[] mince;

    public TriedicVyberom(Minca[] mince)
    {
        this.mince = mince;
    }

    public void zotried()
    {
        for (int i = 0; i < mince.length - 1; i++)
        {
            int minIndex = vyhladajIndexNajmensiehoPrvkuOdIndexu(i);
            vymenPrvky(minIndex, i);
        }
    }

    private int vyhladajIndexNajmensiehoPrvkuOdIndexu(int index)
    {
        int minIndex = index;

        for (int i = minIndex + 1; i < mince.length; i++)
        {
            if (mince[i].getHodnota() < mince[minIndex].getHodnota())
            {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void vymenPrvky(int minIndex, int i)
    {
        Minca zaloha = mince[minIndex];
        mince[minIndex] = mince[i];
        mince[i] = zaloha;
    }
}

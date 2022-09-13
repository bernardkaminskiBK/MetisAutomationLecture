package javazaklady.Zadanie_14_3_2;

public class TriedicZlucenimBezRekurzie
{
    public static void zotried(int[] pole, int n)
    {
        int aktualnaVelkost;
        int zaciatokLavy;

        for (aktualnaVelkost = 1; aktualnaVelkost <= n - 1; aktualnaVelkost = 2 * aktualnaVelkost)
        {
            for (zaciatokLavy = 0; zaciatokLavy < n - 1; zaciatokLavy += 2 * aktualnaVelkost)
            {
                int stred = Math.min(zaciatokLavy + aktualnaVelkost - 1, n - 1);
                int koniecPravy = Math.min(zaciatokLavy + 2*aktualnaVelkost - 1, n - 1);
                zluc (pole, zaciatokLavy, stred, koniecPravy);
            }
        }
    }

    public static void zluc(int[] pole, int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] P = new int[n2];

        for (i = 0; i < n1; i++)
        {
            L[i] = pole[l + i];
        }
        for (j = 0; j < n2; j++)
        {
            P[j] = pole[m + 1 + j];
        }

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2)
        {
            if (L[i] <= P[j])
            {
                pole[k] = L[i];
                i++;
            }
            else
            {
                pole[k] = P[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            pole[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            pole[k] = P[j];
            j++;
            k++;
        }
    }
}

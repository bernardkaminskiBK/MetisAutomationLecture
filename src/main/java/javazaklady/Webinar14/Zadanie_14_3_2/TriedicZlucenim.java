package javazaklady.Webinar14.Zadanie_14_3_2;


public class TriedicZlucenim {

    private final int[] data;

    public TriedicZlucenim(int[] data) {
        this.data = data;
    }

    public void zotried() {
        sort(data, 0, data.length - 1);
    }

    private void zluc(int[] arr, int lava, int stred, int prava)
    {

        int n1 = stred - lava + 1;
        int n2 = prava - stred;


        int[] L = new int[n1];
        int[] R = new int[n2];


        for (int i = 0; i < n1; ++i){
            L[i] = arr[lava + i];
        }
        for (int j = 0; j < n2; ++j){
            R[j] = arr[stred + 1 + j];
        }

        int i = 0, j = 0;
        int k = lava;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private void sort(int[] data, int lavaStrana, int pravaStrana)
    {
        if (lavaStrana < pravaStrana) {

            int m = lavaStrana + (pravaStrana-lavaStrana)/2;

            sort(data, lavaStrana, m);
            sort(data, m + 1, pravaStrana);

            zluc(data, lavaStrana, m, pravaStrana);
        }
    }

}

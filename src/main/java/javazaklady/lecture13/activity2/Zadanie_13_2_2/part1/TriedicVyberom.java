package javazaklady.lecture13.activity2.Zadanie_13_2_2.part1;

/**
 * Trieda je zodpovedna za triedenie cisel ulozenych v datovej strukture pole
 * algoritmom triedenia Selection sort (triedenie vyberom).
 */
public class TriedicVyberom {
    private int[] data;

    /**
     * Vytvara triedic dat s danym nezotriedenym polom.
     *
     * @param data nezotriedene pole dat
     */
    public TriedicVyberom(int[] data) {
        this.data = data;
    }

    /**
     * Triedi pole dat algoritmom Selection sort.
     */
    public void zotried() {
        for (int i = 0; i < data.length - 1; i++)   // pocet krokov algoritmu
        {
            int minIndex = vyhladajIndexNajmensiehoPrvkuOdIndexu(i);
            // vymen prvky na poziciach minIndex a i
            vymenPrvky(minIndex, i);
        }
    }

    /**
     * Vymeni prvky v poli data na poziciach x a y.
     *
     * @param x pozicia prveho prvku v poli data
     * @param y pozicia druheho prvku v poli data
     */
    private void vymenPrvky(int x, int y) {
        int zaloha = data[x];
        data[x] = data[y];
        data[y] = zaloha;
    }

    /**
     * Vyhlada a vrati poziciu (index) najmensieho prvku v poli data od pozicie index.
     *
     * @param index pozicia zaciatku hladania v poli data
     * @return index najmensieho prvku
     */
    private int vyhladajIndexNajmensiehoPrvkuOdIndexu(int index) {
        int minIndex = index;

        for (int i = minIndex + 1; i < data.length; i++) {
            if (data[i] < data[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
}

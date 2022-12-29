package javazaklady.lecture13.activity3.part3;

/**
 * Trieda je zodpovedna za tredenie cisel ulozenych v dtovej strukture
 */
public class TriedicVyberom {
    private int[] data;

    /**
     * Vytvara triedic dat s danym nezotriedenim polom.
     * @param data nezotriedene pole
     */
    public TriedicVyberom(int[] data) {
        this.data = data;
    }

    /**
     * Triedi pole dat s algoritmom Selection sort
     */
    public void zotried(){
        for (int i = 0; i < this.data.length -1; i ++){  // pocet krokov algortmu
            int minIndex = vyhladajIndexNajmensiehoPrvkuOdIndexu(i);
            // vymen prvky na poziciach minIndex a i
            vymenPrvky(minIndex,i);
        }
    }

    /**
     * Vymeni prvky na poziciach x a y
     * @param x pozicia prveho prvku v poli data
     * @param y pozicia druheho prvku v poli data
     */
    private void vymenPrvky(int x, int y) {
        int zaloha = data[x];
        data[x] = data[y];
        data[y] = zaloha;
    }

    /**
     * Vyhlada a vrati poziciu (index) najmensieho prvku v poli data od pozicie index
     * @param index pozicia zaciatko hladania
     * @return index najmensieho prvku
     */
    private int vyhladajIndexNajmensiehoPrvkuOdIndexu(int index) {
        int minIndex = index;

        for (int i = minIndex + 1; i < data.length; i ++){
            if (data[i] < data[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
}

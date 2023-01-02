package academy.metis.javazaklady.lecture14.activity3.part3;

public class BinarnyVyhladavac {
    private int[] data;

    /**
     * Vytvara triedic dat s danym nezotriedenim polom.
     * @param data nezotriedene pole
     */
    public BinarnyVyhladavac(int[] data) {
        this.data = data;
    }

    public int vyhladaj(int hladaneCislo){
        for (int i = 0; i < data.length; i++){
            if (data[i] == hladaneCislo){
                return i;
            }
        }
        return -1;
    }
}

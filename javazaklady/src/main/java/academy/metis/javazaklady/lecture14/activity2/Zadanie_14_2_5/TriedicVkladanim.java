package academy.metis.javazaklady.lecture14.activity2.Zadanie_14_2_5;

/**
 * Trieda je zodpovedna za triedenie cisel ulozenych v datovej strukture pole
 * algoritmom triedenia Selection sort (triedenie vkladanim).
 */
public class TriedicVkladanim {
    private int[] data;

    /**
     * Vytvara triedic dat s danym nezotriedenym polom.
     *
     * @param data nezotriedene pole dat
     */
    public TriedicVkladanim(int[] data) {
        this.data = data;
    }

    /**
     * Triedi pole dat algoritmom Insertion sort.
     */
    public void zotried() {
        for (int i = 1; i < data.length; i++)   // pocet krokov algoritmu
        {
            int zaloha = data[i];
            // najdi miesto vlozenia a posun vsetky vacsie prvky doprava
            int j = i;
            while (j > 0 && data[j - 1] > zaloha) {
                data[j] = data[j - 1];
                j--;
            }
            // vlozime odzalohovany prvok
            data[j] = zaloha;
        }
    }
}

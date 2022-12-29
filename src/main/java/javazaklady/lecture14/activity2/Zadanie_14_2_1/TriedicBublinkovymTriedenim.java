package javazaklady.lecture14.activity2.Zadanie_14_2_1;

/**
 * Trieda je zodpovedna za triedenie cisel ulozenych v datovej strukture pole
 * algoritmom triedenia Bubble sort (bublinkove triedenie).
 */
public class TriedicBublinkovymTriedenim {
    private int[] data;

    /**
     * Vytvara triedic dat s danym nezotriedenym polom.
     *
     * @param data nezotriedene pole dat
     */
    public TriedicBublinkovymTriedenim(int[] data) {
        this.data = data;
    }

    /**
     * Triedi pole dat algoritmom Insertion sort.
     */
    public void zotried() {
        for (int i = 0; i < data.length - 1; i++)   // pocet krokov algoritmu
        {
            for (int j = 0; j < data.length - i - 1; j++) {
                // porovname dva susediace prvky, aj je ten nalavo vacsi ako napravo
                // tak ich navzajom vymenim (swapneme)
                if (data[j] > data[j + 1]) {
                    int zaloha = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = zaloha;
                }
            }
        }
    }
}

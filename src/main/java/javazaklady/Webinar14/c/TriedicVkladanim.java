package javazaklady.Webinar14.c;

public class TriedicVkladanim {
    private int[] data;

    /**
     * Vytvara triedic dat s danym nezotriedenim polom.
     * @param data nezotriedene pole
     */
    public TriedicVkladanim(int[] data) {
        this.data = data;
    }

    /**
     * Triedi pole dat s algoritmom Selection sort
     */
    public void zotried(){
        for (int i = 1; i < data.length; i ++){  // pocet krokov algortmu
            int zaloha = data[i];
            // najdi miesto vlozenia a posun vsetky prvky do prava
            int j = i;
            while (j > 0 && data[j - 1] > zaloha){
                data[j] = data[j - 1];
                j--;
            }
            // vlozime odzalohovany prvok
            data[j] = zaloha;
        }
    }
}

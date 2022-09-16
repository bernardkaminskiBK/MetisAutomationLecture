package java_spolocna_praca_s_lektorom.webinar14.Zadanie_14_2_6;

/**
 * Trieda je zodpovedna za triedenie cisel ulozenych v datovej strukture pole
 * algoritmom triedenia Merge sort (triedenie zlucenim).
 */
public class TriedicZlucovanim {
    private int[] data;

    /**
     * Vytvara triedic dat s danym nezotriedenym polom.
     *
     * @param data nezotriedene pole dat
     */
    public TriedicZlucovanim(int[] data) {
        this.data = data;
    }

    /**
     * Triedi pole dat algoritmom Insertion sort.
     */
    public void zotried() {
        if (data.length <= 1) {
            return;
        }

        int[] lavaCast = new int[data.length / 2];
        int[] pravaCast = new int[data.length - lavaCast.length];

        System.arraycopy(data, 0, lavaCast, 0, lavaCast.length);
        System.arraycopy(data, lavaCast.length, pravaCast, 0, pravaCast.length);

        TriedicZlucovanim triedicLavaCast = new TriedicZlucovanim(lavaCast);
        TriedicZlucovanim triedicPravaCast = new TriedicZlucovanim(pravaCast);

        triedicPravaCast.zotried();
        triedicLavaCast.zotried();
        zluc(lavaCast, pravaCast);
    }

    private void zluc(int[] lavaCast, int[] pravaCast) {
        int indexLavaCast = 0;
        int indexPravaCast = 0;
        int indexData = 0;

        while (indexLavaCast < lavaCast.length && indexPravaCast < pravaCast.length) {
            if (lavaCast[indexLavaCast] < pravaCast[indexPravaCast]) {
                data[indexData] = lavaCast[indexLavaCast];
                indexLavaCast++;
            } else {
                data[indexData] = pravaCast[indexPravaCast];
                indexPravaCast++;
            }
            indexData++;
        }

        System.arraycopy(lavaCast, indexLavaCast, data, indexData, lavaCast.length - indexLavaCast);
        System.arraycopy(pravaCast, indexPravaCast, data, indexData, pravaCast.length - indexPravaCast);
    }
}

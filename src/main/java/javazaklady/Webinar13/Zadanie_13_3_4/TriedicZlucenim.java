package javazaklady.Webinar13.Zadanie_13_3_4;


public class TriedicZlucenim {
    private String[] data;


    public TriedicZlucenim(String[] data) {
        this.data = data;
    }


    public void zotried() {
        if (data.length <= 1) {
            return;
        }

        String[] lavaCast = new String[data.length / 2];
        String[] pravaCast = new String[data.length - lavaCast.length];

        System.arraycopy(data, 0, lavaCast, 0, lavaCast.length);
        System.arraycopy(data, lavaCast.length, pravaCast, 0, pravaCast.length);

        TriedicZlucenim triedicLavaCast = new TriedicZlucenim(lavaCast);
        TriedicZlucenim triedicPravaCast = new TriedicZlucenim(pravaCast);
        triedicPravaCast.zotried();
        triedicLavaCast.zotried();
        zluc(lavaCast, pravaCast);


    }

    private void zluc(String[] lavaCast, String[] pravaCast) {
        int indexLavaCast = 0;
        int indexPravaCast = 0;
        int indexdata = 0;

        while (indexLavaCast < lavaCast.length && indexPravaCast < pravaCast.length) {
            if (lavaCast[indexLavaCast].compareTo(pravaCast[indexPravaCast]) < 0) {

                data[indexdata] = lavaCast[indexLavaCast];
                indexLavaCast++;
            } else {
                data[indexdata] = pravaCast[indexPravaCast];
                indexPravaCast++;
            }
            indexdata++;
        }

        System.arraycopy(lavaCast, indexLavaCast, data, indexdata, lavaCast.length - indexLavaCast);
        System.arraycopy(pravaCast, indexPravaCast, data, indexdata, pravaCast.length - indexPravaCast);
    }


}

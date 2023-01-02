package academy.metis.javazaklady.lecture4.activity2.Zadanie_4_2_4;

public class Zemetrasenie {

    private static final String SPRAVA_MAGNITUDA_8 = "Vacsina budov sa zruti";
    private static final String SPRAVA_MAGNITUDA_7 = "Mnoho budov ma narusenu statiku";
    private static final String SPRAVA_MAGNITUDA_6 = "Mnoho budov bolo znacne poskodenych, niektore sa dokonca zrutia";
    private static final String SPRAVA_MAGNITUDA_4_5 = "Poskodene len budovy slabej konstrukcie";
    private static final String SPRAVA_MAGNITUDA_3_5 = "Mnoho ludi ho pociti, ziadne poskodenie budov nebolo zaznamene";
    private static final String SPRAVA_MAGNITUDA_0 = "Vo vseobecnosti nie je rozpoznatelne ludmi";
    private static final String CHYBOVA_HLASKA = "Zaporne cisla nie su povolene";
    private final double magnituda;

    public Zemetrasenie(double magnituda) {
        this.magnituda = magnituda;
    }

    public String getPopis() {
        String popis = "";

        if (magnituda >= 8.0) {
            popis = SPRAVA_MAGNITUDA_8;
        } else if (magnituda >= 7.0) {
            popis = SPRAVA_MAGNITUDA_7;
        } else if (magnituda >= 6.0) {
            popis = SPRAVA_MAGNITUDA_6;
        } else if (magnituda >= 4.5) {
            popis = SPRAVA_MAGNITUDA_4_5;
        } else if (magnituda >= 3.5) {
            popis = SPRAVA_MAGNITUDA_3_5;
        } else if (magnituda >= 0) {
            popis = SPRAVA_MAGNITUDA_0;
        } else {
            popis = CHYBOVA_HLASKA;
        }

        return popis;
    }
}

package java_spolocna_praca_s_lektorom.webinar04.viaccestne_vetvenie;

public class Zemetrasenie2 {
    private double magnituda;

    public Zemetrasenie2(double magnituda) {
        this.magnituda = magnituda;
    }

    public String getPopis()
    {
        String popis = "";

        if (magnituda >= 8.0) {
            popis = "Vacsina budov sa zruti";
        }
        else if (magnituda >= 7.0) {
            popis = "Mnoho budov ma narusenu statiku";
        }
        else if (magnituda >= 6.0) {
            popis = "Mnoho budov bolo znacne poskodenych, niektore sa dokonca zrutia";
        }
        else if (magnituda >= 4.5) {
            popis = "Poskodene len budovy slabej konstrukcie";
        }
        else if (magnituda >= 3.5) {
            popis = "Mnoho ludi ho pociti, ziadne poskodenie budov nebolo zaznamene";
        }
        else if (magnituda >= 0) {
            popis = "Vo vseobecnosti nie je rozpoznatelne ludmi";
        }
        else {
            popis = "Zaporne cisla nie su povolene";
        }

        return popis;
    }
}

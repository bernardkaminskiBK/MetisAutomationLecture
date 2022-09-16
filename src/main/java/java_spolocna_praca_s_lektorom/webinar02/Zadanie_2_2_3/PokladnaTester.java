package java_spolocna_praca_s_lektorom.webinar02.Zadanie_2_2_3;

public class PokladnaTester {
    public static void main(String[] args) {
        Pokladna pokladna = new Pokladna();

        // 1) naskenuj nasledovny tovar:
        //  mlieko - 0.99, maslo - 1.59, cukor - 1.69, sol - 0.39
        pokladna.naskenujTovar(0.99);
        pokladna.naskenujTovar(1.59);
        pokladna.naskenujTovar(1.69);
        pokladna.naskenujTovar(0.39);

        // 2) prijmi hotovost (0.77, 3.0, 5.0) = 8.77
        pokladna.prijmiHotovost(0.77);
        pokladna.prijmiHotovost(3.0);
        pokladna.prijmiHotovost(5);

        // 3) vypocitaj a vrat vydavok zakaznikovi
        double vydavok = pokladna.vratVydavok();
        System.out.println("Vydavok: " + vydavok + " Eur");
        System.out.println("Ocakavana hodnota: 4.11");
    }
}

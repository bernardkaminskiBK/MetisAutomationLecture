package java_spolocna_praca_s_lektorom.webinar03.Zadanie_3_2_2;

public class PokladnaTester {
    public static void main(String[] args) {
        Pokladna pokladna = new Pokladna();

        pokladna.naskenujTovar(0.99);
        pokladna.naskenujTovar(0.79);
        pokladna.naskenujTovar(0.59);
        pokladna.naskenujTovar(0.19);
        pokladna.naskenujTovar(0.39);

        // prijmi hotovost 5.85 Eur
        pokladna.prijmiHotovost(2, 1, 1,
                1, 1, 1, 0, 0);

        System.out.println("Vas vydavok je: " + pokladna.vratVydavok() + " Eur");
        System.out.printf("Vas vydavok je: %.2f Eur%n", pokladna.vratVydavok());
    }
}

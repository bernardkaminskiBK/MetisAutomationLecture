package java_spolocna_praca_s_lektorom.webinar04.Zadanie_4_2_1;

public class DanZPrijmuTester {

    public static void main(String[] args) {
        // 1) Janko Vysoky - SLOBODNY - 10 500 Eur
        DanZPrijmu danZPrijmuVysoky = new DanZPrijmu(RodinnyStatus.SLOBODNY_SLOBODNA, 10500);
        double danVysoky = danZPrijmuVysoky.vypocitajDan();
        System.out.println("Zadan z prijmu (Vysoky): " + danVysoky);

        // 2) Katka Sladka - VYDATA - 55 000 Eur
        DanZPrijmu danZPrijmuSladka = new DanZPrijmu(RodinnyStatus.ZENATY_VYDATA, 55000);
        double danSladka = danZPrijmuSladka.vypocitajDan();
        System.out.println("Zadan z prijmu (Sladka): " + danSladka);
    }
}

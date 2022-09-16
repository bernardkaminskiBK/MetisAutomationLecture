package java_spolocna_praca_s_lektorom.webinar14.Zadanie_14_2_4;

public class MetodaVolajucaSamuSeba {

    private static int pocetVolani = 0;

    public static void main(String[] args) {
        metoda();
    }

    private static void metoda() {
        pocetVolani++;
        System.out.println(pocetVolani);
        metoda();
    }
}

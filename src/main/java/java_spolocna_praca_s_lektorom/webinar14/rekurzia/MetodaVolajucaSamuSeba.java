package java_spolocna_praca_s_lektorom.webinar14.rekurzia;

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

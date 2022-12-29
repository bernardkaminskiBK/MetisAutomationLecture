package javazaklady.lecture14.activity2.Zadanie_14_2_4.part1;

public class MetodaVolajucaSamuSeba_a {

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

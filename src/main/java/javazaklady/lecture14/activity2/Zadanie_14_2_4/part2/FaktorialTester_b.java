package javazaklady.lecture14.activity2.Zadanie_14_2_4.part2;

public class FaktorialTester_b {
    public static void main(String[] args) {
        System.out.printf("Faktorial (10): %.0f%n", faktorial(10));
        System.out.printf("Faktorial (5): %.0f%n", faktorial(5));
        System.out.printf("Faktorial (20): %.0f%n", faktorial(20));
    }

    private static double faktorial(int cislo) {
        if (cislo <= 1) {
            return 1;
        }
        return cislo * faktorial(cislo - 1);
    }
}
package academy.metis.javazaklady.lecture4.activity2.Zadanie_4_2_2;

public class PorovnavanieDesatinnychCisel {
    public static void main(String[] args) {
        double a = Math.sqrt(2);
        double b = a * a;

        if (b == 2) {
            System.out.println("b == 2");
        }
        else {
            double epsilon = b - 2;
            System.out.println("Chyba presnosti vypoctu je: " + epsilon);
        }
    }
}

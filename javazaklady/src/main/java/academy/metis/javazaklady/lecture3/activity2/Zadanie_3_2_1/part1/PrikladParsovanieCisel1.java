package academy.metis.javazaklady.lecture3.activity2.Zadanie_3_2_1.part1;

public class PrikladParsovanieCisel1 {
    public static void main(String[] args) {
        // String -> Integer
        String data = "123";

        // navys cislo o 1
        int cislo = Integer.parseInt(data);
        int cislo2 = Integer.valueOf(data);

        System.out.println("Vyparsovane cislo 1.spôsobom: " + ++cislo);
        System.out.println("Vyparsovanie cislo 2.spôsobom: " + ++cislo2);
    }
}

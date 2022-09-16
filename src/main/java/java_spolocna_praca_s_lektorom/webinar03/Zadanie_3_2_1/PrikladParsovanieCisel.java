package java_spolocna_praca_s_lektorom.webinar03.Zadanie_3_2_1;

public class PrikladParsovanieCisel {
    public static void main(String[] args) {
        // String -> Integer
        String data = "123";

        // navys cislo o 1
        int cislo = Integer.parseInt(data);
        int cislo2 = Integer.valueOf(data);

        System.out.println("Vyparsovanie cislo: " + ++cislo);
        System.out.println("Vyparsovanie cislo: " + ++cislo2);
    }
}

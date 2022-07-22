package Zadanie_6_3_3;

public class Faktorial {

//    public static void main(String[] args) {
//        System.out.println(vypocitajFaktorial());
//    }
//
//    // Prvy sposob ako zadat ulohu...
//    public static String vypocitajFaktorial() {
//        int faktorial = 5;
//        int pom = 1;
//        String vysledok = "";
//
//        for (int i = 1; i <= faktorial; i++) {
//            pom = pom * i;
//            vysledok += i + "!\t" + pom + "\n";
//        }
//
//        return vysledok;
//    }
//}

//public class Faktorial {
//
//    public static void main(String[] args) {
//        //TODO: doplnit...
//    }
//
//    public static String vypocitajFaktorial() {
//        String vysledok = "";
//        //TODO: doplnit...
//        return vysledok;
//    }
//}

// Druhy sposob ako zadat ulohu...
    public static void main(String[] args) {
        System.out.println(vypisDoKonzoly());
    }

    public static String vypisDoKonzoly() {
        String vysledok = "";
        vysledok += "Cislo" + "\tFaktorial\n";
        for (int i = 1; i <= 5; i++) {
            vysledok += i + "\t\t" + vypocitajFaktorial(i) + "\n";
        }
        return vysledok;
    }

    public static int vypocitajFaktorial(int n) {
        int vysledok = 1;
        for (int i = n; i > 0; i--) {
            vysledok = vysledok * i;
        }
        return vysledok;
    }

}

//public class Faktorial {
//
//    public static void main(String[] args) {
//        //TODO: doplnit...
//    }
//
//    public static int vypocitajFaktorial(int n) {
//        int vysledok = 0;
//        //TODO: doplnit...
//        return vysledok;
//    }
//
//}

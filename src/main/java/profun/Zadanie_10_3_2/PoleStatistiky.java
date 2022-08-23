package profun.Zadanie_10_3_2;

public class PoleStatistiky {

    public static int minimum = Integer.MAX_VALUE;
    public static int maximum = Integer.MIN_VALUE;
    public static int minIndex = 0;
    public static int maxIndex = 0;
    public static double sucet = 0;

    public static void main(String[] args) {
        int[] pole = {10, 15, 5, 25, 30};
        System.out.println(vygenerujStatistikyPola(pole));
    }

    public static String vygenerujStatistikyPola(int[] pole) {
        String vysledok = "";

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] < minimum) {
                minimum = pole[i];
                minIndex = i;
            }
            if (pole[i] > maximum) {
                maximum = pole[i];
                maxIndex = i;
            }
            sucet += pole[i];
        }

        vysledok += "Minimum: " + minimum + "\n";
        vysledok += "Index min prvku: " + minIndex + "\n";
        vysledok += "Maximum: " + maximum + "\n";
        vysledok += "Index max prvku: " + maxIndex + "\n";
        vysledok += "Priemer: " + (sucet / pole.length);

        return vysledok;
    }
}

//public class PoleStatistiky {
//
//    public static int minimum = // TODO: doplnit...
//    public static int maximum = // TODO: doplnit...
//    public static int minIndex = // TODO: doplnit...
//    public static int maxIndex = // TODO: doplnit...
//    public static double sucet = // TODO: doplnit...
//
//    public static void main(String[] args) {
//        // TODO: doplnit...
//    }
//
//    public static String vygenerujStatistikyPola(int[] pole) {
//        String vysledok = "";
//        // TODO: doplnit...
//        return vysledok;
//    }
//
//}

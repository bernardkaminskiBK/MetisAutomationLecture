package Zadanie_10_3_2;

public class PoleStatistiky {
    public static void main(String[] args) {
        System.out.println(vygenerujStatistikyPola());
    }

    public static String vygenerujStatistikyPola() {
        String vysledok = "";
        int[] pole = {10, 15, 5, 25, 30}; // Tuto je problem ten ze ako vymisliet to ze na rovanko daval kazdy pole

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        double sucet = 0;

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

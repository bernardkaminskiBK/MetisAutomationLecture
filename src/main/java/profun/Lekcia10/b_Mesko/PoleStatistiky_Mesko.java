package profun.Lekcia10.b_Mesko;

public class PoleStatistiky_Mesko {

    public static void main(String[] args) {
        int[] cisla = new int[]{10, 4, 5, 2, -10};
        System.out.println(vygenerujStatistikyPola(cisla));
    }

    public static String vygenerujStatistikyPola(int[] cisla) {
        int maximum = cisla[0];
        int minimum = cisla[0];
        int poziciaMin = 0;
        int poziciaMax = 0;
        double sucet = 0.0;
        String vysledok = "";

        int i;
        for (i = 1; i < cisla.length; ++i) {
            if (cisla[i] > maximum) {
                maximum = cisla[i];
                poziciaMax = i;
            }

            if (cisla[i] < minimum) {
                minimum = cisla[i];
                poziciaMin = i;
            }
        }

        for (i = 0; i < cisla.length; ++i) {
            sucet += (double) cisla[i];
        }

        double priemer = sucet / (double) cisla.length;
        vysledok = vysledok + "Minimum je: " + minimum + "\nIndex min prvku: " + poziciaMin + "\nMaximum je: " + maximum + "\nIndex max prvku: " + poziciaMax + "\nPriemer: " + priemer;
        return vysledok;
    }
}

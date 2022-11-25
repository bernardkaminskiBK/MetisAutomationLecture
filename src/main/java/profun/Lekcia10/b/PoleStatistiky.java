package profun.Lekcia10.b;

public class PoleStatistiky
{
    public static void main(String[] args)
    {
        int [] pole = {-6, 5, 3, 91, -2, 23, 11, 7, 2, -1};

        System.out.println("najvacsi prvok je: " + getMaximum(pole) + " a je na " + getIndexMaximum(pole));
        System.out.println("najmensi prvok je: " + getMinimum(pole) + " a je na " + getIndexMinimum(pole));
        System.out.println("priemer prvkov je: " + getPriemer(pole));

        //System.out.println(vygenerujStatistikyPola(pole));
    }

    //public static String vygenerujStatistikyPola(int[] pole)
    //{
    //    String vysledok = "";
//
    //    vysledok += "Minimum: " + getMinimum(pole) + "\n";
    //    vysledok += "Index min prvku: " + getIndexMinimum(pole) + "\n";
    //    vysledok += "Maximum: " + getMaximum(pole) + "\n";
    //    vysledok += "Index max prvku: " + getIndexMaximum(pole) + "\n";
    //    vysledok += "Priemer: " + getPriemer(pole);
//
    //    return vysledok;
    //}


    public static double getPriemer(int[] pole)
    {
        double sucet = 0;
        double priemer;

        for (int i = 0; i < pole.length; i++)
        {
            sucet = sucet + pole[i];
        }
        priemer = sucet / pole.length;
        return priemer;
    }

    public static int getIndexMinimum(int[] pole)
    {
        int indexMinimum = 0;
        int minimum = pole[0];

        for(int i = 0; i < pole.length; i++)
        {
            if(minimum >= pole[i])
            {
                indexMinimum = i;
                minimum = pole[i];
            }
        }
        return indexMinimum;
    }

    public static int getMinimum(int[] pole)
    {
        int minimum = pole[0];

        for(int i = 0; i < pole.length; i++)
        {
            if(minimum >= pole[i])
            {
                minimum = pole[i];
            }
        }
        return minimum;
    }

    public static int getMaximum(int[] pole)
    {
        int maximum = pole[0];

        for(int i = 0; i < pole.length; i++)
        {
            if(maximum <= pole[i])
            {
                maximum = pole[i];
            }
        }
        return maximum;
    }

    public static int getIndexMaximum(int[] pole)
    {
        int indexMaximum = 0;
        int Maximum = pole[0];

        for(int i = 0; i < pole.length; i++)
        {
            if(Maximum <= pole[i])
            {
                indexMaximum = i;
                Maximum = pole[i];
            }
        }
        return indexMaximum;
    }

    /*
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
     */
}

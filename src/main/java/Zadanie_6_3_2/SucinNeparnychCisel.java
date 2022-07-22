package Zadanie_6_3_2;

public class SucinNeparnychCisel {

    public static void main(String[] args) {
        System.out.print("Sucin neparnych cisel v intervale 1 az 15: ");
        System.out.println(vypocitajSucinNeparnychCisel());
    }

    public static int vypocitajSucinNeparnychCisel() {
        int sucinNeparnych = 1;
        int i;
        for (i = 1; i <= 15; i++) {
            if (i % 2 == 1) {
                sucinNeparnych = sucinNeparnych * i;
            }
        }
        return sucinNeparnych;
    }

}

//public class SucinNeparnychCisel {
//
//    public static void main(String[] args) {
//        //TODO: doplnit...
//    }
//
//    public static int vypocitajSucinNeparnychCisel() {
//        int sucinNeparnych = 0;
//        //TODO: doplnit...
//        return sucinNeparnych;
//    }
//
//}

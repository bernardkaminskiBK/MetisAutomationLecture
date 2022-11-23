package profun.Lekcia06.b;

public class SucinNeparnychCisel {

    public static void main(String[] args)
    {
        int sucinNeparnych = 1;

        for (int i = 1; i <= 15; i = i + 2)
        {
            sucinNeparnych = sucinNeparnych * i;
        }

        System.out.print("Sucin neparnych cisel v intervale 1 az 15: " + sucinNeparnych);
    }

   //public static int vypocitajSucinNeparnychCisel() {
   //    int sucinNeparnych = 1;
   //    int i;
   //    for (i = 1; i <= 15; i++) {
   //        if (i % 2 == 1) {
   //            sucinNeparnych = sucinNeparnych * i;
   //        }
   //    }
   //    return sucinNeparnych;
   //}

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

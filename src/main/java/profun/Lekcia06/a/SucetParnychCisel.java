package profun.Lekcia06.a;

public class SucetParnychCisel {
    public static void main(String[] args)
    {
        int sucetParnych = 0;

        for (int i = 2; i <= 30; i = i + 2)
        {
            sucetParnych = sucetParnych + i;
        }

        System.out.println("Sucet parnych cisel v intervale 2 az 30: " + sucetParnych);
    }

    //public static int vypocitajSucetParnychCisel() {
    //    int sucetParnych = 0;
    //    int i;
    //    for (i = 2; i <= 30; i++) {
    //        if (i % 2 == 0) {
    //            sucetParnych = sucetParnych + i;
    //        }
    //    }
    //    return sucetParnych;
    //}

}

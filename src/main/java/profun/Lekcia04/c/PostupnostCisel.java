package profun.Lekcia04.c;

public class PostupnostCisel
{
    public static void main(String[] args)
    {
        int cislo = 1;
        String vysledok = "";

        while (cislo <= 10)
        {
            vysledok = vysledok + cislo++  + "\t";
        }

        System.out.println(vysledok);
    }

    //public static String vypisPostupnostCisel() {
    //    int cislo = 1;
    //    String vysledok = "";
//
    //    while (cislo <= 10)
    //    {
    //        vysledok += cislo++  + "\t";
    //    }
//
    //    return vysledok;
    //}
}

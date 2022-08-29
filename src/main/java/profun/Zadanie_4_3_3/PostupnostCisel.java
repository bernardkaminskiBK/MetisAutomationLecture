package profun.Zadanie_4_3_3;

public class PostupnostCisel
{
    public static void main(String[] args)
    {
        System.out.println(vypisPostupnostCisel());
    }

    public static String vypisPostupnostCisel() {
        int cislo = 1;
        String vysledok = "";

        while (cislo <= 10)
        {
            vysledok += cislo++  + "\t";
        }

        return vysledok;
    }
}

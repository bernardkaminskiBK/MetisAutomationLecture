package academy.metis.profun.lecture4.activity3.part3;

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

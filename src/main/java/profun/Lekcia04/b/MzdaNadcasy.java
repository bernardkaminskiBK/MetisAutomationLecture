package profun.Lekcia04.b;

import java.util.Scanner;

public class MzdaNadcasy {
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadaj pocet odpracovanych hodin (-1 pre ukoncenie):");
        int odpHodiny = vstup.nextInt();

        int hodSadzba;
        double tyzdennaMzda;

        while (odpHodiny != -1)
        {
            System.out.println("Zadaj hodinovu sadzbu: ");
            hodSadzba = vstup.nextInt();

            if (odpHodiny <= 40)
            {
                tyzdennaMzda = odpHodiny * hodSadzba;
                System.out.println("Tyzdenna mzda: " + tyzdennaMzda);
            }

            else
            {
                double nadcasy = ((odpHodiny - 40) * (hodSadzba * 1.5));
                tyzdennaMzda = (40 * hodSadzba) + nadcasy;
                System.out.println("Tyzdenna mzda: " + tyzdennaMzda);
            }

            System.out.println("Zadaj pocet odpracovanych hodin (-1 pre ukoncenie):");
            odpHodiny = vstup.nextInt();
        }
    }

    //public static double vypocetTyzdennaMzda(int odpHodiny, int hodSadzba) {
    //   double tyzdennaMzda = 0;
    //    if (odpHodiny <= 40)
    //    {
    //        tyzdennaMzda = odpHodiny * hodSadzba;
//
    //    }else{
    //       double nadcasy = ((odpHodiny - 40) * (hodSadzba * 1.5));
    //       tyzdennaMzda = (40 * hodSadzba) + nadcasy;
    //    }
    //    return tyzdennaMzda ;
    //}
}

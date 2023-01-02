package academy.metis.javazaklady.lecture1.activity3.part4;

import java.awt.*;

public class ZobrazovacPrienikuObdlznikov
{
    public static void main(String[] args)
    {
        Rectangle obdlznik1 = new Rectangle(10, 0, 5, 10);
        Rectangle obdlznik2 = new Rectangle(10, 0, 5, 10);


        if (zistiPretnutie(obdlznik1,obdlznik2))
        {
            System.out.println("\nObdlzniky sa pretinaju");
        }
        else
        {
            System.out.println("\nObdlzniky sa nepretinaju");
        }
    }

    public static boolean zistiPretnutie(Rectangle obdlznik1, Rectangle obdlznik2){
        boolean pretinajuSa = obdlznik1.intersects(obdlznik2);

        return pretinajuSa;
    }
}


/*
public class ZobrazovacPrienikuObdlznikov
{
    public static void main(String[] args)
    {
        Rectangle obdlznik1 = new Rectangle(0, 0, 15, 20);
        Rectangle obdlznik2 = new Rectangle(10, 5, 5, 10);

        boolean pretinajuSa = obdlznik1.intersects(obdlznik2);

        if (pretinajuSa)
        {
            System.out.println("\nObdlzniky sa pretinaju");
        }
        else
        {
            System.out.println("\nObdlzniky sa nepretinaju");
        }
    }



}
*/

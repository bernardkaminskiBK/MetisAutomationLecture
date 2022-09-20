package profun_spolocna_praca_s_lektorom.Lekcia8.zadanie1;

import java.util.Scanner;

public class Aplikacia
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.print("Zadaj stranu A: ");
        int astranA = vstup.nextInt();
        System.out.print("Zadaj stranu A: ");
        int stranaB = vstup.nextInt();
        System.out.print("Zadaj stranu A: ");
        int stranaC = vstup.nextInt();

        String text1, text2, text3,text4;

        text1 = overTrojNerovnost(astranA, stranaB, stranaC);       // prve riesenie
        text2 = overTrojNerovnost2(astranA, stranaB, stranaC);      // druhe riesenie
        text3 = overTrojNerovnost3(astranA, stranaB, stranaC);      // tretie riesenie
        text4 = overTrojNerovnost4(astranA, stranaB, stranaC);      // stvrte riesenie

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
    }

    public static String overTrojNerovnost(int a,int b,int c)
    {
        String text = "";

        if (a + b > c)
        {
            if (b + c > a)
            {
                if (a + c > b)
                {
                    text = "trojuholnik je mozne zostrojit";
                }
                else
                {
                    text = "trojuholnik nie je mozne zostrojit";
                }
            }
            else
            {
                text = "trojuholnik nie je mozne zostrojit";
            }
        }
        else
        {
            text = "trojuholnik nie je mozne zostrojit";
        }
        return text;
    }

    public static String overTrojNerovnost2(int a, int b, int c)
    {
        String text = "";

        if (a + b > c && a + c > b && c + b > a)
        {
            text = "trojuholnik je mozne zostrojit";
        }
        else
        {
            text = "trojuholnik nie je mozne zostrojit";
        }
        return text;
    }

    public static String overTrojNerovnost3(int a,int b,int c)
    {
        boolean platiNerovnost = false;
        String text = "";

        if (a + b > c)
        {
            if (b + c > a)
            {
                if (a + c > b)
                {
                    platiNerovnost = true;
                }
            }
        }

        if (platiNerovnost)
        {
            text = "trojuholnik je mozne zostrojit";
        }
        else
        {
            text = "trojuholnik nie je mozne zostrojit";
        }
        return text;
    }

    public static String overTrojNerovnost4(int a, int b, int c)
    {
        String text = (a + b > c && a + c > b && c + b > a) ?
                "trojuholnik je mozne zostrojit" :
                "trojuholnik nie je mozne zostrojit";

        return text;
    }
}


package java_spolocna_praca_s_lektorom.webinar10.zadanie_10_2_1;

public class ArgumentyPrikazovehoRiadkaDemo
{
    public static void main(String[] args)
    {
        //System.out.println("Argumenty: " + Arrays.deepToString(args));

        /*
        for (String argument : args)
        {
            System.out.println(argument);
        }
        */

        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}


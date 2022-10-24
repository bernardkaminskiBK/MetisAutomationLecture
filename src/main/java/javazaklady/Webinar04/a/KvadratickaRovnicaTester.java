package javazaklady.Webinar04.a;

public class KvadratickaRovnicaTester
{
    public static void main(String[] args)
    {
        int a = 2, b = 2, c = -4;

        KvadratickaRovnica rovnica = new KvadratickaRovnica(a, b, c);

        if (rovnica.jeRiesitelna() && rovnica.getRiesenie1() != rovnica.getRiesenie2())
        {
            System.out.println("Rovnica je riesitelna");
            System.out.println("Ocakavana hodnota: true");
            System.out.println("Rovnica ma dva korene, x1 = " + rovnica.getRiesenie1() + " ,x2 = " + rovnica.getRiesenie2());
            System.out.println("Ocakavana hodnota: x1 = -2.0 ,x2 = 1.0");
        }

        else if (rovnica.jeRiesitelna() && rovnica.getRiesenie1() == rovnica.getRiesenie2())
        {
            System.out.println("Rovnica je riesitelna");
            System.out.println("Rovnica ma jeden dvojnasobny koren, x = " + rovnica.getRiesenie1());
        }

        else
        {
            System.out.println("Rovnica nie je riesitelna");
        }
    }
}

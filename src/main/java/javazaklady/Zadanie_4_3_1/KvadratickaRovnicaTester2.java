package javazaklady.Zadanie_4_3_1;

public class KvadratickaRovnicaTester2
{
    public static void main(String[] args)
    {
        int a = 2, b = 2, c = 4;

        KvadratickaRovnica rovnica = new KvadratickaRovnica(a, b, c);

        if (rovnica.jeRiesitelna() && rovnica.getRiesenie1() != rovnica.getRiesenie2())
        {
            System.out.println("Rovnica je riesitelna");
            System.out.println("Ocakavana hodnota: false");
            System.out.println("Rovnica ma dva korene, x1 = " + rovnica.getRiesenie1() + " ,x2 = " + rovnica.getRiesenie2());
        }

        else if (rovnica.jeRiesitelna() && rovnica.getRiesenie1() == rovnica.getRiesenie2())
        {
            System.out.println("Rovnica je riesitelna");
            System.out.println("Rovnica ma jeden dvojnasobny koren, x = " + rovnica.getRiesenie1());
        }

        else
        {
            System.out.println("Rovnica nie je riesitelna");
            System.out.println("Ocakavana hodnota: true");
        }
    }
}
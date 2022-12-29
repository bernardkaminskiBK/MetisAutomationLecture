package javazaklady.lecture21.activity2.Zadanie_21_2_4;

public class VypocetDvojnasobkuTester
{
    public void zrealizujVypocet(VypocetDvojnasobku vypocet, int parameter)
    {
        int vysledok = vypocet.zdvojnasob(parameter);
        System.out.println("Vysledok: " + vysledok);
    }

    public static void main(String[] args)
    {
        VypocetDvojnasobkuTester tester = new VypocetDvojnasobkuTester();

        // typ lambda vyrazu musi byt vzdy funkcionalny interface
        // funkcionalny interface - je rozhranie ktore obsahuje len a len
        // jednu jedinu abstraktnu metodu!!!
        VypocetDvojnasobku lambda = (int cislo) -> cislo * 2;

        tester.zrealizujVypocet(lambda, 11);
        tester.zrealizujVypocet(lambda, 234);
        tester.zrealizujVypocet(lambda, 17);
    }
}

@FunctionalInterface
interface VypocetDvojnasobku
{
    int zdvojnasob(int cislo);
}

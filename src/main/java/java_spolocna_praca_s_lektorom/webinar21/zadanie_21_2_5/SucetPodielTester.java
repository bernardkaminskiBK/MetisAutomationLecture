package java_spolocna_praca_s_lektorom.webinar21.zadanie_21_2_5;

public class SucetPodielTester
{
    public static void spocitaj(Sucet sucet, int parameter1, int parameter2)
    {
        System.out.println("Sucet: " + sucet.zrealizujSucet(parameter1, parameter2));
    }

    public static void vydel(Podiel podiel, double parameter1, double parameter2)
    {
        System.out.println("podiel: " + podiel.zrealizujpodiel(parameter1, parameter2));
    }

    public static void main(String[] args)
    {
        Sucet lambdaSucet = (int cislo1, int cislo2) -> cislo1 + cislo2;
        spocitaj(lambdaSucet, 10, 20);

        Podiel lambdaPodiel = (double cislo1, double cislo2) -> cislo2 == 0 ? 0 : cislo1 / cislo2;
        vydel(lambdaPodiel, 20, 4);
    }
}

interface Sucet
{
    int zrealizujSucet(int cislo1, int cislo2);
}

interface Podiel
{
    double zrealizujpodiel(double cislo1, double cislo2);
}

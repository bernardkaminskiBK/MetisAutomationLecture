package javazaklady.Zadanie_6_3_3;

public class PenazenkaTester
{
    public static void main(String[] args)
    {
        Penazenka penazenka = new Penazenka();
        penazenka.pridajMincu("Centovka");
        penazenka.pridajMincu("Eurovka");
        penazenka.pridajMincu("Dvojeurovka");

        System.out.println("Obsah Vasej penazenky je: Penazenka" + penazenka);
        System.out.println("Ocakavana hodnota: Penazenka[Centovka, Eurovka, Dvojeurovka]");
    }
}

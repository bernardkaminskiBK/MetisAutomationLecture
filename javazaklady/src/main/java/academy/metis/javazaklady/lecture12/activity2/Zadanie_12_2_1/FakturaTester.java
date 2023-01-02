package academy.metis.javazaklady.lecture12.activity2.Zadanie_12_2_1;

public class FakturaTester
{
    public static void main(String[] args)
    {
        Adresa adresa = new Adresa("Firma XYZ", "Horna 5", "12345", "Horna Dolan");

        Faktura faktura = new Faktura(adresa);

        faktura.pridaj(new Produkt("Hriankovac", 30.0), 5);
        faktura.pridaj(new Produkt("Toustovac", 20.0), 1);
        faktura.pridaj(new Produkt("Televizor", 1000.0), 2);

        System.out.println(faktura.naformatuj());
    }
}


package javazaklady.lecture9.activity2.Zadanie_9_2_3.part1;

public class DvojrozmernyGrafickyUtvar
{
    // instancne premenne musia byt vzdy private, tu nie su, modifikator pristupu je tam package private,
    // teda akoby bez modifikatora pristupu
    public double sirka;
    public double vyska;

    void zobrazRozmer()
    {
        System.out.println("sirka = " + sirka + ", vyska = " + vyska);
    }
}

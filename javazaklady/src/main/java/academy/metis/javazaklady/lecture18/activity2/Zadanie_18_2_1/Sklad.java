package academy.metis.javazaklady.lecture18.activity2.Zadanie_18_2_1;



public class Sklad
{
    public static Vyrobok dvere = new Vyrobok("Drevene dvere", 34);
    public static Vyrobok dlazobnaKocka = new Vyrobok("Dlazobna kocka", 24);
    public static Vyrobok okno = new Vyrobok("Okno", 11);

    public static Dodavatel fero = new Dodavatel("Fero s.r.o.");
    public static Dodavatel karol = new Dodavatel("Karol s.r.o.");

    static // staticky inicializacny blok
    {
        fero.getVyrobky().add(dvere);
        fero.getVyrobky().add(dlazobnaKocka);

        karol.getVyrobky().add(dlazobnaKocka);
        karol.getVyrobky().add(okno);
    }

}
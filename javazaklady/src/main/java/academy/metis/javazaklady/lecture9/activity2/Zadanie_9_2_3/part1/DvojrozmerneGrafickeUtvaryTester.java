package academy.metis.javazaklady.lecture9.activity2.Zadanie_9_2_3.part1;

public class DvojrozmerneGrafickeUtvaryTester
{
    public static void main(String[] args)
    {
        DvojrozmernyGrafickyUtvar utvar1 = new DvojrozmernyGrafickyUtvar();
        utvar1.sirka = 20;
        utvar1.vyska = 30;
        utvar1.zobrazRozmer();

        Obdlznik utvar2 = new Obdlznik();
        utvar2.sirka = 20;
        utvar2.vyska = 50;
        System.out.println("Je stvorec: " + utvar2.jeStvorec());
        System.out.println("Plocha (utvar2): " + utvar2.plocha());
        utvar2.zobrazRozmer();

        Trojuholnik utvar3 = new Trojuholnik();
        utvar3.sirka = 50;
        utvar3.vyska = 30;
        utvar3.styl = "vyplneny";
        System.out.println("Plocha (utvar3): " + utvar3.plocha());
        utvar3.zobrazRozmer();
        utvar3.zobrazStyl();
    }
}

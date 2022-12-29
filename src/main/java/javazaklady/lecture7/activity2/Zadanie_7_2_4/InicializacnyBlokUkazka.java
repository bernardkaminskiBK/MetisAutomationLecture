package javazaklady.lecture7.activity2.Zadanie_7_2_4;

public class InicializacnyBlokUkazka
{
    // staticke premenne (premenne triedy) - obsahuju slovo static
    private static int cislo;
    private static int pocetVytvorenychObjektov;
    private static Trieda1 trieda1 = new Trieda1();

    // nestaticke premenne (instancne premenne) - neobsahuju slovo static
    private String menoStudenta;
    private Trieda2 trieda2 = new Trieda2();

    // staticky inicializacny blok (vieme pristupovat len k statickym premennym triedy)
    // telo statickeho inicializacneho bloku sa vykona len RAZ
    static{
        System.out.println("... zavolal staticky inicializacny blok ...");
        cislo = 5;
    }

    // nestaticky inicializacny blok (vieme pristupovat k statickym aj nestatickym clenom triedy)
    // telo nestatickeho inicializacneho bloku sa vykona vzdy pred kazdym volanim konstruktora
    {
        System.out.println("... zavolal sa nestaticky inicializacny blok");
        pocetVytvorenychObjektov++;
        menoStudenta = "Igor Kovac";
    }

    // konstruktor
    public InicializacnyBlokUkazka()
    {
        System.out.println("... zavolal sa konstruktor: InicializacnyBlok()");
    }

    public static int getPocetVytvorenychObjektov()
    {
        return pocetVytvorenychObjektov;
    }
}
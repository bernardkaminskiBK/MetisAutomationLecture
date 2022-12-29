package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_4;

public class InicializacnyBlokTester
{
    public static void main(String[] args)
    {
        InicializacnyBlok initBlok = new InicializacnyBlok();
        System.out.println("Pocet vytvorenych objektov: " + InicializacnyBlok.getPocetVytvorenychObjektov());
        System.out.println("---------------------------------------------------------");
        InicializacnyBlok initBlok2 = new InicializacnyBlok();
        System.out.println("Pocet vytvorenych objektov: " + InicializacnyBlok.getPocetVytvorenychObjektov());
    }
}

package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3.dedicnost_navrh_c1_PackagePrivateModifikatorPristupu;

public class DvojrozmernyGrafickyUtvar
{
    // instancne premenne musia byt vzdy private, tu nie su, modifikator pristupu je tam package private,
    // teda akoby bez modifikatora pristupu
    double sirka;
    double vyska;

    void zobrazRozmer()
    {
        System.out.println("sirka = " + sirka + ", vyska = " + vyska);
    }
}

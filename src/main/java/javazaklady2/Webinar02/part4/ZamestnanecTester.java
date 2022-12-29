package javazaklady2.Webinar02.part4;

/**
 * Testovacia trieda pre triedu Zamestnanec.
 */
public class ZamestnanecTester
{
    public static void main(String[] args)
    {
        Zamestnanec pista = new Zamestnanec("Stefan Novak", 800);
        pista.navysPlat(10);

        System.out.println("Meno zamestnanca: " + pista.getMeno() +
                           "\nPlat zamestnanca bol navyseny na: " + pista.getPlat());
    }
}

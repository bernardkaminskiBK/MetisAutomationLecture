package academy.metis.javazaklady.lecture20.activity2.Zadanie_20_2_3;


public class ZretazenyZoznamTester
{
    public static void main(String[] args)
    {
        ZretazenyZoznam<String> studenti = new ZretazenyZoznam<>();

        System.out.println("Pridanie prvkov do zretazeneho zoznamu pomocou metody pridajNaZaciatok()");
        studenti.pridajNaZaciatok("Peter"); // Peter
        studenti.pridajNaZaciatok("Igor");  // Igor Peter
        studenti.pridajNaZaciatok("Marek"); // Marek Igor Peter
        studenti.pridajNaZaciatok("Vojto"); // Vojto Marek Igor Peter

        vypisPrvkyZoznamu2(studenti);
        System.out.println("Ocakavana hodnota: Vojto Marek Igor Peter");

        // ziskaj data prveho uzla, cakame, ze to bude Vojto
        String menoStudenta = studenti.getPrvy();
        System.out.println("\nPrvy student: " + menoStudenta);
        System.out.println("Ocakavana hodnota: Vojto");

        // odstranenie prvkov zo zoznamu pomocou metody zretazeneho zoznamu - zmazZoZaciatku()
        System.out.println("\nOdstranenie celeho zoznamu pomocou metody zmazZoZaciatku()");
        System.out.println("Odstranili sme studenta: " + studenti.zmazZoZaciatku());
        System.out.println("Odstranili sme studenta: " + studenti.zmazZoZaciatku());
        System.out.println("Odstranili sme studenta: " + studenti.zmazZoZaciatku());
        System.out.println("Odstranili sme studenta: " + studenti.zmazZoZaciatku());

        vypisPrvkyZoznamu(studenti);
        System.out.println("Ocakavana hodnota: "); // prazdny zoznam

        // pridanie do zoznamu pomocou metody iteratora pridaj()
        ZoznamIterator<String> iterator = studenti.iteratorZoznam();
        iterator.pridaj("Monika");
        iterator.pridaj("Zuzka");
        iterator.pridaj("Katka");
        iterator.pridaj("Janka");

        vypisPrvkyZoznamu(studenti);

        // odstran vsetky prvky zretazeneho zoznamu pomocou iteratora, jeho metody zmaz()
        System.out.println("\nOdstranenie celeho zoznamu pomocou iteratora");
        iterator = studenti.iteratorZoznam();

        while (iterator.existujeDalsiPrvok())
        {
            System.out.println("Aktualne zmazany prvok: " + iterator.dalsi());
            iterator.zmaz();
        }

        vypisPrvkyZoznamu(studenti);
        System.out.println("Ocakavana hodnota: "); // prazdny zoznam
    }

    public static void vypisPrvkyZoznamu(ZretazenyZoznam<String> zoznam)
    {
        ZoznamIterator<String> iterator = zoznam.iteratorZoznam();

        while (iterator.existujeDalsiPrvok())
        {
            String prvok = iterator.dalsi();
            System.out.println(prvok + " ");
        }

        System.out.println();
    }

    private static <T> void vypisPrvkyZoznamu2(ZretazenyZoznam<T> zoznam)
    {
        ZoznamIterator<T> iterator = zoznam.iteratorZoznam();

        while (iterator.existujeDalsiPrvok())
        {
            T prvok = iterator.dalsi();
            System.out.println(prvok + " ");
        }

        System.out.println();
    }
}

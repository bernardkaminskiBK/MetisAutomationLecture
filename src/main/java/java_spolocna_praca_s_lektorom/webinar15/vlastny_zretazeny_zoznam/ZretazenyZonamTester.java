package java_spolocna_praca_s_lektorom.webinar15.vlastny_zretazeny_zoznam;

public class ZretazenyZonamTester {
    public static void main(String[] args) {
        ZretazenyZoznam studenti = new ZretazenyZoznam();

        System.out.println("Pridanie prvkov do zretazeneho zoznamu pomocou metody pridajNaZaciatok()");
        studenti.pridajNaZaciatok("Peter");     // Peter
        studenti.pridajNaZaciatok("Igor");      // Igor Peter
        studenti.pridajNaZaciatok("Marek");     // Marek Igor Peter
        studenti.pridajNaZaciatok("Vojto");     // Vojto Marek Igor Peter

        vypisPrvkyZoznamu(studenti);
        System.out.println("Ocakavana hodnota: Vojto Marek Igor Peter");

        // ziskaj data prveho uzla, cakame ze to bude "Vojto"
        String menoStudenta = (String) studenti.getPrvy();
        System.out.println("\nPrvy student: " + menoStudenta);
        System.out.println("Ocakava hodnota: Vojto");

        // odstranenie prvkov zo zoznamu pomocou metody zretazeneho zoznamu - zmazZoZaciatku()
        System.out.println("\nOdstranenie celeho zoznamu pomocou metody zmazZoZaciatku()");
        System.out.println("Odstranili sme studenta: " + studenti.zmazZoZaciatku());
        System.out.println("Odstranili sme studenta: " + studenti.zmazZoZaciatku());
        System.out.println("Odstranili sme studenta: " + studenti.zmazZoZaciatku());
        System.out.println("Odstranili sme studenta: " + studenti.zmazZoZaciatku());

        vypisPrvkyZoznamu(studenti);
        System.out.println("Ocakavana hodnota: ");

        // pridanie do zoznamu pomocou metody iteratora pridaj()
        ZoznamIterator iterator = studenti.iteratorZoznam();
        iterator.pridaj("Monika");
        iterator.pridaj("Zuzka");
        iterator.pridaj("Katka");
        iterator.pridaj("Janka");

        vypisPrvkyZoznamu(studenti);

        // odtran vsetky prvky zretazeneho zoznamu pomocou iteratora, jeho metody zmaz()
        System.out.println("\nOdstranenie celeho zoznamu pomocou iteratora");
        iterator = studenti.iteratorZoznam();

        while (iterator.existujeDalsiPrvok()) {
            System.out.println("Aktualne zmazany prvok: " + iterator.dalsi());
            iterator.zmaz();
        }

        vypisPrvkyZoznamu(studenti);
        System.out.println("Ocakavana hodnota: ");
    }

    private static void vypisPrvkyZoznamu(ZretazenyZoznam zoznam) {
        ZoznamIterator iterator = zoznam.iteratorZoznam();

        while (iterator.existujeDalsiPrvok()) {
            String prvok = (String) iterator.dalsi();
            System.out.println(prvok + " ");
        }
        System.out.println();
    }
}

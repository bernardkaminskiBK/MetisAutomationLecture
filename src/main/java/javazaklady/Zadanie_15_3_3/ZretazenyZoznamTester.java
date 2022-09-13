package javazaklady.Zadanie_15_3_3;

public class ZretazenyZoznamTester {
    public static void main(String[] args) {
        ZretazenyZoznam studenti = new ZretazenyZoznam();
        System.out.println("Pridavanie prvkov do zretazeneho zoznamu pomocou metody pridajNaZaciatok");
        studenti.pridajNaZaciatok("Peter");
        studenti.pridajNaZaciatok("Igor");
        studenti.pridajNaZaciatok("Marek");
        studenti.pridajNaZaciatok("Vojto");
        studenti.pridajNaZaciatok("Eugen");

        System.out.println("Aktualna velkost: " + studenti.getAktualnaVelkost());
        System.out.println("Ocakavana hodnota: 5");

        studenti.zmazZoZaciatku();
        studenti.zmazZoZaciatku();

        System.out.println("Aktualna velkost: " + studenti.getAktualnaVelkost());
        System.out.println("Ocakavana hodnota:3");

    }
}

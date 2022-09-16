package java_spolocna_praca_s_lektorom.webinar01.grafika.webinar06.banka;

public class BankaTester {
    public static void main(String[] args) {
        BankovyUcet ucet1 = new BankovyUcet(1, 1000);
        BankovyUcet ucet2 = new BankovyUcet(2, 2000);
        BankovyUcet ucet3 = new BankovyUcet(3, 3000);
        BankovyUcet ucet4 = new BankovyUcet(4, 4000);
        BankovyUcet ucet5 = new BankovyUcet(5, 5000);

        Banka banka = new Banka();

        // 1) pridaj vsetky predpripravene bankove ucty do banky
        banka.zalozUcet(ucet1);
        banka.zalozUcet(ucet2);
        banka.zalozUcet(ucet3);
        banka.zalozUcet(ucet4);
        banka.zalozUcet(ucet5);

        // 2) vypis celkovy pocet uctov v banke
        System.out.println("Pocet uctov v banke: " + banka.getPocetUctov());

        // 3) zmaz ucet s cislom uctu rovnym 1
        banka.zmazUcet(1);
        System.out.println("... mazem ucet z banky, ktoreho cislo uctu je rovne 1");

        // 4) vypis celkovy pocet uctov v banke
        System.out.println("Pocet uctov v banke: " + banka.getPocetUctov());

        // 5) zisti celkovy zostatok na vsetkych uctoch v banke
        System.out.println("Celkovy zostatok na uctoch: " + banka.getCelkovyZostatok() + " Eur");

        // 6) vyhladaj ucet s cislom uctu 5 a vypis jeho zostatok
        BankovyUcet ucet = banka.vyhladajUcet(5);
        System.out.println("Zostatok na ucet s cislom uctu 5 je: " + ucet.getAktualnyZostatok());

        // 7) zisti pocet uctov so zostatkom vyssim ako 2500 Eur
        int pocetUctov = banka.najdiPocetUctovSoZostatkomVyssimAko(2500);
        System.out.println("V banke je " + pocetUctov + " so zostatkom vyssim ako 2500 Eur");

        // 8) najdi ucet s najvyssim (max) zostatkom
        BankovyUcet maxUcet = banka.najdiMaxUcet();
        System.out.println("Cislo uctu: " + maxUcet.getCisloUctu());
        System.out.println("Zostatok: " + maxUcet.getAktualnyZostatok());
    }
}

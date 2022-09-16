package java_spolocna_praca_s_lektorom.webinar02.bankovy_ucet;

public class BankovyUcetTester {
    public static void main(String[] args) {
        // 1) vytvor bankovy ucet (ucet 1) so zostatkom 0 Eur
        BankovyUcet ucet1 = new BankovyUcet();

        // 2) vytvor bankovy ucet (ucet 2) so zostatkom 1000 Eur
        BankovyUcet ucet2 = new BankovyUcet(1000);

        // 3) vloz na ucet 1 sumu 457 Eur
        ucet1.vloz(457);

        // 4) vyber z ucet 2 sumu 300 Eur
        ucet2.vyber(300);

        // 5) vypis skutocne a ocakavane zostatky na oboch uctoch
        System.out.println("Zostatok ucet1: " + ucet1.getAktualnyZostatok() + " Eur");
        System.out.println("Ocakavana hodnota: 457.0");

        System.out.println("Zostatok ucet2: " + ucet2.getAktualnyZostatok() + " Eur");
        System.out.println("Ocakavana hodnota: 700.0");
    }
}

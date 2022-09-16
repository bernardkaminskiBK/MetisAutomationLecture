package java_spolocna_praca_s_lektorom.webinar05.investovanie;

public class ZlozeneUrocenie {
    public static void main(String[] args) {
        // zelanyZostatok = pociatocnyZostatok * (1 + urokovaSadzba)^pocetRokov

        // Vytvor tabulku s 2 stlpcami, kde v 1. stlpci rok a v 2. stlpci
        // bude nasporena suma penazi pre 20 rokov
        double zostatok;
        double pociatocnyZostatok = 1000;
        double urokovaSadzba = 0.03;

        System.out.printf("%s%20s\n", "Rok", "Zostatok na ucte");

        for (int rok = 1; rok <= 15; rok++)
        {
            zostatok = pociatocnyZostatok * Math.pow(1 + urokovaSadzba, rok);

            System.out.printf("%4d%20.2f\n", rok, zostatok);
        }
    }
}

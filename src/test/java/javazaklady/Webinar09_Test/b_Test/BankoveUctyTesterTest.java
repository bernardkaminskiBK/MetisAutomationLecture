package javazaklady.Webinar09_Test.b_Test;

import javazaklady.Webinar09.b.BeznyUcet;
import javazaklady.Webinar09.b.SporiaciUcet;
import javazaklady.Webinar09.b.TerminovanyUcet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class BankoveUctyTesterTest {

    @RepeatedTest(3)
    public void pokutaZaNepovolenyVyberZTerminovanehoUctu() {
        SporiaciUcet sporiaciUcet = new SporiaciUcet(5);
        BeznyUcet beznyUcet = new BeznyUcet(1000);
        TerminovanyUcet terminovanyUcet = new TerminovanyUcet(10, 3);

        sporiaciUcet.vloz(10000);

        sporiaciUcet.vlozNaUcet(2000, beznyUcet);
        beznyUcet.vyber(1500);
        beznyUcet.vyber(80);

        sporiaciUcet.vlozNaUcet(1000, beznyUcet);
        beznyUcet.vyber(400);

        sporiaciUcet.vlozNaUcet(3000, terminovanyUcet);
        terminovanyUcet.vyber(400);    // netreba zabudnut na pokutu

        // simulacia koniec mesiaca
        sporiaciUcet.zapisUrok();
        terminovanyUcet.zapisUrok();
        beznyUcet.zauctujPoplatky();

        // vypis aktualnych zosatkov na jednotlivych uctov a ocakavane hodnoty
        Assertions.assertEquals(1017.6, beznyUcet.getAktualnyZostatok());
        Assertions.assertEquals( 4200, sporiaciUcet.getAktualnyZostatok());
        Assertions.assertEquals(2877.6,terminovanyUcet.getAktualnyZostatok());
    }

}

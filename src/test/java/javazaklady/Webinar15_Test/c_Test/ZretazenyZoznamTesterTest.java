package javazaklady.Webinar15_Test.c_Test;

import javazaklady.Webinar15.c.ZretazenyZoznam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class ZretazenyZoznamTesterTest {

    @RepeatedTest(3)
    public void deletingStudentAtBeginingOfListTest() {
        ZretazenyZoznam studenti = new ZretazenyZoznam();
        studenti.pridajNaZaciatok("Peter");
        studenti.pridajNaZaciatok("Igor");
        studenti.pridajNaZaciatok("Marek");
        studenti.pridajNaZaciatok("Vojto");
        studenti.pridajNaZaciatok("Eugen");

        studenti.zmazZoZaciatku();
        studenti.zmazZoZaciatku();

        Assertions.assertEquals(3, studenti.getAktualnaVelkost());
    }

}

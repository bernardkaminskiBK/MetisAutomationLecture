package javazaklady2.Webinar15_Test.part3;

import javazaklady2.Webinar15.part3.ZretazenyZoznam;
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

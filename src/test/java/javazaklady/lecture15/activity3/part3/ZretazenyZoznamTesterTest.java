package javazaklady.lecture15.activity3.part3;

import javazaklady.lecture15.activity3.part3.ZretazenyZoznam;
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

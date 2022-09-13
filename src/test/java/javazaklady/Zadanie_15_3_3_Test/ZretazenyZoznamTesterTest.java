package javazaklady.Zadanie_15_3_3_Test;

import javazaklady.Zadanie_15_3_3.ZretazenyZoznam;
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

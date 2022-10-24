package javazaklady.Webinar08_Test.c_Test;

import javazaklady.Webinar08.c.MnozinaDat;
import javazaklady.Webinar08.c.Osoba;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class OsobaTesterTest {

    @ParameterizedTest
    @CsvSource(value = {"Janka,189,Bonifac,200,Igor,190,193","Danka,205,Kleopatra,174,Servac,149,176","Anka,183,Blanka,186,Ignac,180,183"})
    public void pridajTest(String meno1, double vyska1,String meno2, double vyska2,String meno3, double vyska3, double expectedResult){

        Osoba osoba1 = new Osoba(meno1, vyska1);
        Osoba osoba2 = new Osoba(meno2, vyska2);
        Osoba osoba3 = new Osoba(meno3, vyska3);

        MnozinaDat mnozina = new MnozinaDat();
        mnozina.pridaj(osoba1);
        mnozina.pridaj(osoba2);
        mnozina.pridaj(osoba3);

        Assertions.assertEquals(expectedResult,mnozina.getPriemer());

    }

    @ParameterizedTest
    @CsvSource(value = {"Janka,189,Bonifac,200,Igor,190,193","Danka,205,Kleopatra,174,Servac,149,176","Anka,183,Blanka,186,Ignac,180,183"})
    public void getPriemerTest(String meno1, double vyska1,String meno2, double vyska2,String meno3, double vyska3, double expectedResult){

        Osoba osoba1 = new Osoba(meno1, vyska1);
        Osoba osoba2 = new Osoba(meno2, vyska2);
        Osoba osoba3 = new Osoba(meno3, vyska3);

        MnozinaDat mnozina = new MnozinaDat();
        mnozina.pridaj(osoba1);
        mnozina.pridaj(osoba2);
        mnozina.pridaj(osoba3);

        Assertions.assertEquals(expectedResult,mnozina.getPriemer());

    }

    @ParameterizedTest
    @CsvSource(value = {"Janka,189,Bonifac,200,Igor,190,200,Bonifac","Danka,205,Kleopatra,174,Servac,149,205,Danka","Anka,183,Blanka,186,Ignac,180,186,Blanka"})
    public void getMaxOsobaTest(String meno1, double vyska1,String meno2, double vyska2,String meno3, double vyska3, double expectedResult1, String expectedResult2){

        Osoba osoba1 = new Osoba(meno1, vyska1);
        Osoba osoba2 = new Osoba(meno2, vyska2);
        Osoba osoba3 = new Osoba(meno3, vyska3);

        MnozinaDat mnozina = new MnozinaDat();
        mnozina.pridaj(osoba1);
        mnozina.pridaj(osoba2);
        mnozina.pridaj(osoba3);

        Assertions.assertEquals(expectedResult1,mnozina.getMaxOsoba().getVyska());
        Assertions.assertEquals(expectedResult2,mnozina.getMaxOsoba().getMeno());

    }

}

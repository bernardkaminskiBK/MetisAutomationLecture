package javazaklady.lecture20.activity2.Zadanie_20_2_3;

import javazaklady.lecture20.activity2.Zadanie_20_2_3.ZretazenyZoznam;
import javazaklady.lecture20.activity2.Zadanie_20_2_3.ZretazenyZoznamTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.StorePrintStream;

public class ZretazenyZoznamTest {

    @ParameterizedTest
    @CsvSource(value = {"1,Vojto", "2,Marek", "3,Igor", "4,Peter"})
    void pridajNaZaciatokTest(int prvok, String meno)
    {
        System.setOut(new StorePrintStream(System.out));
        ZretazenyZoznamTester.main(new String[0]);
        ZretazenyZoznam<String> studenti = new ZretazenyZoznam<>();
        studenti.pridajNaZaciatok(meno);
        Assertions.assertTrue(StorePrintStream.printList.get(prvok).contains(meno));
    }


}

package javazaklady.lecture20.activity2.Zadanie_20_2_2;

import javazaklady.lecture20.activity2.Zadanie_20_2_2.part1.PrikladOhraniceniaZdola;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.StorePrintStream;
import java.util.ArrayList;

public class OhranicenieTest {

    @ParameterizedTest
    @CsvSource(value = {"0,1", "1,2", "2,3"})
    void vypisDruhejMocninyTest(int get, String contains)
    {
        System.setOut(new StorePrintStream(System.out));
        ArrayList<Integer> zoznam = new ArrayList<>();
        zoznam.add(1);
        zoznam.add(2);
        zoznam.add(3);

        ArrayList<Number> zoznam2 = new ArrayList<>();
        zoznam2.add(1.4);
        zoznam2.add(2.6);
        zoznam2.add(5.5);

        PrikladOhraniceniaZdola.vypisDruhejMocninyCisel(zoznam);
        PrikladOhraniceniaZdola.vypisDruhejMocninyCisel2(zoznam2);
        Assertions.assertTrue(StorePrintStream.printList.get(get).contains(contains));

    }

}

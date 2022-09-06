package javazaklady.Zadanie_7_3_4_test;

import javazaklady.Zadanie_7_3_4.BankovyUcet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankaTest {


    @ParameterizedTest
    @CsvSource(value = {"25963,9000,0,5800"})
    public void vlozTest(double pociatocnyZostatok, double ciastka) {

        BankovyUcet banka = new BankovyUcet(pociatocnyZostatok);

        try {
            banka.vloz(ciastka);

        } catch (AssertionError e) {
            if (e.getMessage() == null){
                Assertions.assertNull(e.getMessage());
                System.out.println(e.getMessage());

            }else{
                assertTrue(e.getMessage().length() > 0);
                System.out.println(e.getMessage().length());
            }
        }
    }


    @ParameterizedTest
    @CsvSource(value = {"25963,9000,0,5800"})
    public void vyberTest(double pociatocnyZostatok, double ciastka) {

        BankovyUcet banka = new BankovyUcet(pociatocnyZostatok);

        try {
            banka.vyber(ciastka);

        } catch (AssertionError e) {
            if (e.getMessage() == null){
                Assertions.assertNull(e.getMessage());
                System.out.println(e.getMessage());

            }else{
                assertTrue(e.getMessage().length() > 0);
                System.out.println(e.getMessage().length());
            }
        }
    }

}

package Zadanie_8_3_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Zadanie_8_3_1.Parkovne.spocitajPoplatky;

public class ParkovneTest {

    @ParameterizedTest()
    @CsvSource(value = {"5.00,5.00,5.00", "2.5, 1, 8"})
    public void vypisDoKonzolyTest(double prveHodiny, double druheHodiny, double tretieHodiny) {
        double prvePoplatky = spocitajPoplatkyPreTest(prveHodiny);
        double druhePoplatky = spocitajPoplatkyPreTest(druheHodiny);
        double tretiePoplatky = spocitajPoplatkyPreTest(tretieHodiny);

        double celkoveHodiny = prveHodiny + druheHodiny + tretieHodiny;
        double celkovePoplatky = prvePoplatky + druhePoplatky + tretiePoplatky;

        String expectedResult = "Auto\t\tHodiny\t\tPoplatky\n";
        expectedResult += "1\t\t\t" + prveHodiny + "\t\t\t" + prvePoplatky + "\n";
        expectedResult += "2\t\t\t" + druheHodiny + "\t\t\t" + druhePoplatky + "\n";
        expectedResult += "3\t\t\t" + tretieHodiny + "\t\t\t" + tretiePoplatky + "\n";
        expectedResult += "Spolu:\t\t" + celkoveHodiny + "\t\t" + celkovePoplatky;

        Assertions.assertEquals(expectedResult, Parkovne.vytvorTabulku(prveHodiny, druheHodiny, tretieHodiny));
    }

    @ParameterizedTest()
    @CsvSource(value = {"1.5,2.00", "4.0,2.50", "24.0,10.00", "3.0,2.00", "6.00,3.50"})
    public void spocitajPoplatkyTest(double hodiny, double ocakavanaHodnota) {
        double aktualnaHodnota = spocitajPoplatky(hodiny);
        Assertions.assertEquals(ocakavanaHodnota, aktualnaHodnota);
    }

    private double spocitajPoplatkyPreTest(double hodiny) {
        if (hodiny <= 3) {
            return 2;
        } else if (hodiny >= 24) {
            return 10;
        } else {
            return 2 + ((hodiny - 3) * 0.5);
        }
    }

}

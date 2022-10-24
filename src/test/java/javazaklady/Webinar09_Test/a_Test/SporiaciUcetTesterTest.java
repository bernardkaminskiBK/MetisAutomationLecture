package javazaklady.Webinar09_Test.a_Test;

import javazaklady.Webinar09.a.CustomArgumentProvider;
import javazaklady.Webinar09.a.SporiaciUcet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

class SporiaciUcetTesterTest {

    private SporiaciUcet sporiaciUcet;

    @BeforeEach()
    public void setUp() {
        sporiaciUcet = new SporiaciUcet(10);
    }


    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class)
    void pripisUrokZminimalnehoPoslednehoZostatkuTest(Double[] mokData) {
        sporiaciUcet.vloz(mokData[0]);
        sporiaciUcet.zapisUrok();
        sporiaciUcet.vyber(mokData[1]);
        sporiaciUcet.vyber(mokData[2]);
        sporiaciUcet.vloz(mokData[3]);
        sporiaciUcet.zapisUrok();

        double expectedResult = mokData[4];
        Assertions.assertEquals(expectedResult, sporiaciUcet.getAktualnyZostatok());
    }

}

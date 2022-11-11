package javazaklady.Webinar09_Test.a_Test;

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
    void pripisUrokZminimalnehoPoslednehoZostatkuTest(Double[] mockData) {
        sporiaciUcet.vloz(mockData[0]);
        sporiaciUcet.zapisUrok();
        sporiaciUcet.vyber(mockData[1]);
        sporiaciUcet.vyber(mockData[2]);
        sporiaciUcet.vloz(mockData[3]);
        sporiaciUcet.zapisUrok();

        double expectedResult = mockData[4];
        Assertions.assertEquals(expectedResult, sporiaciUcet.getAktualnyZostatok());
    }

}

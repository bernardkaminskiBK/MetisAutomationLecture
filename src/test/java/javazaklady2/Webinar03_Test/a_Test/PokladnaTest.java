package javazaklady2.Webinar03_Test.a_Test;

import javazaklady2.Webinar03.part1.Pokladna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PokladnaTest {

    @ParameterizedTest
    @CsvSource(
            value = {"20.55,20,2,0,0,0,0,0,0.45",
                    "1,1,1,1,1,1,1,1,0.88",
                    "15.62,15,10,3,0,0,1,0,5"}
    )
    public void vratVydavokTest(
            double celkovaSumaTovaru,
            int pocet1EurovychMinci,
            int pocet50Centoviek,
            int pocet20Centoviek,
            int pocet10Centoviek,
            int pocet5Centoviek,
            int pocet2Centoviek,
            int pocetCentoviek,
            double ocakavanyVysledok
    ) {

        Pokladna pokladna = new Pokladna();

        pokladna.naskenujTovar(celkovaSumaTovaru);

        pokladna.prijmyEura(pocet1EurovychMinci);
        pokladna.prijmy50Centovky(pocet50Centoviek);
        pokladna.prijmy20Centovky(pocet20Centoviek);
        pokladna.prijmy10Centovky(pocet10Centoviek);
        pokladna.prijmy5Centovky(pocet5Centoviek);
        pokladna.prijmy2Centovky(pocet2Centoviek);
        pokladna.prijmyCentovky(pocetCentoviek);

        Assertions.assertEquals(ocakavanyVysledok, (Math.round(pokladna.vratVydavok() * 100.0) / 100.0));

    }
}

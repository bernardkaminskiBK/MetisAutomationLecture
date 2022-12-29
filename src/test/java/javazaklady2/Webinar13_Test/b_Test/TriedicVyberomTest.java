package javazaklady2.Webinar13_Test.b_Test;


import javazaklady2.Webinar13.b.Minca;
import javazaklady2.Webinar13.b.TriedicVyberom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class TriedicVyberomTest {


    @ParameterizedTest
    @CsvSource(value = {"0.50,0.20,1,2,Patdesiatcentovka,Dvadsatcentovka,Eurovka,Dvojeurovka,'[Minca [hodnota=0.2, nazov=Dvadsatcentovka], Minca [hodnota=0.5, nazov=Patdesiatcentovka], Minca [hodnota=1.0, nazov=Eurovka], Minca [hodnota=2.0, nazov=Dvojeurovka]]'"})
    public void triedicVyberomTest(double hodnotaMince1,double hodnotaMince2,double hodnotaMince3,double hodnotaMince4,String nazovMince1, String nazovMince2, String nazovMince3,String nazovMince4,String expectedResult) {

        Minca[] mince =
                {
                        new Minca(hodnotaMince1, nazovMince1),
                        new Minca(hodnotaMince2, nazovMince2),
                        new Minca(hodnotaMince3, nazovMince3),
                        new Minca(hodnotaMince4, nazovMince4),
                };

        TriedicVyberom triedic = new TriedicVyberom(mince);
        triedic.zotried();

        String actualResult = Arrays.toString(mince);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}

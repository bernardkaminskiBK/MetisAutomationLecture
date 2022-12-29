package javazaklady2.Webinar06_Test.d_Test;

import javazaklady2.Webinar06.d.Penazenka;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PenazenkaTest {

    @ParameterizedTest
    @CsvSource(value = {"Centovecka,Dvadsatcentovka,Dvojeurovka,Eurovka,false","Patdesiatcentovka,Dvadsatcentovka,Dvadsatcentovka,Patdesiatcentovka,true","Patcentovka,Dvojcentovka,Desatcentovka,Centovka,false"})
    public void jeObsahovoTotoznaSTest(String penazenka1Minca1,String penazenka1Minca2,String penazenka2Minca1,String penazenka2Minca2, boolean expectedResult){

        Penazenka penazenka1 = new Penazenka();
        penazenka1.pridajMincu(penazenka1Minca1);
        penazenka1.pridajMincu(penazenka1Minca2);

        Penazenka penazenka2 = new Penazenka();
        penazenka2.pridajMincu(penazenka2Minca1);
        penazenka2.pridajMincu(penazenka2Minca2);


        Assertions.assertEquals(expectedResult,penazenka1.jeObsahovoTotoznaS(penazenka2));
    }
}





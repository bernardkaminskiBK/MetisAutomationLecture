package java_spolocna_praca_s_lektorom.webinar03.Zadanie_3_2_3;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PokladnaSimulatorTest {

    @ParameterizedTest
    @CsvSource(value = {"0.99,1.59,1.69,0.39,5,5,3,4,0,1,0,0,12.690000000000001","5.90,8.69,5.36,2.58,15,5,3,4,0,1,0,0,14.819999999999993","9,8,5,3,7,8,13,4,0,1,0,0,4.350000000000001"})
    public void pokladna_test(double cenaTovaru1,double cenaTovaru2,double cenaTovaru3,double cenaTovaru4,int pocet2Eur, int pocetEur, int pocet50Cent, int pocet20Cent,
                              int pocet10Cent, int pocet5Cent, int pocet2Cent, int pocetCent, double expectedResult){
        PokladnaSimulator pokladna = new PokladnaSimulator();

        pokladna.naskenujTovar(cenaTovaru1);
        pokladna.naskenujTovar(cenaTovaru2);
        pokladna.naskenujTovar(cenaTovaru3);
        pokladna.naskenujTovar(cenaTovaru4);

        pokladna.prijmiHotovost( pocet2Eur,  pocetEur,  pocet50Cent,  pocet20Cent, pocet10Cent,  pocet5Cent, pocet2Cent, pocetCent);

        double actualResult = pokladna.vratVydavok();
        Assertions.assertEquals(expectedResult,actualResult);
    }
}

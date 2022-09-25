package java_spolocna_praca_s_lektorom.webinar02.Zadanie_2_2_3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PokladnaTest {

    @ParameterizedTest
    @CsvSource(value = {"0.99,1.59,1.69,0.39,0.77,3.0,5,4.11","5.90,8.69,5.36,2.58,6.80,10.98,5.75,1","9,8,5,3,10,7,10,2"})
    public void pokladna_test(double cenaTovaru1,double cenaTovaru2,double cenaTovaru3,double cenaTovaru4,double hotovost1,double hotovost2,double hotovost3, double expectedResult){
        Pokladna pokladna = new Pokladna();

        pokladna.naskenujTovar(cenaTovaru1);
        pokladna.naskenujTovar(cenaTovaru2);
        pokladna.naskenujTovar(cenaTovaru3);
        pokladna.naskenujTovar(cenaTovaru4);


        pokladna.prijmiHotovost(hotovost1);
        pokladna.prijmiHotovost(hotovost2);
        pokladna.prijmiHotovost(hotovost3);

        double actualResult = pokladna.vratVydavok();
        Assertions.assertEquals(expectedResult,actualResult);
    }
}

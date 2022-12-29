package javazaklady.lecture4.activity2.Zadanie_4_2_1_Test;

import javazaklady.lecture4.activity2.Zadanie_4_2_1.DanZPrijmu;
import javazaklady.lecture4.activity2.Zadanie_4_2_1.RodinnyStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.DecimalFormat;


class DanZPrijmuTesterTest {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @ParameterizedTest
    @CsvSource(value = {"10500,1,'1890.00','1890,00'", "24500,1, '5880.00','5880,00'", "15000,2,'4200.00','4200,00'", "40000,2,'12400.00','12400,00'"})
    public void danZPrijmuTest(int prijem, int rodinnyStav, String expectedResult, String expectedResult1) {
        DanZPrijmu danZPrijmu = new DanZPrijmu(getStavRodinnyStatus(rodinnyStav), prijem);
        // System.out.println(df.format(danZPrijmu.vypocitajDan()));
        // System.out.println(expectedResult);

        String ss = String.valueOf(df.format(danZPrijmu.vypocitajDan()));
        //Assertions.assertTrue(expectedResult1, df.format(danZPrijmu.vypocitajDan()));


        if (ss.contains(",")) {
            porovnanie(expectedResult1, danZPrijmu.vypocitajDan());
        } else {
            porovnanie(expectedResult, danZPrijmu.vypocitajDan());
        }
    }

    private void porovnanie(String expectedResult, double danZPrijmu) {
        Assertions.assertEquals(expectedResult, df.format(danZPrijmu));
    }

    private RodinnyStatus getStavRodinnyStatus(int stav) {
        return stav == 1 ? RodinnyStatus.ZENATY_VYDATA : RodinnyStatus.SLOBODNY_SLOBODNA;
    }


}

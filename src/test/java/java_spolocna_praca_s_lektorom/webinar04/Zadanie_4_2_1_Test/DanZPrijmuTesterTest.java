package java_spolocna_praca_s_lektorom.webinar04.Zadanie_4_2_1_Test;

import java_spolocna_praca_s_lektorom.webinar04.Zadanie_4_2_1.DanZPrijmu;
import java_spolocna_praca_s_lektorom.webinar04.Zadanie_4_2_1.RodinnyStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.DecimalFormat;


class DanZPrijmuTesterTest {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @ParameterizedTest
    @CsvSource(value = {"10500,1,'1575.00','1575,00'", "24500,1, '6860.00','6860,00'", "15000,2,'4200.00','4200,00'", "40000,2,'12400.00','12400,00'"})
    public void danZPrijmuTest(int prijem, int rodinnyStav, String expectedResult,String expectedResult1) {
        DanZPrijmu danZPrijmu = new DanZPrijmu(getStavRodinnyStatus(rodinnyStav), prijem);
       // System.out.println(df.format(danZPrijmu.vypocitajDan()));
       // System.out.println(expectedResult);

       String ss = String.valueOf(df.format(danZPrijmu.vypocitajDan()));

      //  System.out.println(df.format(danZPrijmu.vypocitajDan()).charAt(4));
        if(ss.contains(",")){
            Assertions.assertEquals(expectedResult1, df.format(danZPrijmu.vypocitajDan()));
        }else{
            Assertions.assertEquals(expectedResult, df.format(danZPrijmu.vypocitajDan()));
        }


    }

    private RodinnyStatus getStavRodinnyStatus(int stav) {
        return stav == 1 ? RodinnyStatus.ZENATY_VYDATA : RodinnyStatus.SLOBODNY_SLOBODNA;
    }


}

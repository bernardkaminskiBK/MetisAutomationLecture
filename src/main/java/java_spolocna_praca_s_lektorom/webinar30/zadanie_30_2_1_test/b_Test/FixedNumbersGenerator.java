package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_test.b_Test;

import java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Peter_Vasil_Verzia.NumbersGenerator;

/**
 * Always generate number
 */
public class FixedNumbersGenerator implements NumbersGenerator {
    @Override
    public int generate() {
        return 5;
    }
}

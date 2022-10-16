package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_test;

import zadanie_30_2_1.NumbersGenerator;

/**
 * Always generate number
 */
public class FixedNumbersGenerator implements NumbersGenerator
{
    @Override
    public int generate()
    {
        return 5;
    }
}

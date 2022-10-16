package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1;

import java.util.Random;

public class NumberService
{
    private final NumbersGenerator numbersGenerator;

    public NumberService(final NumbersGenerator numbersGenerator)
    {
        this.numbersGenerator = numbersGenerator;
    }

    public int sumTwoGeneratedIntiger()
    {
        final int intiger1 = numbersGenerator.generate();
        final int intiger2 = numbersGenerator.generate();
        return intiger1 + intiger2;
    }
}

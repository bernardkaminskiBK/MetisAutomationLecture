package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1;

import java.util.Random;

public class RandomNumbersGenerator implements NumbersGenerator
{
    @Override
    public int generate()
    {
        return new Random().nextInt();
    }
}

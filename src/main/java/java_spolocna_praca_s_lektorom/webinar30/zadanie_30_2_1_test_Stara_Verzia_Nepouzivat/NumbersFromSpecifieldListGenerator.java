/*package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_test;

import zadanie_30_2_1.NumbersGenerator;

import java.util.List;

public class NumbersFromSpecifieldListGenerator implements NumbersGenerator
{
    private final List<Integer> integers;
    private int currentIndex = 0;

    public NumbersFromSpecifieldListGenerator(final List<Integer> integers)
    {
        this.integers = integers;
    }

    @Override
    public int generate()
    {
        final Integer number = integers.get(currentIndex);
        currentIndex++;
        return number;
    }
}
*/
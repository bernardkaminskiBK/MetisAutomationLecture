/*
package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1__test;

import org.junit.jupiter.api.Test;
import zadanie_30_2_1.NumberService;
import zadanie_30_2_1.NumbersGenerator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class NumberServiceTest
{
    private final NumbersGenerator numbersGenerator = mock(NumbersGenerator.class);

    @Test
    void sumOfTwoGeneratedNumbersIsTen()
    {
        doReturn(4).doReturn(6).when(numbersGenerator).generate();

        final int sum = new NumberService(numbersGenerator).sumTwoGeneratedIntiger();

        assertThat(sum).isEqualTo(10);
    }
}
*/
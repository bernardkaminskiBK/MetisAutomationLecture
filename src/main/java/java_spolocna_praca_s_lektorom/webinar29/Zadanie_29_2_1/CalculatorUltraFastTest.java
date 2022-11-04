package java_spolocna_praca_s_lektorom.webinar29.Zadanie_29_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("ultrafast")
class CalculatorUltraFastTest {

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }
}
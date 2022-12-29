package javazaklady.lecture29.activity2.Zadanie_29_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorDisableTest {

    @Test
    @Disabled
    void whenGoingToSumTwoNumbers_thenResultIsCorrect(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect1(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect2(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect3(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect4(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }
}
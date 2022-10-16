import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @Disabled
    void whenGoingToSumTwoNumbers_thenResultIsCorrect(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }

    @Test
        //@Disabled
    void whenGoingToCompareTwoNumbers_thenResultIsCorrect0(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }

    @Test
        //@Disabled
    void whenGoingToSumTwoNumbers_thenResultIsCorrect1(){
        assertEquals("askdjnasd","askjdnasd");
    }

}
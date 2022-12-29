package javazaklady.lecture29.activity2.Zadanie_29_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test started");
    }

    @Test
    void one(){
        System.out.println("test: 1");
    }

    @Test
    void two(){
        System.out.println("test: 2");
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        if (result != 5){
            throw new RuntimeException("Sum 2 + 3 should be 5 but was " + result);
        }
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect0(){
        final int num1 = 2;
        final int num2 = 3;

        final int result = new Calculator().sum(num1,num2);

        Assertions.assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
    }
//
    @Test
    void whenGoingToCompareTwoNumbers_thenResultIsCorrect1(){
        final int result = new Calculator().sum(2, 3);

        assertEquals(5,result,"Sum 2 + 3 should be 5 but was " + result);
        assertEquals("asdjnkasd", "askdjnasd");
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect2(){
        assertEquals("askdjnasd","askjdnasd");
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect3(){
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect4(){
        boolean result = false;
        assertFalse(result);
        assertEquals(false, result);
        assertTrue(result);
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect5(){
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                throw new RuntimeException();
            }
        });
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect6(){
        assertThrows(RuntimeException.class, () -> {new Calculator().sum(-1, -1); });
    }

    @Test
    void whenGoingToSumTwoNumbers_thenResultIsCorrect7(){
        assertThat(12).isEqualTo(12);
        assertEquals(12, 12);
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> {
                    throw new RuntimeException();
                });
    }
}
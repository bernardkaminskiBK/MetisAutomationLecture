package javazaklady.lecture29.activity2.Zadanie_29_2_1;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CalculatorLifeCycleTest {

    private final Calculator calculator = new Calculator();

    public CalculatorLifeCycleTest(){
        System.out.println("Instance of CalculatorLifeCycleTest created");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Tests in CalculatorLifeCycleTest class started");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Test started");
    }

    @Test
    void one(){
        calculator.sum(1, 2);
        System.out.println("test: 1");
    }

    @Test
    void two(){
        calculator.sum(1, 2);
        System.out.println("test: 2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ended");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Tests in CalculatorLifeCycleTest class ended");
    }
}
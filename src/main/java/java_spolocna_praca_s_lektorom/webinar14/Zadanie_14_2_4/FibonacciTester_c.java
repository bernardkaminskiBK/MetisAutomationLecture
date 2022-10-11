package java_spolocna_praca_s_lektorom.webinar14.Zadanie_14_2_4;

// 0. clen = 0
// 1. clen = 1
// 2. clen = 1
// 3. clen = 2
// 4. clen = 3
// 5. clen = 5
// 6. clen = 8
// 7. clen = 13
// 8. clen = 21
// 9. clen = 34
// 10. clen = 55
// ...
// n. clen = ?

public class FibonacciTester_c {

    public static void main(String[] args) {
        System.out.printf("Fibonacci(10): %.0f%n", fibonacci(10));
        System.out.printf("Fibonacci(20): %.0f%n", fibonacci(20));
        System.out.printf("Fibonacci(49): %.0f%n", fibonacci(49));
    }

    private static double fibonacci(int cislo) {
        if (cislo <= 2) {       // if (cislo == 1 || cislo == 2)
            return 1;
        }

        return fibonacci(cislo - 1) + fibonacci(cislo - 2);
    }
}

package javazaklady.lecture5.activity2.Zadanie_5_2_3.part2;

public class LogickeSpojkyTester {
    public static void main(String[] args) {
        // vytvor tabulku pravdivostnych hodnot pre spojku AND &&
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n%n",
                "Spojka and (&&)",
                "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));

        // vytvor tabulku pravdivostnych hodnot pre spojku OR ||
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n%n",
                "Spojka or (||)",
                "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));

        // vytvor tabulku pravdivostnych hodnot pre spojku XOR ^
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n%n",
                "Spojka or (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));

        // vytvor tabulku pravdivostnych hodnot pre spojku XOR ^
        System.out.printf("%s%n%s: %b%n%s: %b%n",
                "Negacia NOT (!)",
                "!false", (!false),
                "!true", (!true));
    }
}

package javazaklady2.Webinar05_Test.part2;


import javazaklady2.Webinar05.part2.GeneratorMocniny;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeneratorMocninyTest {

    @Test
    void dalsiaMocninaTest() {

        String result = "";
        String expectedResult = "1\n" +
                "10\n" +
                "100\n" +
                "1000\n" +
                "10000\n" +
                "100000\n" +
                "1000000\n" +
                "10000000\n" +
                "100000000\n" +
                "1000000000\n" +
                "10000000000\n" +
                "100000000000";
        GeneratorMocniny gm = new GeneratorMocniny(10);
        for (int i = 0; i < 12; i++) {
            result += gm.dalsiaMocnina() + "\n";
        }

        System.out.println(result);
        Assertions.assertEquals(expectedResult.strip(), result.strip());
    }
}

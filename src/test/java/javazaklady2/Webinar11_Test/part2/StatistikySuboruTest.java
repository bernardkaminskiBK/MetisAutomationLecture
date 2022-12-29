package javazaklady2.Webinar11_Test.part2;

import javazaklady.lecture11.activity3.part2.StatistikySuboru;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatistikySuboruTest {
    private StatistikySuboru statistiky;

    private static final String TXT_SRC_1 = "TestFiles/text.txt";
    private static final String TXT_SRC_2 = "TestFiles/text2.txt";
    private static final String TXT_SRC_3 = "TestFiles/text3.txt";
    private static final String INVALID_TXT_SRC = "path of file does not exist...";

    @Test
    void getPocetZnakovTest() {
        statistiky = new StatistikySuboru();

        statistiky.nacitajVstupneDataZoSuboru(TXT_SRC_1);
        statistiky.nacitajVstupneDataZoSuboru(TXT_SRC_2);
        statistiky.nacitajVstupneDataZoSuboru(INVALID_TXT_SRC);

        Assertions.assertEquals(181, statistiky.getPocetZnakov());
    }

    @Test
    void getPocetSlovTest() {
        statistiky = new StatistikySuboru();

        statistiky.nacitajVstupneDataZoSuboru(TXT_SRC_1);
        statistiky.nacitajVstupneDataZoSuboru(INVALID_TXT_SRC);

        Assertions.assertEquals(7, statistiky.getPocetSlov());
    }

    @Test
    void getPocetRiadkovTest() {
        statistiky = new StatistikySuboru();

        statistiky.nacitajVstupneDataZoSuboru(TXT_SRC_1);
        statistiky.nacitajVstupneDataZoSuboru(TXT_SRC_2);
        statistiky.nacitajVstupneDataZoSuboru(TXT_SRC_3);
        statistiky.nacitajVstupneDataZoSuboru(INVALID_TXT_SRC);

        Assertions.assertEquals(16, statistiky.getPocetRiadkov());
    }

}

package javazaklady.Zadanie_13_3_3_Test;

import javazaklady.Zadanie_13_3_3.TriedenieVyberomCasovac;
import org.apache.commons.lang3.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class TriedenieVyberomCasovacTest {

    private final Range<Integer> milisecondRange = Range.between(10, 1200);
    private final Range<Integer> nRange = Range.between(10000, 60000);

    @RepeatedTest(3)
    void vygenerujCasBehuProgramuTest() {
        for (int i = 1; i <= 6; i++) {
            String generator = findIntInString(TriedenieVyberomCasovac.vygenerujCasBehuProgramu(10000, 60000, i));

            System.out.println(getActualNFrom(generator) + " " + getActualRunningTimeFrom(generator));

            Assertions.assertTrue(nRange.contains(getActualNFrom(generator)) && milisecondRange.contains(getActualRunningTimeFrom(generator)));
        }
    }

    private static Integer getActualNFrom(String generator) {
        return Integer.parseInt(generator.substring(0, 6).trim()); // Ziskame N cislo z stringu
    }

    private static Integer getActualRunningTimeFrom(String generator) {
        StringBuilder builder = new StringBuilder(generator);
        builder.replace(0, 6, "");
        return Integer.parseInt(builder.toString()); // Ziskame milisecondy z stringu
    }

    private static String findIntInString(String str) {
        //First we replace all the non-numeric characters with space
        str = str.replaceAll("[^\\d]", " ");

        //Remove all the trailing spaces
        str = str.trim();

        //Replace consecutive white spaces with one white space
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }

}

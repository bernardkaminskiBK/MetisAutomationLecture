package javazaklady.Webinar14_Test.c_Test;

import javazaklady.Webinar14.c.TriedenieVkladanimCasovac;
import org.apache.commons.lang3.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.*;

class TriedenieVkladanimCasovacTest {

    private int passedTimeOfSorting;
    private int indexOfSearchedElement;
    private int passedTimeOfSearching;

    /**
     * V tomto teste neriesime porovnavacky konkretnych hodnot, myslienka testu vplyva v tom ze metoda testovanej triedy
     * musi vratit retazec o informacii o vysledku behu programu cize meranie casu triedenia pola a vyhladavanie prvku v poli
     * ten retazec musi obsahovat dane hodnoty ktore sa nasledne skumaju a mi hodnotime iba to ci sa tieto hodnoty zmestia do nejakeho rozsahu
     * cisel a ak sa zmestia tak vieme prehlasit kludne ze nazvy tried su spravne zadane a tie objekty ktore je nutne prevolat na testovanie
     * su spravne implementovane a su k dispozicii a robia to co maju robit.
     */
    @ParameterizedTest
    @CsvSource(value = {"10000, 1235,0, 1234", "20000, 2,0, 300", "5000, 259,0, 258"})
    public void statistikyTest(int numberOfElements, int searchedNumber, int fromRange, int toRange) {
        String statistics = TriedenieVkladanimCasovac.statistiky(generateMockDataInRange(numberOfElements), searchedNumber);
        getDataFromInputString(findIntInString(statistics));

        Range<Integer> expectedRange = Range.between(fromRange, toRange);

        Assertions.assertTrue(
                expectedRange.contains(this.passedTimeOfSearching) &&
                        expectedRange.contains(this.passedTimeOfSorting) &&
                        expectedRange.contains(this.indexOfSearchedElement)
        );

        System.out.println(statistics + "\n");
    }

    private void getDataFromInputString(String statistics) {
        String[] numbers = statistics.split(" ", 4);

        this.passedTimeOfSorting = Integer.parseInt(numbers[0]);
        this.indexOfSearchedElement = Integer.parseInt(numbers[2]);
        this.passedTimeOfSearching = Integer.parseInt(numbers[3]);
    }

    private static int[] generateMockDataInRange(int range) {
        Integer[] numbers = new Integer[range];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        Collections.shuffle(Arrays.asList(numbers));

        return Arrays.stream(numbers).mapToInt(Integer::intValue).toArray();
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

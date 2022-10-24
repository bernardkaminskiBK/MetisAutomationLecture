package javazaklady.Webinar13_Test.c_Test;

import javazaklady.Webinar13.c.TriedenieVyberomCasovac;
import org.apache.commons.lang3.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriedenieVyberomCasovacTest {

    // Rozsah zbehnutie algoritmu je medzi 10 a 2000 milisekund, nie je dolezite presna hodnota trvanie zotriedenia pola ale musime urcit
    // vyssi rozsah z dovodu ze kazdemu zelezu to trva iny cas zotriedit urcity pocet dat
    private final Range<Integer> milisecondsRange = Range.between(0, 2000);
    private final Range<Integer> nRangeNumberOfElements = Range.between(1000, 60000);
    private int actualRunningTime;
    private int actualN;

    /**
     * V tomto teste neriesime porovnavacky konkretnych hodnot, myslienka testu vplyva v tom ze metoda testovanej triedy
     * musi vratit retazec o informacii o vysledku behu programu cize meranie casu triedenia pola.
     * Ocakavany retazec musi obsahovat dane hodnoty ktore sa nasledne skumaju a mi hodnotime iba to ci sa tieto hodnoty zmestia
     * do nejakeho rozsahu (vopred s nami urcenych cisel) a ak sa zmestia tak vieme prehlasit kludne ze nazvy tried su spravne zadane a
     * tie objekty ktore je nutne prevolat na testovanie su spravne implementovane a su k dispozicii a robia to co maju robit.
     */
    @ParameterizedTest()
    @CsvSource(value = {"10000, 60000, 6", "1000, 3000, 3", "1000, 10000, 9"})
    void vygenerujCasBehuProgramuTest(int dolnaVelkost, int hornaVelkost, int pocetBehov) {
        for (int i = 1; i <= pocetBehov; i++) {
            String generator = findIntInString(TriedenieVyberomCasovac.vygenerujCasBehuProgramu(dolnaVelkost, hornaVelkost, i));
            getDataFromInputString(generator);

            Assertions.assertTrue(nRangeNumberOfElements.contains(actualN) && milisecondsRange.contains(actualRunningTime));

            System.out.println(actualN + " " + actualRunningTime);
        }
    }

    private void getDataFromInputString(String generator) {
        String[] numbers = generator.split(" ", 2);

        this.actualN = Integer.parseInt(numbers[0]);
        this.actualRunningTime = Integer.parseInt(numbers[1]);
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

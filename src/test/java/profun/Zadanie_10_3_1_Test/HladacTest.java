package profun.Zadanie_10_3_1_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HladacTest {

    int[] cisla = {1, 8, 3, 4, 50, 25, 30, 45, 80, 55};

    @ParameterizedTest
    @CsvSource(value = {"1,0", "80,8", "55,9", "25,5"})
    public void vyhladajCislaTest(int hladaneCislo, int ockavanaHodnota) {
        int aktualnyVysledok = sk.itvkurze.antoska.zadanie_10_3_1.Hladac.vyhladajCislo(cisla, hladaneCislo);
//        int aktualnyVysledok = sk.itvkurze.hubay.zadanie_10_3_1.Hladac.vyhladajCislo(cisla, cisla.length, hladaneCislo);
//        int aktualnyVysledok = sk.itvkurze.mesko.zadanie_10_3_1.Hladac.vyhladajCislo(cisla, cisla.length, hladaneCislo);
        Assertions.assertEquals(ockavanaHodnota, aktualnyVysledok);
    }

    @ParameterizedTest
    @CsvSource(value = {"11", "809", "5510", "256"})
    public void neuspesneVyhladavanieCisielTest(int hladaneCislo) {
        int aktualnyVysledok = sk.itvkurze.antoska.zadanie_10_3_1.Hladac.vyhladajCislo(cisla, hladaneCislo);
//        int aktualnyVysledok = sk.itvkurze.hubay.zadanie_10_3_1.Hladac.vyhladajCislo(cisla, cisla.length, hladaneCislo);
//        int aktualnyVysledok = sk.itvkurze.mesko.zadanie_10_3_1.Hladac.vyhladajCislo(cisla, cisla.length, hladaneCislo);
        Assertions.assertEquals(-1, aktualnyVysledok);
    }

}

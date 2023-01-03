package academy.metis.profun.lecture4.activity3.part1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class UverPoplatkyTest {

    @ParameterizedTest
    @CsvSource(value = {"10000,8,50","5000,3,3","120000,2,30"})
    public void vypocitajUrokovuSadzbuTest(double vyskaUveru, double urokovaSadzba, double obdobieViazanosti) {

       double actualResult = UverPoplatky.vyratajUrokovuSadzbu(vyskaUveru,urokovaSadzba,obdobieViazanosti);
       double expectedResult = vyskaUveru * urokovaSadzba * (obdobieViazanosti/365);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

package javazaklady2.Webinar14_Test.part4;

import javazaklady.lecture14.activity3.part4.Osoba;
import javazaklady.lecture14.activity3.part4.OsobyDemo;
import javazaklady2.Webinar14_Test.part4.utils.NameArgumentProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.ArrayList;

class OsobyDemoTest {

    @ParameterizedTest
    @ArgumentsSource(NameArgumentProvider.class)
    void zisitMenoPrvehoAPoslednehoVZozname(String[] names, String[] expectedResults) {
        ArrayList<Osoba> osoby = new ArrayList<>();

        for (String name : names) {
            osoby.add(new Osoba(name));
        }

        String result = OsobyDemo.zisitMenoPrvehoAPoslednehoVZozname(osoby);

        int prveMeno = result.indexOf(expectedResults[0]);
        int posledneMeno = result.indexOf(expectedResults[1]);

        Assertions.assertTrue(prveMeno < posledneMeno && prveMeno != -1  || posledneMeno != -1);
    }

}

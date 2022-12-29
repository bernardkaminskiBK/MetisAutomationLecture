package javazaklady.lecture15.activity3.part2;

import javazaklady.lecture15.activity3.part2.ZretazenyZoznamUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.LinkedList;


class ZretazenyZoznamUtilTesterTest {

    @RepeatedTest(3)
    public void revertListOfStudentsTest() {
        LinkedList<String> studenti = new LinkedList<String>();

        studenti.add("Peter");
        studenti.add("Vojto");
        studenti.add("Emil");
        studenti.add("Evka");

        LinkedList<String> studentiVRevernomPoradi = ZretazenyZoznamUtil.reverz(studenti);

        Assertions.assertEquals("[Evka, Emil, Vojto, Peter]",studentiVRevernomPoradi.toString());
    }

}

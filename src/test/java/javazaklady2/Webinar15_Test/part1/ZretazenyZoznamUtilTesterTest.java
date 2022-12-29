package javazaklady2.Webinar15_Test.part1;

import javazaklady.lecture15.activity3.part1.ZretazenyZoznamUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.LinkedList;

class ZretazenyZoznamUtilTesterTest {

    @RepeatedTest(3)
    public void addStudentToLinkedListTest() {
        LinkedList<String> studenti = new LinkedList<String>();

        studenti.add("Peter");
        studenti.add("Vojto");
        studenti.add("Emil");
        studenti.add("Evka");

        ZretazenyZoznamUtil.odstranOd(studenti, "Emil");

        Assertions.assertEquals("[Peter, Vojto]", studenti.toString());
    }

}

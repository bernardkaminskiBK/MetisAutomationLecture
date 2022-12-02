package javazaklady.Webinar15_Test.a_Test;

import javazaklady.Webinar15.a.ZretazenyZoznamUtil;
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
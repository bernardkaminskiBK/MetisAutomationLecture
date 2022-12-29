package javazaklady2.Webinar15.part1;

import java.util.LinkedList;

public class ZretazenyZoznamUtilTester {

    public static void main(String[] args) {
        LinkedList<String> studenti = new LinkedList<String>();

        studenti.add("Peter");
        studenti.add("Vojto");
        studenti.add("Emil");
        studenti.add("Evka");

        System.out.println(studenti);

        ZretazenyZoznamUtil.odstranOd(studenti, "Emil");

        System.out.println(studenti);
        System.out.println("Ocakavana hodnota: [Peter, Vojto]");

    }

}

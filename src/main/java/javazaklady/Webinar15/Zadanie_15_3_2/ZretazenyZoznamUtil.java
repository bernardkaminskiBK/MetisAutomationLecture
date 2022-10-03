package javazaklady.Webinar15.Zadanie_15_3_2;

import java.util.Iterator;
import java.util.LinkedList;

public class ZretazenyZoznamUtil {
    public static LinkedList<String> reverz(LinkedList<String> studenti) {
        Iterator<String> iterator = studenti.descendingIterator();

        LinkedList<String> reverznyZretazenyZoznam = new LinkedList<>();

        while (iterator.hasNext()){
            String menoStudenta = iterator.next();
            reverznyZretazenyZoznam.add(menoStudenta);
        }
        return reverznyZretazenyZoznam;
    }
}
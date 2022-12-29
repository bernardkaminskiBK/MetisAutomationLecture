package javazaklady.lecture15.activity3.part1;

import java.util.LinkedList;
import java.util.ListIterator;


public class ZretazenyZoznamUtil {

    /**
     * Metoda vyuziva iterator zretaznenho zoznamu na zmazanie prvkou od daneho kluca
     *
     * @param nazov zretazeny zoznam prvkov
     * @param kluc  prvok od ktoreho iterator vymaze dalsie prvky
     */
    public static void odstranOd(LinkedList<String> nazov, String kluc) {
        ListIterator<String> iterator = nazov.listIterator();
        for (int i = 0; i < nazov.size(); i++) {
            String dalsiStudent = iterator.next();

            if (dalsiStudent.equals(kluc)) {
                iterator.remove();

                while (iterator.hasNext()) {
                    iterator.next();
                    iterator.remove();
                }
            }
        }


    }

}

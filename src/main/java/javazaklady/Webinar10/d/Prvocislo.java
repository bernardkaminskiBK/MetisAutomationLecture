package javazaklady.Webinar10.d;

import java.util.ArrayList;
import java.util.Collections;

public class Prvocislo {

    /**
     * instancne premenne
     */
    private int cislo;

    /**
     * vytvori zoznam prvocisel
     */
    private final ArrayList<Integer> prvocislaZoznam = new ArrayList<>();

    /**
     * nacita cislo od uzivatela
     *
     * @param cislo cislo
     */
    public Prvocislo(int cislo) {
        this.cislo = cislo;
    }

    /**
     * zisti cei je dane cislo prvocislo
     *
     * @return vracia true/false
     */
    public boolean zistiPrvocislo() {
        for (int i = 2; i < cislo; i++) {
            if (cislo % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * pridava prvocisla do zoznamu
     */
    public void urobZoznam() {
        do {
            if (zistiPrvocislo()) {
                prvocislaZoznam.add(cislo);
            }
            cislo = cislo - 1;
        }
        while (cislo >= 2);
    }

    /**
     * zisti poradie zadaneho cisla
     *
     * @return vracia poradie
     */
    public int getPoradiePrvocisla() {
        urobZoznam();
        Collections.sort(prvocislaZoznam);
        return prvocislaZoznam.size();
    }
}

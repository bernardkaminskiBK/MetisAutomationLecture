package javazaklady.lecture15.activity3.part4;

import java.util.LinkedList;

public class Zasobnik {

    private LinkedList<Integer> data;

    /**
     * Vytvara novy objekt triedy Zasobnik v podobe zretazeneho zoznamu
     */
    public Zasobnik(){
        this.data = new LinkedList<>();
    }

    /**
     * Vklada prvok na koniec zretazeneho zoznamu
     * @param prvok ktory sa vlozi na vrchol zoznamu
     */
    public void vloz(int prvok) {
        data.push(prvok);
    }

    /**
     * Metoda odstrani prvok z vrcholu zretazeneho zoznamu
     * @return vrati zretazeny zoznam bez odstraneneho prvku
     */
    public int vyber() {
        return data.pop();
    }

    /**
     *
     * @return
     */
    public int prvokNaVrchole() {
        if (!data.isEmpty()){
            return data.peek();
        }
        return 0;
    }

    /**
     * Metoda vracia velkost zretazeneho zoznamu
     * @return velkost zretazeneho zoznamu
     */
    public int getVelkost() {
        return data.size();
    }

    /**
     * Metoda zistuje ci zretazeny zoznam neobsahuje ziadny prvok,
     * vlastne ci je prazdny
     * @return true ak je prazdny
     */
    public boolean jePrazdny() {
        return data.isEmpty();
    }
}

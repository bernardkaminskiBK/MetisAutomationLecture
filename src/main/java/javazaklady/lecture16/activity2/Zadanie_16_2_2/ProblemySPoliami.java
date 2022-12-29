package javazaklady.lecture16.activity2.Zadanie_16_2_2;

import java.util.ArrayList;

public class ProblemySPoliami
{
    public static void main(String[] args)
    {
        // 1) Vytvor 2 lubovolne vyrobky
        Vyrobok kniha = new Vyrobok("Java", 30, 0.3);
        Vyrobok pocitac = new Vyrobok("Lenovo Thinkpad", 1200, 2.6);

        // 2) Vytvor zoznam vyrobkov o velkosti 2 prvkov a rovno tam pridaj predpripravene vyrobky
        ArrayList<Vyrobok> vyrobky = new ArrayList<>();
        vyrobky.add(kniha);
        vyrobky.add(pocitac);

        //List<Vyrobok> vyrobky = Arrays.asList(kniha, pocitac); // nemenny zoznam, t.j. nemozes pridavat do zoznamu dalsie prvky

        // 3) Vypis zoznam vyrobkov - Arrays.toString()
        System.out.println(vyrobky);

        // 4) Vyskusaj pridat do zoznamu treti prvok, t. j. novy lubovolny vyrobok
        vyrobky.add(new Vyrobok("Python", 0.4));

        // 5) Vytvor metodu, ktora fixne problem v 4. bode
        Vyrobok novyVyrobok = new Vyrobok("Javascript", 0.29);
        vyrobky.add(novyVyrobok);

        // 6) Vypis velkost zoznamu
        System.out.println("Velkost zoznamu: " + vyrobky.size());

        // 7) Over, ci zoznam obsahuje vyrobky (Python, 0.4)
        System.out.println("Obsahuje zoznam vyrobok: Python ...? " + vyrobky.contains(new Vyrobok("Python", 0.4)));

        // 8) Odstran vyrobok (Javascript, 0.29)
        vyrobky.remove(novyVyrobok);

        // 9) Vypis zoznam vyrobkov
        System.out.println(vyrobky);
    }
}

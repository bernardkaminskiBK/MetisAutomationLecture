package academy.metis.javazaklady.lecture16.activity2.Zadanie_16_2_1;

import java.util.Arrays;

public class ProblemySPoliami
{
    public static void main(String[] args)
    {
        // 1) Vytvor 2 lubovolne vyrobky
        Vyrobok kniha = new Vyrobok("Java", 30, 0.3);
        Vyrobok pocitac = new Vyrobok("Lenovo Thinkpad", 1200, 2.6);

        // 2) Vytvor pole vyrobkov o velkosti 2 prvkov a rovno tam pridaj predpripravene vyrobky
        Vyrobok[] vyrobky = { kniha, pocitac };

        // 3) Vypis pole vyrobkov - Arrays.toString()
        System.out.println(Arrays.toString(vyrobky));

        // 4) Vyskusaj pridat do pola treti prvok, t. j. novy lubovolny vyrobok
        // vyrobky[2] = new Vyrobok("Python", 0.4);

        // 5) Vytvor metodu, ktora fixne problem v 4. bode
        Vyrobok novyVyrobok = new Vyrobok("Javascript", 0.29);
        vyrobky = pridajPrvok(novyVyrobok, vyrobky);

        // 6) viackrat otestuj metodu z bodu 5, t.j. pridavanie prvkov do pola a nasledne vypis obsah pola
        vyrobky = pridajPrvok(kniha, vyrobky);
        vyrobky = pridajPrvok(pocitac, vyrobky);
        vyrobky = pridajPrvok(novyVyrobok, vyrobky);

        System.out.println("Aktualna velkost pola: " + vyrobky.length);
        System.out.println(Arrays.toString(vyrobky));
    }

    private static Vyrobok[] pridajPrvok(Vyrobok novyVyrobok, Vyrobok[] vyrobky)
    {
        int velkost = vyrobky.length;
        Vyrobok[] novePole = Arrays.copyOf(vyrobky, velkost + 1);
        novePole[velkost] = novyVyrobok;
        return novePole;
    }
}

package javazaklady.lecture5.activity2.Zadanie_5_2_3.part1;

public class Rande {
    public static void main(String[] args) {
        // na rande pojdem, ak budu splnene podmienky:
        // 1) vek do 18 do 25
        // 2) slobodna

        int vek = 33;
        boolean jeSlobodna = true;

        if ((vek >= 18 && vek <= 25) || jeSlobodna)
        {
            System.out.println("Podme teda randit :-)");
        }
        else {
            System.out.println("Na rande sa nepojde ...");
        }
    }
}
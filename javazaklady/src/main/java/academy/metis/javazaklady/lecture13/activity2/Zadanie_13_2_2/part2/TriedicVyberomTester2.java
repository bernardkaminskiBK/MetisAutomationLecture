package academy.metis.javazaklady.lecture13.activity2.Zadanie_13_2_2.part2;


import academy.metis.javazaklady.lecture13.activity2.Zadanie_13_2_1.Stopky;
import academy.metis.javazaklady.lecture13.activity2.Zadanie_13_2_2.part1.PoleUtil;
import academy.metis.javazaklady.lecture13.activity2.Zadanie_13_2_2.part1.TriedicVyberom;

public class TriedicVyberomTester2 {
    public static void main(String[] args) {
        // int[] data = {-1, 1, -2, 2, -3, 4, 0, -5};
        // 10000 prvkove pole, rozpltyl cisel od 1 do 1 000 000
        int[] data = PoleUtil.vygenerujPoleCisel(160000, 1, 1000000);

        Stopky stopky = new Stopky();
        TriedicVyberom triedic = new TriedicVyberom(data);

        stopky.spust();
        triedic.zotried();
        stopky.zastav();

        System.out.println("Uplynuly cas triedenia: " + stopky.getUplynulyCas() + " ms");
    }
}

package java_spolocna_praca_s_lektorom.webinar14.triedenie_vkladanim;

import java.util.Arrays;

public class TriedenieVkladanimTester {
    public static void main(String[] args) {
        // int[] data = {-1, 1, -2, 2, -3, 4, 0, -5};
        // 10000 prvkove pole, rozpltyl cisel od 1 do 1 000 000
        int[] data = PoleUtil.vygenerujPoleCisel(10000, 1, 1000000);

        TriedicVkladanim triedic = new TriedicVkladanim(data);

        // 1) vypis pole dat pred zotriednim
        System.out.println("Data pred zotriedenim: ");
        System.out.println(Arrays.toString(data));

        triedic.zotried();

        // 2) vypis pole dat po zotriedeni
        System.out.println("\nData po zotriedeni: ");
        System.out.println(Arrays.toString(data));
    }
}

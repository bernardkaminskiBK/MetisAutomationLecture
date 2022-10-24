package javazaklady.Webinar13.d;


import java.util.Arrays;

public class TriedenieZlucenimTester {
    public static void main(String[] args) {
        String[] retazce = { "Programovanie", "v", "Jave", "nas", "bavi"};

        TriedicZlucenim triedic = new TriedicZlucenim(retazce);
        triedic.zotried();


        System.out.println(Arrays.toString(retazce));
        System.out.println("Ocakavany vystup: [Jave, Programovanie, bavi, nas, v]");
    }
}

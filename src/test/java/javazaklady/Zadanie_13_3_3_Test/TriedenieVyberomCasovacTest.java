package javazaklady.Zadanie_13_3_3_Test;


import javazaklady.Zadanie_13_3_3.Stopky;
import javazaklady.Zadanie_13_3_3.TriedicVyberom;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriedenieVyberomCasovacTest {


    @ParameterizedTest
    @CsvSource(value = {"1,1,1"})
    public void triedicVyberomTest(double hodnotaMince1,double hodnotaMince2,double hodnotaMince3) {
        String expectedResult = "";
        int s = 0;
        int[] data = {500000,400000,800000,500000};

        for (int i = 0; i < data.length ; i++) {
           s = data[i];

        }


        TriedicVyberom triedic = new TriedicVyberom(data);
        Stopky stopky = new Stopky();
        stopky.spust();
        triedic.zotried();
        stopky.zastav();
        //long casSpustenia = System.currentTimeMillis();
        System.out.println("n : "+ data.length + ". Cas behu programu: " + stopky.getUplynulyCas() + " ms" + s);


        long casSpustenia = System.currentTimeMillis();

        long casZastavenia = System.currentTimeMillis();
      long  uplynulyCas = casZastavenia - casSpustenia;
        System.out.println(uplynulyCas);
    }

    public static int[] vygenerujPoleCisel100000() {
        int[] pole = new int[100000];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = 1;
        }
        return pole;
    }

}

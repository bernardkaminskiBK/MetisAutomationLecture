package javazaklady.Webinar15.b;
import java.util.LinkedList;

public class ZretazenyZoznamUtilTester {

    public static void main(String[] args) {
        LinkedList<String> studenti = new LinkedList<String>();

        studenti.add("Peter");
        studenti.add("Vojto");
        studenti.add("Emil");
        studenti.add("Evka");

        System.out.println(studenti);

        LinkedList<String> studentiVRevernomPoradi = ZretazenyZoznamUtil.reverz(studenti);

        System.out.println(studentiVRevernomPoradi);
        System.out.println("Ocakavana hodnota: [Evka, Emil, Vojto, Peter]");
    }

}

package java_spolocna_praca_s_lektorom.webinar05.kinosala;

public class KinosalaTester {
    public static void main(String[] args) {
        Kinosala kinosala = new Kinosala(10);
        String text = kinosala.vytvor();
        System.out.println(text);
    }
}

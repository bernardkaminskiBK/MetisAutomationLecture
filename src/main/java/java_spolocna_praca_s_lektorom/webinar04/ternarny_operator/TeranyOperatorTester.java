package java_spolocna_praca_s_lektorom.webinar04.ternarny_operator;

// premenna = podmienka ? hodnota1 : hodnota2
public class TeranyOperatorTester {
    public static void main(String[] args) {
        int vek = 15;
        String text = "";

        text = vek >= 18 ? "Osoba starsia ako 18 rokov" : "Mladistva osoba";

        /*
        if (vek >= 18)
        {
            text = "Osoba starsia ako 18 rokov";
        }
        else
        {
            text = "Mladistva osoba";
        }

         */
        System.out.println(text);
    }
}

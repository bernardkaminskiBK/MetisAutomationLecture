package java_spolocna_praca_s_lektorom.webinar05.Zadanie_5_2_2;

/**
 * []
 * [] []
 * [] [] []
 * ...
 */
public class Kinosala {
    private int rozmer;

    public Kinosala(int rozmer) {
        this.rozmer = rozmer;
    }

    public String vytvor()
    {
        String text = "";
        // iteracnou premennou i posuvame sa po riadkoch
        for (int i = 1; i <= rozmer; i++)
        {
            // iteracnou premennou j posuvame sa po stlpcoch
            for (int j = 1; j <= i; j++)
            {
                text += "[] ";
            }
            text += "\n";
        }
        return text;
    }
}

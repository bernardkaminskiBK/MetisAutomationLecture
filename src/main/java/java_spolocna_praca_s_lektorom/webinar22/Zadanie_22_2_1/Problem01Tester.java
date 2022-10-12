package java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_1;

public class Problem01Tester
{
    public static void main(String[] args)
    {
        // TODO: dopln chybajucu staticku metodu, ktora bude mat 2 parametre
        // 1. parameter bude typu Problem1.VystupNaKonzolu
        // 2. parameter bude typu String

        // String -> std out
        // 1) vytvor funkcionalny interface
        // 2) vytvor lambda vyraz
        VystupNaKonzolu lambda = (String text) -> System.out.println(text);

        // 3 pouzi lambda vyraz na vypisanie textu na konzolu
        lambda.vypisText("Java");
        lambda.vypisText("Python");
        lambda.vypisText("C#");
    }
}

interface VystupNaKonzolu
{
    void vypisText(String text);
}

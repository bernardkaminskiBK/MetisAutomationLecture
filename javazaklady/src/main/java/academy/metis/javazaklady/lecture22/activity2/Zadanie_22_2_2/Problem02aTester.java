package academy.metis.javazaklady.lecture22.activity2.Zadanie_22_2_2;

public class Problem02aTester
{
    public static void main(String[] args)
    {
        ReverznyTyp lambda = (String text) -> {
            String otocenyText = "";

            for (String slovo : text.split(" "))
            {
                // StringBuilder spajac = new StringBuilder(slovo);
                // otocenyText += spajac.reverse().toString() + " " alebo: vid riadok nizsie
                otocenyText += new StringBuilder(slovo).reverse().toString() + " "; // anonymny objekt StringBuilder
            }

            return otocenyText;
        };

        String text = "Programovanie v Jave nas bavi :-)";
        System.out.println(text);
        System.out.println(lambda.otoc(text));
    }
}
@FunctionalInterface
interface ReverznyTyp
{
    String otoc(String text);
}

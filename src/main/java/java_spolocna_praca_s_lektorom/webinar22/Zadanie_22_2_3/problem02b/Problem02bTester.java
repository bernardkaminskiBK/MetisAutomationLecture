package java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_3.problem02b;

import java.util.function.Function;
// Problem 02a, ale bez pouzitia funkcionalneho interface a spouzitim Function<> pred lambda na riadku 9
// a v riadku 24 metoda apply()
public class Problem02bTester
{
    public static void main(String[] args)
    {
        Function<String, String> lambda = (String text) -> {
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
        System.out.println(lambda.apply(text));
    }
}

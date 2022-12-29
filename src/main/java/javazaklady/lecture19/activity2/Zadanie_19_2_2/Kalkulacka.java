package javazaklady.lecture19.activity2.Zadanie_19_2_2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Vypocitaj priklad: 1 - 3 + 2 + 4 = 4
 *
 * 1
 * -
 * 3   -2
 * +    +
 * 2    2   0
 * +    +   +
 * 4    4   4   4
 */
public class Kalkulacka
{
    public int vyhodnot(String vyraz)
    {
        Deque<String> zasobnik = new ArrayDeque<>();
        String[] tokeny = vyraz.split(" ");

        for (String token : tokeny)
        {
            zasobnik.add(token);
        }

        while (zasobnik.size() > 1)
        {
            int lavyOperand = Integer.parseInt(zasobnik.pop());
            String operator = zasobnik.pop();
            // String -> int
            int pravyOperand = Integer.parseInt(zasobnik.pop());

            int vysledok = 0;

            switch (operator)
            {
                case "+" :
                    vysledok = lavyOperand + pravyOperand;
                    break;
                case "-" :
                    vysledok = lavyOperand - pravyOperand;
                    break;
            }

            // int -> String
            zasobnik.push(String.valueOf(vysledok));
        }

        // v zasobniku je uz len 1 prvok, predstavuje vysledok celeho vyrazu
        // String -> int
        return Integer.valueOf(zasobnik.pop());
    }
}

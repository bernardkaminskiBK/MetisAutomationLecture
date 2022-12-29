package javazaklady.lecture28.activity2.Zadanie_28_2_1;

import java.util.ArrayList;
import java.util.List;

public class StreamApi {

    public List<Integer> filterOnlyPositiveNumber(final List<Integer> numbers){
        final List<Integer> onlyPositiveNumbers = new ArrayList<>();

        for (final Integer number : numbers){
            if (number > 0){
                onlyPositiveNumbers.add(number);
            }
        }

        return onlyPositiveNumbers;
    }

    public static List<Integer> filterOnlyPositiveNumberStreamApi(final List<Integer> numbers){
        return numbers.stream()
                .filter(integer -> integer > 0)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(
                StreamApi.filterOnlyPositiveNumberStreamApi(List.of(-1, 2, -3, 5))
        );
    }

}


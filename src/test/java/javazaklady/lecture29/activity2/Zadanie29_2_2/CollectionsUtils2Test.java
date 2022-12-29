package javazaklady.lecture29.activity2.Zadanie29_2_2;

import javazaklady.lecture29.activity2.Zadanie_29_2_1.CollectionsUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionsUtils2Test {

    @Test
    void whenGivenLostOfString_thenSuchStringsAreSortedCorrectlyFromAToZ(){
        final List<String> names = List.of("John","Peter", "Adam", "Zoli");

        final List<String> sortedNames = new CollectionsUtils().sortStrings(names);

        assertThat(sortedNames).containsExactly("Adam","John","Peter","Zoli");
    }

    @Test
    void whenGivenLostOfStringWithSomeNulls_thenNotNullStringsAreSortedFromAToZ0AndNullsAreFilteredOut(){
        final List<String> names = new ArrayList<>(){{
            add(null);
            add("Peter");
            add("Adam");
        }};

        final List<String> sortedNames = new CollectionsUtils().sortStrings(names);

        assertThat(sortedNames).containsExactly("Adam","Peter");
    }

    @Test
    void whenGivenNull_thenNullIsReturned()
    {
        final List<String> sortedStrings = new CollectionsUtils().sortStrings(null);

        assertThat(sortedStrings).isNull();
    }

    @Test
    void whenGivenEmptyList_thenEmptyListIsReturned()
    {
        final List<String> sortedStrings = new CollectionsUtils().sortStrings(List.of());

        assertThat(sortedStrings).isEmpty();
    }
}

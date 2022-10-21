package java_spolocna_praca_s_lektorom.webinar29.Zadanie_29_2_1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;


class CollectionsUtilsTest {

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

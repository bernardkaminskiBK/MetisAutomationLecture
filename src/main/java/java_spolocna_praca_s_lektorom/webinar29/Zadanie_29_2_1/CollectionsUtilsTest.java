import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;


class CollectionsUtilsTest {

    @Test
    void whenGivenLostOfString_thenSuchStringsAreSortedCorrectlyFromAToZ(){
        final List<String> names = List.of("John","Peter", "Adam", "Zoli");

        final List<String> sortedNames = new CollectionsUtils().sortStrings(names);

        assertThat(sortedNames).containsExactly("Adam","Johna","Peter","Zoli");
    }

    @Test
    void whenGivenLostOfString_thenSuchStringsAreSortedCorrectlyFromAToZ0(){
        final List<String> names = new ArrayList<>(){{
                add(null);
                add("Peter");
                add("Adam");
            }};

        final List<String> sortedNames = new CollectionsUtils().sortStrings(names);

        assertThat(sortedNames).containsExactly("Adam","Peter");
    }

}
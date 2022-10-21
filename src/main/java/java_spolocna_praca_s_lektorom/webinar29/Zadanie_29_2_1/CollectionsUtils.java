package java_spolocna_praca_s_lektorom.webinar29.Zadanie_29_2_1;

import java.util.List;
import java.util.Objects;

public class CollectionsUtils {

    public List<String> sortStrings(final List<String> strings){
        if (strings == null){
            return null;
        }
        return strings.stream()
                .filter(Objects::nonNull)
                .sorted()
                .toList();
    }
}

package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Stara_Verzia_Nepouzivat;

import java.util.List;

public class CollectionsUtils
{
    public List<String> sortStrings(final List<String> strings)
    {
        if (strings == null)
        {
            return null;
        }
        return strings.stream()
                .sorted()
                .toList();
    }
}

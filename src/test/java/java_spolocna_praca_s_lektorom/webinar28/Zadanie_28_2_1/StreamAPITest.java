package java_spolocna_praca_s_lektorom.webinar28.Zadanie_28_2_1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class StreamAPITest {
    StreamApi streamApi = new StreamApi();

    @Test
    void filterOnlyPositiveNumberTest()
    {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(2);
        list.add(-3);
        list.add(4);
        list.add(-5);
        list.add(6);

        assertThat(streamApi.filterOnlyPositiveNumber(list)).containsOnly(2,4,6);

    }


}

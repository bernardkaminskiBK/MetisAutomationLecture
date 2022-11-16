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
    @Test
    void filterOnlyPositiveNumberStreamApi()
    {
        List<Integer> list = List.of(1,-2,3,4,-5,6,-7,8,9);
        assertThat(StreamApi.filterOnlyPositiveNumberStreamApi(list)).containsOnly(1,3,4,6,8,9);
    }
}

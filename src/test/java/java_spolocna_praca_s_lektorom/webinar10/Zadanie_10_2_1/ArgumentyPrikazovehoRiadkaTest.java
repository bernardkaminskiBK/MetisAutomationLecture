package java_spolocna_praca_s_lektorom.webinar10.Zadanie_10_2_1;

import javazaklady.lecture10.activity2.Zadanie_10_2_1.ArgumentyPrikazovehoRiadkaDemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

public class ArgumentyPrikazovehoRiadkaTest {

    @Test
    void argumentyTest()
    {
        System.setOut(new StorePrintStream(System.out));
        ArgumentyPrikazovehoRiadkaDemo.main(new String[0]);

        Assertions.assertTrue(StorePrintStream.printlnList.get(0).contains("Argumenty 1: []"));

    }

    @Test
    void argumenty2Test()
    {
        System.setOut(new StorePrintStream(System.out));
        ArgumentyPrikazovehoRiadkaDemo.main(new String[0]);

        Assertions.assertTrue(StorePrintStream.printlnList.get(1).contains("Argumenty 2:"));

    }
}

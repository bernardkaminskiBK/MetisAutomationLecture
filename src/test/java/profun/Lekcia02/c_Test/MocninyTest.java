package profun.Lekcia02.c_Test;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profun.Lekcia02.b.PatciferneCislo;
import profun.Lekcia02.c.Mocniny;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MocninyTest extends InputOutputStreamHelper {

    @Test
    public void vytvorTabulkuMocnin() {

        String expectedResult = "cislo" + "\t\t" + "druha mocnina" + "\t\t"+ "tretia mocnina" + "\n" +
                "1\t\t\t1\t\t\t\t\t1\n" +
                "2\t\t\t4\t\t\t\t\t8\n" +
                "3\t\t\t9\t\t\t\t\t27\n" +
                "4\t\t\t16\t\t\t\t\t64\n" +
                "5\t\t\t25\t\t\t\t\t125\n" +
                "6\t\t\t36\t\t\t\t\t216\n" +
                "7\t\t\t49\t\t\t\t\t343\n" +
                "8\t\t\t64\t\t\t\t\t512\n" +
                "9\t\t\t81\t\t\t\t\t729\n" +
                "10\t\t\t100\t\t\t\t\t1000\n";

        Mocniny.main(new String[0]);
        assertTrue( getOutput().contains(expectedResult));
    }
}

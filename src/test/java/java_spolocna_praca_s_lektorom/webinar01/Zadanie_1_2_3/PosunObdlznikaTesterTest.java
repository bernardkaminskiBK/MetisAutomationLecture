package java_spolocna_praca_s_lektorom.webinar01.Zadanie_1_2_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosunObdlznikaTesterTest {

    @Test
    public void posunObdlznikTest() {
        PosunObdlznikaTester.main(new String[0]);

        double x = PosunObdlznikaTester.obdlznik.getX();
        double y = PosunObdlznikaTester.obdlznik.getY();
        double width = PosunObdlznikaTester.obdlznik.getWidth();
        double height = PosunObdlznikaTester.obdlznik.getHeight();

        String expentedResult = x + " " + y + " " + width + " " + height;

        Assertions.assertEquals(expentedResult, "35.0 55.0 30.0 40.0");
    }

}

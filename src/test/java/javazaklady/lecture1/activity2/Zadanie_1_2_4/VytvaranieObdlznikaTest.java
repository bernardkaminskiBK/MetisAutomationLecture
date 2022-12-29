package javazaklady.lecture1.activity2.Zadanie_1_2_4;

import javazaklady.lecture1.activity2.Zadanie_1_2_4.VytvaranieObdlznika;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VytvaranieObdlznikaTest {

    private String expectedResult = """
            java.awt.Rectangle[x=0,y=0,width=0,height=0]
            java.awt.Rectangle[x=0,y=0,width=100,height=100]
            java.awt.Rectangle[x=20,y=30,width=100,height=50]
            java.awt.Rectangle[x=0,y=0,width=50,height=60]
            java.awt.Rectangle[x=10,y=20,width=0,height=0]
            java.awt.Rectangle[x=10,y=20,width=50,height=60]
            java.awt.Rectangle[x=300,y=300,width=200,height=100]
            java.awt.Rectangle[x=300,y=300,width=200,height=100]
            java.awt.Rectangle[x=20,y=30,width=100,height=50]""";

    @Test
    public void vytvarenieObdlznikaTest() {
        VytvaranieObdlznika.main(new String[0]);

        Assertions.assertTrue(VytvaranieObdlznika.info.contains(expectedResult));
    }

}

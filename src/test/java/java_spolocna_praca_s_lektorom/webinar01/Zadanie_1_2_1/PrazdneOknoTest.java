package java_spolocna_praca_s_lektorom.webinar01.Zadanie_1_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrazdneOknoTest {

    @Test
    public void prazdneOknoTest() {
        PrazdneOkno.main(new String[0]);
        String expectedResult =
                "800x600,layout=java.awt.BorderLayout,title=Prazdne okno,normal," +
                "defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,31,784x561," +
                "layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673," +
                "maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]";
        System.out.println(PrazdneOkno.okno.toString());
        System.out.println(expectedResult);
        Assertions.assertTrue(PrazdneOkno.okno.toString().strip().contains(expectedResult.strip()));
    }

}

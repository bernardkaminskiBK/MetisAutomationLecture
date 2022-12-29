package java_spolocna_praca_s_lektorom.webinar01.Zadanie_1_2_2;


import javazaklady.lecture1.activity2.Zadanie_1_2_2.PosunObdlznikaTester;
import org.junit.jupiter.api.Test;

class KomponentaObdlznikTest {

    // Tu budu testy toto je iba naznacenie a priklad
    @Test
    public void test() {

       PosunObdlznikaTester.main(new String[0]);
        String expectedResult =
                "800x600,layout=java.awt.BorderLayout,title=Prazdne okno,normal," +
                        "defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,31,784x561," +
                        "layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673," +
                        "maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]";
        System.out.println();

    }

}

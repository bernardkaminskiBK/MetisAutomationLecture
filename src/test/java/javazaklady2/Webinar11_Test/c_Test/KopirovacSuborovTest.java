package javazaklady2.Webinar11_Test.c_Test;

import javazaklady2.Webinar11.c.KopirovacSuborov;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class KopirovacSuborovTest {

    private static final String BACKUP_TXT_FILE_NAME = "zaloha.txt";
    private static final String EXPECTED_RESULT = "  $$$$$$$$$$$$$$$$$$$$\n" +
            "                       $$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$         $$   $$$$$\n" +
            "    $$$$$$        $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$       $$$$$$$$$$\n" +
            " $$ $$$$$$      $$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$$       $$$$$$$$\n" +
            " $$$$$$$$$     $$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$$    $$$$$$$$\n" +
            "   $$$$$$$    $$$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$$$$$$$$$$$$$$\n" +
            "   $$$$$$$$$$$$$$$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$$$$$$  $$$$$$\n" +
            "    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     $$$$\n" +
            "     $$$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     $$$$$\n" +
            "    $$$$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$       $$$$\n" +
            "    $$$    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$$$$$\n" +
            "   $$$$$$$$$$$$$  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   $$$$$$$$$$$$$$$$$$\n" +
            "   $$$$$$$$$$$$$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     $$$$$$$$$$$$\n" +
            "  $$$$       $$$$    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$      $$$$\n" +
            "             $$$$$     $$$$$$$$$$$$$$$$$$$$$$$$$         $$$\n" +
            "               $$$$          $$$$$$$$$$$$$$$           $$$$\n" +
            "                $$$$$                                $$$$$\n" +
            "                 $$$$$$      $$$$$$$$$$$$$$        $$$$$\n" +
            "                   $$$$$$$$     $$$$$$$$$$$$$   $$$$$$$\n" +
            "                      $$$$$$$$$$$  $$$$$$$$$$$$$$$$$\n" +
            "                         $$$$$$$$$$$$$$$$$$$$$$\n" +
            "                                 $$$$$$$$$$$$$$$\n" +
            "                                     $$$$$$$$$$$$\n" +
            "                                      $$$$$$$$$$$\n" +
            "                                       $$$$$$$$";

    @Test
    public void nakopirujTest() {
        KopirovacSuborov.nakopiruj("subor.txt", BACKUP_TXT_FILE_NAME);
        Assertions.assertEquals(EXPECTED_RESULT.strip(), getCopieredFile().strip());
    }

    private String getCopieredFile() {
        String result = "";

        try {
            Scanner vstupneData = new Scanner(new FileReader(BACKUP_TXT_FILE_NAME));

            while (vstupneData.hasNextLine()) {
                result += vstupneData.nextLine() + "\n";
            }

            vstupneData.close();
        } catch (FileNotFoundException e) {
            result = e.getMessage();
        }

        return result;
    }

}

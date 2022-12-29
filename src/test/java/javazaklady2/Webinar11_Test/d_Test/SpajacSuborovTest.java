package javazaklady2.Webinar11_Test.d_Test;

import javazaklady2.Webinar11.part4.SpajacSuborov;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class SpajacSuborovTest {

    private static final String BACKUP_TXT_FILE_NAME = "SpajacSuborov/vysledny-subor.txt";
    private static final String EXPECTED_RESULT = " 1)\n" +
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard\n" +
            "dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen\n" +
            "book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially\n" +
            "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more\n" +
            "recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
            "\n" +
            "2)\n" +
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard \n" +
            "dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen \n" +
            "book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially \n" +
            "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more \n" +
            "recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
            "\n" +
            "3)\n" +
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard \n" +
            "dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen \n" +
            "book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially \n" +
            "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more \n" +
            "recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
            "\n" +
            "\n";

    @Test
    public void nakopirujTest() {
        String[] args = {"SpajacSuborov/subor1.txt", "SpajacSuborov/subor2.txt",
                "SpajacSuborov/subor3.txt"};

        SpajacSuborov.spojObsahSuborov(args, BACKUP_TXT_FILE_NAME);
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

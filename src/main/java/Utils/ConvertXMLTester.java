package Utils;

public class ConvertXMLTester {

    public static void main(String[] args) {
        ConvertXML convertXML = new ConvertXML("Test Results - All_in_MetisAutomationLecture.xml");
        String jsonString = convertXML.convertXmlToJson().toString(4);
        System.out.println(jsonString);
    }

}

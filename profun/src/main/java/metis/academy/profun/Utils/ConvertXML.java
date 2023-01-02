package metis.academy.profun.Utils;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;

public class ConvertXML {

    private final String filePath;

    public ConvertXML(String filePath) {
        this.filePath = filePath;
    }

    public JSONObject convertXmlToJson() {
        try {
            return XML.toJSONObject(parseXmlToString(this.filePath));
        } catch (JSONException e) {
            System.out.println(e.toString());
        }
        return null;
    }

    private String parseXmlToString(String filePath) {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(filePath));

            StringBuilder sb = new StringBuilder();
            String line = bufReader.readLine();

            while (line != null) {
                sb.append(line).append("\n");
                line = bufReader.readLine();
            }

            bufReader.close();

            return sb.toString();

        } catch (IOException e) {
            return e.toString();
        }
    }
}

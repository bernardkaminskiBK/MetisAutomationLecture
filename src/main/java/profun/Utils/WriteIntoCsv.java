package profun.Utils;

import profun.Utils.models.StudentTestResultModel;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoCsv {

    public void saveData(StudentTestResultModel studentResultModel) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("testResults.csv", true));
            writer.writeNext(new String[]{studentResultModel.getMethodName(), String.valueOf(studentResultModel.isSuccess()), studentResultModel.getClassName()});
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

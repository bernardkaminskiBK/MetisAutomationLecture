package Utils;

import Utils.models.StudentResultModel;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoCsv {

    public void saveData(StudentResultModel studentResultModel) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("testResults.csv", true));
            writer.writeNext(new String[]{studentResultModel.getMethodName(), String.valueOf(studentResultModel.isSuccess()), studentResultModel.getInstanceName()});
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

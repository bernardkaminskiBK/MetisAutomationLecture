package Zadanie_8_3_2_Test;

import Utils.WriteIntoCsv;
import Utils.models.StudentResultModel;
import Zadanie_8_3_2.Mocnina;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MocninaTest {

    private WriteIntoCsv wic = null;

    @BeforeTest
    public void setUp() {
        this.wic = new WriteIntoCsv();
    }

    @Test(dataProvider = "testData")
    public void vypocitaj(Integer first, Integer second, Integer expected) {
        Integer aktualnaHodnota = Mocnina.umocni(first, second);
        Assert.assertEquals(aktualnaHodnota, expected);
    }

    @DataProvider(name = "testData")
    public static Object[][] numbers() {
        return new Object[][]{{5, 3, 125}, {3, 4, 81}, {5, 5, 3125}};
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        try {
            if (result.getStatus() == ITestResult.SUCCESS) {
                saveResultSet(result);
            } else if (result.getStatus() == ITestResult.FAILURE) {
                saveResultSet(result);
            } else if (result.getStatus() == ITestResult.SKIP) {
                saveResultSet(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveResultSet(ITestResult result) {
        wic.saveData(new StudentResultModel(result.getName(), result.isSuccess(), result.getInstanceName()));
    }

}

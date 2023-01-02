package metis.academy.profun.Utils.Listeners;

import metis.academy.profun.Utils.WriteIntoCsv;
import metis.academy.profun.Utils.models.StudentTestResultModel;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.lang.reflect.Method;

public class ResultSetListener implements TestWatcher {

    private final WriteIntoCsv wic = new WriteIntoCsv();

//    @Override
//    public void testDisabled(ExtensionContext context, Optional<String> reason) {
//    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        saveResultSet(context.getTestMethod().get(), true, context.getTestClass().get().getName());
    }

//    @Override
//    public void testAborted(ExtensionContext context, Throwable cause) {
//    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        saveResultSet(context.getTestMethod().get(), false, context.getTestClass().get().getName());
    }

    private void saveResultSet(Method method, boolean isTestPassed, String className) {
        wic.saveData(new StudentTestResultModel(method.getName(), isTestPassed, className));
    }

}

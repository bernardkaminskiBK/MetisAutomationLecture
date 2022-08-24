package profun.listeners;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class Listener implements TestWatcher {
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("-------------------------------------------------");
        System.out.println("Tento test bol zablokovany: " + context.getTestMethod() + ", dovod: " + reason.get());
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        int testcase = 1;

        int stav = 1;
        System.out.println("-------------------------------------------------");
        System.out.println("Tento test zbehol uspesne: " + context.getTestMethod().get());
        System.out.println("Tento test zbehol uspesne: " + context.getTestMethod());
        System.out.println("Testcase stav: " + stav);
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {

        System.out.println("-------------------------------------------------");
        System.out.println("Tento test bol abortnuty(nastala neocakavana chyba/error): " + context.getTestMethod() + ", dovod: " + cause.getMessage());

    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        int stav = 2;
        System.out.println("-------------------------------------------------");
        System.out.println("Tento test nepresiel uspesne: " + context.getTestMethod() + ", dovod: " + cause.getMessage());
        System.out.println("Testcase stav: " + stav);
    }
}

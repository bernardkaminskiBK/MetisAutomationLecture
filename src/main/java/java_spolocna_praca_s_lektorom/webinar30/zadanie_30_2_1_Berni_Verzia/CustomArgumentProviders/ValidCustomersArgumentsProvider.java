package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Berni_Verzia.CustomArgumentProviders;

import java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Berni_Verzia.Customer;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class ValidCustomersArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(new Customer(1, "Marcus", "Salazar")),
                Arguments.of(new Customer(2, "Amanda", "Cunningham")),
                Arguments.of(new Customer(3, "Danny", "Humphrey"))
        );
    }

}

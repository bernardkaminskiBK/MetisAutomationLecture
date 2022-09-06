package javazaklady.Zadanie_10_3_1_Test.utils;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CustomArgumentProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {

        if (context.getTestMethod().toString().contains("getVzorTrojuholnik1Test")) {
            return Stream.of(
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_1_VELKOST_10_VZOR_HVIEZDICKA, 10, "*"),
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_1_VELKOST_25_VZOR_MRIEZKA, 25, "#"),
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_1_VELKOST_35_VZOR_BODKA, 35, ".")
            );
        } else if (context.getTestMethod().toString().contains("getVzorTrojuholnik2Test")) {
            return Stream.of(
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_2_VELKOST_10_VZOR_HVIEZDICKA, 10, "*"),
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_2_VELKOST_25_VZOR_MRIEZKA, 25, "#"),
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_2_VELKOST_35_VZOR_BODKA, 35, ".")
            );
        } else if (context.getTestMethod().toString().contains("getVzorTrojuholnik3Test")) {
            return Stream.of(
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_3_VELKOST_10_VZOR_HVIEZDICKA, 10, "*"),
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_3_VELKOST_25_VZOR_MRIEZKA, 25, "#"),
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_3_VELKOST_35_VZOR_BODKA, 35, ".")
            );
        } else if (context.getTestMethod().toString().contains("getVzorTrojuholnik4Test")) {
            return Stream.of(
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_4_VELKOST_10_VZOR_HVIEZDICKA, 10, "*"),
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_4_VELKOST_25_VZOR_MRIEZKA, 25, "#"),
                    arguments(ConstantsTriangle.EXPECTED_TROJUHOLNIK_4_VELKOST_35_VZOR_BODKA, 35, ".")
            );
        }

        return Stream.of();
    }

}

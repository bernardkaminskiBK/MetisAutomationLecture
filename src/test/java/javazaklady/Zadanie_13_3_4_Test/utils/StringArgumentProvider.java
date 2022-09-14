package javazaklady.Zadanie_13_3_4_Test.utils;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StringArgumentProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                arguments(new String[]{"D", "F", "h", "E", "c", "f", "B", "a", "G", "b", "H", "g", "A", "e", "C", "d"}
                        , new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "a", "b", "c", "d", "e", "f", "g", "h"}),
                arguments(new String[]{"Programovanie", "v", "Jave", "nas", "bavi"}
                        , new String[]{"Jave", "Programovanie", "bavi", "nas", "v"}),
                arguments(new String[]{"D", "B", "e", "A", "C"}
                        , new String[]{"A", "B", "C", "D", "e"})
        );
    }

}

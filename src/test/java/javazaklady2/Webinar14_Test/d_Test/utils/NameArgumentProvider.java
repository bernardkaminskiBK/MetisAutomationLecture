package javazaklady2.Webinar14_Test.d_Test.utils;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NameArgumentProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                arguments(new String[]{"Fero", "Cyril", "Julia", "Riso", "Sona", "Adela"},
                        new String[]{"Adela", "Sona"}),
                arguments(new String[]{"Fero", "Cyril", "Julia", "Vojto", "Riso", "Sona"},
                        new String[]{"Cyril", "Vojto"}),
                arguments(new String[]{"Fero", "Julia", "Yoda", "Sona", "Eleonora"},
                        new String[]{"Eleonora", "Yoda"})
        );
    }

}

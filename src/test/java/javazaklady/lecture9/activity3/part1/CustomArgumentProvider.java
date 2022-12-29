package javazaklady.lecture9.activity3.part1;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CustomArgumentProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                arguments((Object) new Double[] {10000.0, 5000.0, 3000.0, 10000.0, 13300.0}),
                arguments((Object) new Double[] {500.0, 100.0, 100.0, 100.0, 485.0}),
                arguments((Object) new Double[] {1200.0, 700.0, 200.0, 100.0, 562.0})
        );
    }
}


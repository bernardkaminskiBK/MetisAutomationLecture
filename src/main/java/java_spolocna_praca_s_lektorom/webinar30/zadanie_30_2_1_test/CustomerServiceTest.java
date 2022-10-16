package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest
{
    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @Test
    void whenCustomerIsValid_thenCustomerIsSaved()
    {
        final Customer customer = new Customer("Peter", "Vasil");
        customerService.savedCustomer(customer);
        customer.toString();

        verify(customerRepository).save(argThat(
                c -> c.getLastName().equals("Vasil") && c.getFirstName().equals("Peter")));
    }

    @Test
    void whenCustomerLastNameIsNull_thenExpectionIsThrown()
    {
        final Customer customer = new Customer("Peter", null);

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.savedCustomer(customer));

        verifyNoMoreInteractions(customerRepository);
    }
/*
    @Test
    void whenCustomerLastNameIsBlank_thenExpectionIsThrown()
    {
        final Customer customer = new Customer("Peter", "     ");

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.savedCustomer(customer));

        assertThat(customerRepository.getNumberOfSaves()).isZero();
    }
*/
    @ParameterizedTest
    @MyNullAndEmptyAndBlankSource
    void whenCustomerIsNotValid_thenExpectionIsThrown(final String lastName)
    {
        final Customer customer = new Customer("Peter", lastName);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.savedCustomer(customer));

//        assertThat(customerRepository.getNumberOfSaves()).isZero();
    }

    @Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @NullSource
    @EmptySource
    @ValueSource(strings = {"   "})
    public @interface MyNullAndEmptyAndBlankSource
    {

    }

    @Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @ArgumentsSource(ValidCustomersArgumentsProvider.class)
    public @interface ValidCustomersSource
    {

    }

    private static class ValidCustomersArgumentsProvider implements ArgumentsProvider
    {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception
        {
            return Stream.of(
                    Arguments.of(new Customer("Peter", "Vasil")),
                    Arguments.of(new Customer("John", "Smith")),
                    Arguments.of(new Customer("Abraham", "Lincoln"))
            );
        }
    }
}
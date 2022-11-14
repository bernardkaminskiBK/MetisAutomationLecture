package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Berni_Verzia;

import java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Berni_Verzia.CustomArgumentProviders.ValidCustomersArgumentsProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceImplTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerServiceImpl customerService;

    private final ArrayList<Customer> database = new ArrayList<>();

    /*
        Tato zakomentovana cast sluzi na reprezentativny sposob ako sa da kod viac sprehladnit s @MethodSource() anotaciou
        co je pouzity na riadku 56 napriklad.
     */
//    @Test
//    void whenCustomerIsValid_thenCustomerIsSuccessfullySaved_thenGetCustomersSizeIs_3() {
//        Customer marcus = new Customer(1, "Marcus", "Salazar");
//        Customer amanda = new Customer(2, "Amanda", "Cunningham");
//        Customer danny = new Customer(3, "Danny", "Humphrey");
//
//        database.add(marcus);
//        database.add(amanda);
//        database.add(danny);
//
//        when(customerRepository.getAllCustomers()).thenReturn(database);
//
//        customerService.create(marcus);
//        customerService.create(amanda);
//        customerService.create(danny);
//
//        Assertions.assertEquals(3, customerService.getAllCustomers().size());
//    }

    @DisplayName("JUnit method for get all customers")
    @ParameterizedTest
    @MethodSource("arrayArgumentOfValidCustomers")
    void whenGetAllCustomers_thenGetAllCustomersSizeWillBe_3(Customer[] customers) {
        database.addAll(Arrays.asList(customers));
        when(customerRepository.getAllCustomers()).thenReturn(database);

        Assertions.assertEquals(3, customerService.getAllCustomers().size());
    }

    private static Stream<Arguments> arrayArgumentOfValidCustomers() {
        return Stream.of(
                arguments((Object) new Customer[]{
                                new Customer(1, "Marcus", "Salazar"),
                                new Customer(2, "Amanda", "Cunningham"),
                                new Customer(3, "Danny", "Humphrey")
                        }
                ));
    }

    @DisplayName("JUnit method for deleting customer")
    @Test
    void whenDelete_thenCustomerShouldBeDeleted() {
        Customer customer = new Customer(1, "Marcus", "Salazar");
        customerService.delete(customer);

        verify(customerRepository, times(1)).delete(customer);
    }

    @DisplayName("JUnit method for updating customer")
    @Test
    void whenFirstCustomerIsUpdatedSuccessfully_thenFirstNameOfCustomerWillBe_Thomas() {
        Customer firstCustomerFromDb = new Customer(1, "Marcus", "Salazar");
        doReturn(firstCustomerFromDb).when(customerRepository).getCustomerById(1);
        Customer customerById = customerService.getCustomerById(1);

        Customer customerToUpdate = new Customer();
        customerToUpdate.setId(customerById.getId());
        customerToUpdate.setFirstName("Thomas");
        customerToUpdate.setLastName(customerById.getLastName());

        doReturn(customerToUpdate).when(customerRepository).update(customerToUpdate);
        Customer updatedCustomer = customerService.update(customerToUpdate);

        Assertions.assertEquals("Thomas", updatedCustomer.getFirstName());
    }

    @DisplayName("JUnit method getting customer by ID")
    @Test
    void whenGetCustomerById_thenReturnCustomerWithID_1() {
        Customer firstCustomerFromDb = new Customer(1, "Marcus", "Salazar");

        doReturn(firstCustomerFromDb).when(customerRepository).getCustomerById(1);
        Customer actualCustomer = customerService.getCustomerById(1);

        Assertions.assertEquals(1, actualCustomer.getId());
    }

    @DisplayName("JUnit method for creating customer")
    @ParameterizedTest
    @ArgumentsSource(ValidCustomersArgumentsProvider.class)
    void whenCustomerIsValid_thenCustomerIsSaved(Customer customer) {
        customerService.create(customer);

        verify(customerRepository).create(argThat(
                c -> c.getId() == customer.getId() &&
                        c.getLastName().equals(customer.getLastName()) &&
                        c.getFirstName().equals(customer.getFirstName())));
    }

    @ParameterizedTest
    @MethodSource("customersWithNullLastName")
    void whenCustomerLastNameIsNull_thenExceptionIsThrown(Customer customer) {

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.create(customer));

        verifyNoMoreInteractions(customerRepository);
    }

    private static Stream<Arguments> customersWithNullLastName() {
        return Stream.of(
                Arguments.of(new Customer(1, "Marcus", null)),
                Arguments.of(new Customer(2, "Amanda", null)),
                Arguments.of(new Customer(3, "Danny", null))
        );
    }

    @ParameterizedTest
    @NullSource
    void whenCustomerFirstNameIsNull_thenExceptionIsThrown(String firstNameNull) {
        final Customer customer = new Customer(1, firstNameNull, "Cunningham");

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.create(customer));

        verifyNoMoreInteractions(customerRepository);
    }

    @ParameterizedTest
    @CsvSource({"1,Marcus,'     '", "2,Amanda,'     '", "3,Danny,'     '"})
    void whenCustomerLastNameIsBlank_thenExceptionIsThrown(int customerId, String firstName, String blankLastName) {
        final Customer customer = new Customer(customerId, firstName, blankLastName);

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.create(customer));

        assertEquals(0, customerService.getAllCustomers().size());
    }

    @ParameterizedTest
    @NullSource
    void whenCustomerIsNullWhileDelete_thenExceptionIsThrown(Customer customer) {

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.delete(customer));

        verifyNoMoreInteractions(customerRepository);
    }

    @ParameterizedTest
    @NullSource
    void whenCustomerIsNullWhileUpdate_thenExceptionIsThrown(Customer customer) {

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.update(customer));

        verifyNoMoreInteractions(customerRepository);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 0, 0})
    void whenCustomerIdEquals_to_0_thenExceptionIsThrown(int customerId) {

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.getCustomerById(customerId));

        verifyNoMoreInteractions(customerRepository);
    }

    @DisplayName("JUnit method with own custom annotation")
    @ParameterizedTest
    @MyNullAndEmptyAndBlankSource
    void whenCustomerIsNotValid_thenExceptionIsThrown(final String firstNameNull) {
        final Customer customer = new Customer(1, firstNameNull, "Cunningham");

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> customerService.create(customer));

        Assertions.assertEquals(0, customerRepository.getAllCustomers().size());
    }

    @Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @NullSource
    @EmptySource
    @ValueSource(strings = {"   "})
    public @interface MyNullAndEmptyAndBlankSource {

    }

}

package javazaklady.lecture30.activity2.Zadanie_30_2_1;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void create(Customer customer) {
        // validate customer
        final String customerFirstName = customer.getFirstName();
        final String customerLastName = customer.getLastName();

        if (customerFirstName == null || customerLastName == null)
            throw new IllegalArgumentException("Customer firstName and lastName cannot be null");

        if (customerFirstName.isBlank() || customerLastName.isBlank())
            throw new IllegalArgumentException("Customer firstName and lastName cannot be blank");

        this.customerRepository.create(customer);
    }

    @Override
    public Customer getCustomerById(int customerId) {
        if (customerId == 0)
            throw new IllegalArgumentException("Customer Id cannot be 0");

        return customerRepository.getCustomerById(customerId);
    }

    @Override
    public void delete(Customer customer) {
        if (customer == null)
            throw new IllegalArgumentException("Customer cannot be null");

        this.customerRepository.delete(customer);
    }

    @Override
    public Customer update(Customer customer) {
        if (customer == null)
            throw new IllegalArgumentException("Customer cannot be null");

        return this.customerRepository.update(customer);
    }

    @Override
    public ArrayList<Customer> getAllCustomers() {
        return this.customerRepository.getAllCustomers();
    }

}

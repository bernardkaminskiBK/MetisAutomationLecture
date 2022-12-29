package javazaklady.lecture30.activity2.Zadanie_30_2_1;

import java.util.ArrayList;

public interface CustomerService {

    void create(Customer customer);

    Customer getCustomerById(int customerId);

    void delete(Customer customer);

    Customer update(Customer customer);

    ArrayList<Customer> getAllCustomers();

}

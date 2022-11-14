package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Aktualna_Verzia;

import java.util.ArrayList;

public interface CustomerService {

    void create(Customer customer);

    Customer getCustomerById(int customerId);

    void delete(Customer customer);

    Customer update(Customer customer);

    ArrayList<Customer> getAllCustomers();

}

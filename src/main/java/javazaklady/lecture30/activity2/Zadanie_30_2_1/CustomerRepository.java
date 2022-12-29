package javazaklady.lecture30.activity2.Zadanie_30_2_1;

import java.util.ArrayList;

public class CustomerRepository {

    private final ArrayList<Customer> database;

    public CustomerRepository() {
        this.database = new ArrayList<>();
    }

    public void create(Customer customer) {
        database.add(customer);
    }

    public Customer getCustomerById(int customerId) {
        for (var customer : database) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    public void delete(Customer customer) {
        database.remove(customer);
    }

    public Customer update(Customer customer) {
        for (var customerFromDatabase : database) {
            if (customerFromDatabase.getId() == customer.getId()) {
                customerFromDatabase.setId(customer.getId());
                customerFromDatabase.setFirstName(customer.getFirstName());
                customerFromDatabase.setLastName(customer.getLastName());
                return customerFromDatabase;
            }
        }
        return null;
    }

    public ArrayList<Customer> getAllCustomers() {
        return database;
    }

}

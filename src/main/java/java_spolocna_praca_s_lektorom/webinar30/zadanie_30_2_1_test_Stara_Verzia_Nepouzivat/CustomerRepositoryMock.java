package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_test_Stara_Verzia_Nepouzivat;

import java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Stara_Verzia_Nepouzivat.Customer;
import java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Stara_Verzia_Nepouzivat.CustomerRepository;
//import zadanie_30_2_1.Customer;
//import zadanie_30_2_1.CustomerRepository;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryMock implements CustomerRepository
{
    private int numberOfSaves = 0;
    private List<Customer> savedCustomers = new LinkedList<>();

    @Override
    public void save(Customer customer)
    {
        numberOfSaves++;
        savedCustomers.add(customer);
    }

    public int getNumberOfSaves()
    {
        return numberOfSaves;
    }

    public List<Customer> getSavedCustomers()
    {
        return savedCustomers;
    }
}
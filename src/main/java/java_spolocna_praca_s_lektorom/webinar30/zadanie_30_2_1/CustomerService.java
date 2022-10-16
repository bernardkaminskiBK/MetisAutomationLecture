package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1;

public class CustomerService
{
    private final CustomerRepository customerRepository;

    public CustomerService(final CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    public void savedCustomer(final Customer customer)
    {
        // validate customer
        final String customareLastName = customer.getLastName();

        if (customareLastName == null)
        {
            throw new IllegalArgumentException("Customer lastName can not be null");
        }
        if (customareLastName.isBlank())
        {
            throw new IllegalArgumentException("Customer lastName can not be null");
        }

        // save customer to DB
        customerRepository.save(customer);
    }
}

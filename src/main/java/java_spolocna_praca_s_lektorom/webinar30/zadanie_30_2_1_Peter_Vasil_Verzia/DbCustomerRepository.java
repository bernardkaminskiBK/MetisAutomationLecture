package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Peter_Vasil_Verzia;

public class DbCustomerRepository implements CustomerRepository
{
    @Override
    public void save(final Customer customer)
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        // db.execute("insert into customer(first_name, last_name)
        // values(" + customer.getFirstName() + "," + customer.getLastName() ");")
    }

}

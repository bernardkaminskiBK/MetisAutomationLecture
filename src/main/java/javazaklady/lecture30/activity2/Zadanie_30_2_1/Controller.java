package javazaklady.lecture30.activity2.Zadanie_30_2_1;

/*
    Táto trieda sluzi na reprezentativny ucel, ako pouzivat kvazi klasickym sposobom CustomerServiceImpl
    co sa vlastne ani nerobi bezne v praxi, ale pre lepsie pochopenie depedency injection a mockovanie tychto tried malo by posluzit fajn.
 */
public class Controller {

    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl(new CustomerRepository());

        Customer customerMarcus = new Customer(1, "Marcus", "Salazar");
        Customer customerAmanda = new Customer(2, "Amanda", "Cunningham");
        Customer customerDanny = new Customer(3, "Danny", "Humphrey");

        customerService.create(customerMarcus);
        customerService.create(customerAmanda);
        customerService.create(customerDanny);

        System.out.println("number of all customers is: " + customerService.getAllCustomers().size());
        System.out.println(customerService.getAllCustomers().toString());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("deleting customer Amanda!");
        customerService.delete(customerAmanda);

        System.out.println("number of all customers after deleting Amanda is: " + customerService.getAllCustomers().size());
        System.out.println(customerService.getAllCustomers().toString());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Updating first customer in DB...");
        Customer customerById = customerService.getCustomerById(1);

        Customer customerToUpdate = new Customer();
        customerToUpdate.setId(customerById.getId());
        customerToUpdate.setFirstName("Thomas");
        customerToUpdate.setLastName(customerById.getLastName());

        customerService.update(customerToUpdate);

        System.out.println(customerService.getAllCustomers().toString());

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}

package java_spolocna_praca_s_lektorom.webinar30.zadanie_30_2_1_Stara_Verzia_Nepouzivat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome - Testing using JUnit 5 !!!");

        new CustomerService(new DbCustomerRepository()).savedCustomer(new Customer("Peter", "Vasil"));
    }
}

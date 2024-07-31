public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create the repository instance
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService service = new CustomerService(repository);

        // Use the service to get a customer
        Customer customer = service.getCustomerById(1);
        System.out.println("Customer Details:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
    }
}

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // Simulate fetching a customer from a database
        // For simplicity, returning a static customer
        return new Customer(id, "John Doe", "johndoe@example.com");
    }
}

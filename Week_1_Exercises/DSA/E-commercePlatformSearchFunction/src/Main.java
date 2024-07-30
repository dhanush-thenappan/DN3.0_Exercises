public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Phone", "Electronics"),
            new Product("P003", "Shirt", "Clothing"),
            new Product("P004", "Book", "Stationery")
        };

        String searchName = "Phone";
        
        Product result = SearchAlgorithms.linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + result);

        result = SearchAlgorithms.binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + result);
    }
}

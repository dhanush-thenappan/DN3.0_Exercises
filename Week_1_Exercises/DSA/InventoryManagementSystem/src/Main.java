public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        
        Product product1 = new Product("P001", "Product1", 100, 50.0);
        Product product2 = new Product("P002", "Product2", 200, 150.0);

        ims.addProduct(product1);
        ims.addProduct(product2);
        
        ims.displayProducts();
        
        product1.setPrice(55.0);
        ims.updateProduct(product1);
        
        ims.displayProducts();
        
        ims.deleteProduct("P001");
        ims.displayProducts();
    }
}

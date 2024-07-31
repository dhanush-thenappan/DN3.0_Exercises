public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_image1.jpg");
        Image image2 = new ProxyImage("test_image2.jpg");

        // Load and display images
        image1.display();
        image2.display();

        // Display images again to demonstrate caching
        image1.display();
        image2.display();
    }
}

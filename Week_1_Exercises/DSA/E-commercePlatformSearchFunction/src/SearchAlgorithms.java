import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    // Linear search implementation
    public static Product linearSearch(Product[] products, String searchName) {
        for (Product product : products) {
            if (product.getProductName().equals(searchName)) {
                return product;
            }
        }
        return null;
    }

    // Binary search implementation
    public static Product binarySearch(Product[] products, String searchName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = products[mid].getProductName().compareTo(searchName);

            if (result == 0) {
                return products[mid];
            }
            if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

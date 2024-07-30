public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 150.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "Dave", 100.0)
        };

        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        SortingAlgorithms.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Order[] ordersForQuickSort = {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 150.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "Dave", 100.0)
        };

        System.out.println("\nBefore Quick Sort:");
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }

        SortingAlgorithms.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);

        System.out.println("\nAfter Quick Sort:");
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}

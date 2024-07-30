import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {

    private static Map<Integer, Double> memo = new HashMap<>();

    // Method to calculate future value using recursion with memoization
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Check if the value is already calculated
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }

        // Base case
        if (periods == 0) {
            return presentValue;
        }

        // Recursive case with memoization
        double futureValue = (1 + growthRate) * calculateFutureValue(presentValue, growthRate, periods - 1);
        memo.put(periods, futureValue);

        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Example present value
        double growthRate = 0.05; // Example growth rate (5%)
        int periods = 10; // Example number of periods

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}

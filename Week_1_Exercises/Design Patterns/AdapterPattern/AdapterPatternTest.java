public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of the payment gateways
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();

        // Create adapters for the payment gateways
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        // Process payments through the adapters
        payPalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(200.0);
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Interface representing a strategy for processing payments.
 */
abstract class PaymentMethod {
    /**
     * Processes a payment for a given amount.
     *
     * @param amount The total amount to be paid.
     * @return The amount after processing the payment.
     */
    abstract double processPayment(double amount);
}

/**
 * Concrete strategy for processing payments with a credit card.
 */
class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    /**
     * Constructs a CreditCardPayment object with the specified card details.
     *
     * @param cardNumber     The credit card number.
     * @param expirationDate The expiration date of the credit card.
     * @param cvv            The CVV code of the credit card.
     */
    public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    /**
     * Processes a payment using a credit card.
     *
     * @param amount The total amount to be paid.
     * @return The amount after processing the payment.
     */
    @Override
    public double processPayment(double amount) {
        // Simulate credit card processing
        System.out.println("Processing credit card payment...");
        // Assume processing fee of 2%
        double processingFee = amount * 0.02;
        return amount + processingFee;
    }
}

/**
 * Concrete strategy for processing payments with cash.
 */
class CashPayment extends PaymentMethod {

    /**
     * Processes a payment using cash.
     *
     * @param amount The total amount to be paid.
     * @return The amount after processing the payment.
     */
    @Override
    public double processPayment(double amount) {
        // No processing fee for cash payments
        System.out.println("Accepting cash payment...");
        return amount;
    }
}

/**
 * Context class that handles payments based on the provided payment method.
 */
class PaymentProcessor {
    private PaymentMethod paymentMethod;

    /**
     * Constructs a PaymentProcessor object with the specified payment method.
     *
     * @param paymentMethod The payment method to be used.
     */
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Processes a payment using the provided payment method.
     *
     * @param amount The total amount to be paid.
     * @return The amount after processing the payment.
     */
    public double processPayment(double amount) {
        return paymentMethod.processPayment(amount);
    }
}

/**
 * Demo class showcasing the usage of various payment methods.
 */
public class Payment_Methods_Demo {
    public static void main(String[] args) {
        List<PaymentProcessor> paymentProcessors = new ArrayList<>();
        paymentProcessors.add(new PaymentProcessor(new CreditCardPayment("1234 5678 9012 3456", "12/25", "123"))); // Credit card payment
        paymentProcessors.add(new PaymentProcessor(new CashPayment())); // Cash payment

        double totalPrice = 100; // Total amount to be paid

        for (PaymentProcessor paymentProcessor : paymentProcessors) {
            totalPrice = paymentProcessor.processPayment(totalPrice);
        }

        System.out.println("Final amount after processing payments: $" + totalPrice);
    }
}

/**
 * Even though the processPayment method differs between CreditCardPayment
 * and CashPayment classes, changes to the PaymentMethod class
 * are unnecessary when processing any payment type.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Interface representing a method for processing payments.
 */
interface PaymentMethod {
    /**
     * Processes a payment transaction.
     *
     * @param amount The amount to be paid.
     */
    void processPayment(double amount);
}

/**
 * Class representing a payment gateway.
 */
class PaymentGateway {
    private final List<PaymentMethod> paymentMethods;

    /**
     * Constructs a new PaymentGateway with the given payment methods.
     *
     * @param paymentMethods The list of payment methods.
     */
    public PaymentGateway(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * Processes a payment transaction using all the configured payment methods.
     *
     * @param amount The amount to be paid.
     */
    public void processPayment(double amount) {
        for (PaymentMethod method : paymentMethods) {
            method.processPayment(amount);
        }
    }
}

/**
 * Class representing a credit card payment method.
 */
class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // Code to process credit card payment
        System.out.println("Processing credit card payment for $" + amount);
    }
}

/**
 * Class representing a PayPal payment method.
 */
class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // Code to process PayPal payment
        System.out.println("Processing PayPal payment for $" + amount);
    }
}

/**
 * Demo class demonstrating the usage of a payment gateway with different payment methods.
 */
public class Dependency_Inversion_Principle_Payments {
    public static void main(String[] args) {
        // Create credit card and PayPal payment methods
        PaymentMethod creditCardMethod = new CreditCardPayment();
        PaymentMethod paypalMethod = new PayPalPayment();

        // Create a payment gateway with credit card and PayPal payment methods
        List<PaymentMethod> methods = new ArrayList<>();
        methods.add(creditCardMethod);
        methods.add(paypalMethod);
        PaymentGateway paymentGateway = new PaymentGateway(methods);

        // Process a payment transaction using all methods
        paymentGateway.processPayment(100.0);
    }
}

/**
 * We have an interface PaymentMethod representing a method for processing payments.
 * The CreditCardPayment and PayPalPayment classes implement the PaymentMethod
 * interface to represent credit card and PayPal payment methods, respectively.
 * The PaymentGateway class represents a payment gateway that can process payments
 * using different methods. It depends on the abstraction provided by the PaymentMethod
 * interface, allowing it to use any payment method without being coupled to specific implementations.
 * The Dependency_Inversion_Principle_Payments class demonstrates the usage of the payment gateway
 * with different payment methods. It creates instances of CreditCardPayment and PayPalPayment
 * and configures the payment gateway with them, adhering to the Dependency Inversion Principle
 * by depending on abstractions rather than concrete implementations.
 */

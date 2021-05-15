import java.util.Scanner;

/*interface Payment and various client classes will implement payable amount for a goods.*/

interface PaymentStrategy {

	// abstract methods of interface
	public void info();

	public void pay(String amount);

}

//payment strategy using Bitcoin
class BitcoinPaymentStrategy implements PaymentStrategy {
	// input details are data members
	String username;
	String QRcode;
	String password;

	// method to ask for user information
	public void info() {
		System.out.println("Enter username");
		Scanner sc = new Scanner(System.in);
		username = sc.next();

		System.out.println("Enter QR code");
		Scanner sc2 = new Scanner(System.in);
		QRcode = sc2.next();

		System.out.println("Enter password");
		Scanner sc1 = new Scanner(System.in);
		password = sc1.next();

	}

	// method to ask for user information
	public void pay(String amount) {
		System.out.println("Payment of Rs. " + amount + " is successful using Bitcoin");
	}

}

//Payment Strategy using CreditCard
class CreditCardPaymentStrategy implements PaymentStrategy {
	// card details are data members
	String name;
	long cardNumber;
	int cvv;

	// method to ask for user information
	public void info() {
		System.out.println("Enter name on card");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("Enter card number");
		Scanner sc2 = new Scanner(System.in);
		cardNumber = sc2.nextInt();
		System.out.println("Enter CVV");
		Scanner sc1 = new Scanner(System.in);
		cvv = sc1.nextInt();

	}

	// method to ask for user information
	public void pay(String amount) {
		System.out.println("Payment of Rs. " + amount + " is successful using Credit Card");
	}

}

//Payment Strategy using PayPal
class ByPayPalStrategy implements PaymentStrategy {
	// user details are data members
	String email;
	String password;

	// successful payment message
	public void pay(String amount) {
		System.out.println("Payment of Rs. " + amount + " is successful using Paypal");
	}

	// method to ask for user information
	public void info() {

		System.out.println("Enter email-id");
		Scanner sc = new Scanner(System.in);
		email = sc.next();
		System.out.println("Enter password");
		Scanner sc1 = new Scanner(System.in);
		password = sc1.next();

	}

}

class PaymentContext {
	private PaymentStrategy paymentStrategy;

	// Client will set what PaymentStrategy to use by calling this method

	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.paymentStrategy = strategy;
	}

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void info() {
		paymentStrategy.info();
	}

	public void pay(String amount) {
		paymentStrategy.pay(amount);
	}

}

public class Customer {

	public static void main(String[] args) {

		// Menu to ask for mode of payment

		System.out.println("Please enter Payment Type : 'CreditCard' or 'Bitcoin' or 'PayPal'");
		Scanner scanner = new Scanner(System.in);
		String paymentType = scanner.next();
		System.out.println("Payment type is : " + paymentType);

		// Enter amount
		System.out.println("\nPlease enter Amount to Pay : ");
		Scanner scanner1 = new Scanner(System.in);
		String amount = scanner1.next();

		PaymentContext ctx = null;
		ctx = new PaymentContext();

		// Corresponding payment strategy is used as per customer choice

		if ("CreditCard".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new CreditCardPaymentStrategy());
		} else if ("Bitcoin".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new BitcoinPaymentStrategy());
		} else if ("PayPal".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new ByPayPalStrategy());
		}

		System.out.println("PaymentContext has :" + ctx.getPaymentStrategy());
		ctx.info();
		ctx.pay(amount);

	}
}

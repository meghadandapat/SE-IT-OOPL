
import java.util.Scanner;

class Account { // parent class
	Scanner sc = new Scanner(System.in);

	// data members of Account class
	String name; // name of account holder
	int accno; // account number
	String type; // type of account
	double bal; // balance

	// method to get user details
	void Input() {
		System.out.println("Enter name::");
		name = sc.nextLine();

		System.out.println("Enter Account number:: ");
		accno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter type of account:: ");
		type = sc.nextLine();

		System.out.println("Enter Principal amount:: ");
		bal = sc.nextDouble();
	}

	// method to display user info
	void Display() {
		System.out.println("________________________________________________________________");
		System.out.println("Name::			" + name);
		System.out.println("Account No::		" + accno);
		System.out.println("Type::			" + type);
		System.out.println("Balance::		" + bal);
		System.out.println("_________________________________________________________________");
	}

	// method to deposit money
	void Deposit() {
		double amt;
		System.out.println("Enter the amount to be depositedt:: ");
		amt = sc.nextDouble();
		bal = bal + amt; // balance will be added in principal amount
	}
}

class Savings extends Account { // Saving is subclass derived from Account
	double interest;

	void compInterest() { // method to calculate compound interest
		int time;
		double rate;
		System.out.println("Enter duration (in years):: "); // duration in year
		time = sc.nextInt();
		System.out.println("Enter annual interest rate:: "); // interest rate
		rate = sc.nextDouble();
		interest = bal * Math.pow(1 + rate / 100, time) - bal; // compound interest formula
		System.out.println("The coumpount interest will be " + interest);
	}

	void withdrawal() { // method to withdraw money
		double amount;
		System.out.println("Enter the amount to be withdrawn:: ");
		amount = sc.nextDouble();
		if (bal >= amount) {
			bal = bal - amount; // balance will be reduced by money withdrawn
		} else {
			System.out.println("The amount cannot be withdrawn!!");
		}
	}
}

class Current extends Account { // Current is Subclass derived from Account

	double penalty;

	int minBal() {
		int ret1 = 1;
		if (bal <= 10000) {
			// if minimum balance in current account is less than 10,000 than penalty will
			// be imposed
			penalty = 2500;
			// penalty of 2,500 will be imposed for not maintaining minimum balance
			bal = bal - penalty;
			ret1 = 0;
		} else {
			System.out.println("No penalty imposed");
		}
		return ret1;
	}

	// method to withdraw money
	void withdrawal() {
		double amt;
		System.out.println("Enter the amount to withdraw");// withdrawl amount
		amt = sc.nextDouble();
		int k = minBal();
		if (k == 1) {
			if (bal >= amt)
				bal = bal - amt;
		} else {
			System.out.println("The amount cannot be withdrawn");
			// if balance is less than amount to be withdrawn
		}

	}

	// method to deposit check
	void deposit_check() {

		System.out.println("Enter check amount");
		double check_amt = sc.nextDouble();
		bal = bal + check_amt;
		System.out.println("Your cheque has been deposited and current balance becomes: " + bal);

	}

}

public class BankCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch1, ch2;
		Scanner s1 = new Scanner(System.in);

		System.out.println("---Enter the account type---");
		System.out.println("1. Savings\n2. Current");
		ch1 = s1.nextInt();
		if (ch1 == 1) {
			Savings s = new Savings(); // object creation of savings class
			s.Input();
			int x = 1;
			do {
				System.out.println("_______________________________");
				System.out.println(
						"1. Deposit\n2. Display Balance\n3. Calculate Compound interest\n4. Withdrawl\n5. Exit");
				System.out.println("________________________________");
				ch2 = s1.nextInt();
				switch (ch2) {
				case 1:
					// deposit method called
					s.Deposit();
					// display method called
					s.Display();
					break;
				case 2:
					// display method called
					s.Display();
					break;
				case 3:
					// interest calculate method called
					s.compInterest();
					break;
				case 4:
					// withdrawl method called
					s.withdrawal();
					s.Display();
					break;
				case 5:
					x = 0;
					break;

				default:
					System.out.println("Invalid choice");

				}
			} while (x == 1);
		} else if (ch1 == 2) {
			Current c = new Current();
			c.Input();
			int x = 1;
			do {
				System.out.println("______________________________");
				System.out.println("1. Deposit\n2. Display Balance\n3. Withdrawl\n4. Deposit Chequebook\n5. Exit");
				System.out.println("_______________________________");
				ch2 = s1.nextInt();
				switch (ch2) {
				case 1:
					// deposit method called
					c.Deposit();
					c.Display();
					break;
				case 2:
					// display method called
					c.Display();
					break;
				case 3:
					// withdrawl method called
					c.withdrawal();
					c.Display();
					break;
				case 4:
					// deposit check method called
					c.deposit_check();
					c.Display();
					break;
				case 5:
					x = 0;
					break;

				default:
					System.out.println("Invalid choice");

				}
			} while (x == 1);

		}
		
		else {
			System.out.println("Invalid choice");
		}
	}

}

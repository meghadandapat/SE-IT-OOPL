import java.util.Scanner;

class ExceptionHandle {

	void Arithmetic() {
		// Method to Handle Arithmetic Exception
		Scanner sc = new Scanner(System.in);
		// Two integers are taken as input
		System.out.println("Enter two numbers: ");
		System.out.print("First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Second Number: ");
		int num2 = sc.nextInt();
		// If the second number is zero then Exception is handled otherwise quotient is
		// displayed
		try {
			int data = num1 / num2;
			System.out.print("The quotient is " + data);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Dividing by zero is Invalid!!");
		}
	}

	void NumberFormat() {
		// Method to handle Number format Exception
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		// Two string type inputs are taken from user
		System.out.print("First Number: ");
		String x = sc.next();
		
		/* If the string consists of only digits it can be converted to integer and
		 displayed otherwise exception is handled*/
		try {
			System.out.println("the first number is " + Integer.parseInt(x));

		} catch (NumberFormatException ex) {
			System.err.println(ex);
			System.out.println("Wrong input format. Please enter an integer");

		}
		System.out.print("Second Number: ");
		String y = sc.next();
		try {
			System.out.println("the second number is " + Integer.parseInt(y));

		} catch (NumberFormatException ex1) {
			System.err.println(ex1);
			System.out.println("Wrong input format. Please enter an integer");

		}
	}

	void ArrayIndex() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		// reading the number of elements from the that we want to enter
		int n = sc.nextInt();

		int[] array = new int[n];
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = sc.nextInt();
		}
		System.out.print("Enter index of element you want to access: ");
		int index = sc.nextInt();
		try {
			System.out.println("Element pesent at "+index+" is "+array[index]);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.err.println(a + "\nDesired Index cannot be accessed");

		}
	}
}

public class DisplayException {

	public static void main(String[] args) {
		// Menu driven code to handle the desired exception

		while (true) {
			System.out.print("\n\t\tMenu\n\t1. Handle Arithmetic Exception\n\t2. Handle Number Format Exception\n\t3. Handle Array Index Out of Bound Exception \n\t4. Exit");
			Scanner s = new Scanner(System.in);
			int ch = s.nextInt();
			ExceptionHandle obj = new ExceptionHandle();   //object creation
			switch (ch) {
			case 1:
				obj.Arithmetic();  //Method calling
				break;
			case 2:
				obj.NumberFormat();  //Method calling
				break;
			case 3:
				obj.ArrayIndex(); //Method calling
				break;
			case 4:
				System.exit(0);   //Exit
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

		}

	}
}

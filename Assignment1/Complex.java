package assignment1;

import java.util.Scanner;

class Complex_num {
	float real, imag;

	// Default constructor
	Complex_num() {
		real = 0;
		imag = 0;
	}

	// Parameterized constructor
	Complex_num(float num1, float num2) {
		real = num1;
		imag = num2;
	}

	// Add the numbers
	public void AddNumbers(Complex_num C1, Complex_num C2) {
		real = (C1.real + C2.real);
		imag = (C1.imag + C2.imag);
		System.out.println("Addition is(" + real + ")+(" + imag + ")i");
	}

	// Multiply the Numbers
	public void MultiplyNumbers(Complex_num C1, Complex_num C2) {
		real = ((C1.real * C2.real) - (C1.imag * C2.imag));
		imag = ((C1.real * C2.imag) + (C2.real * C1.imag));
		System.out.println("Multiplication is(" + real + ")+(" + imag + ")i");

	}

	// Subtract the Numbers
	public void SubtractNumbers(Complex_num C1, Complex_num C2) {
		real = (C1.real - C2.real);
		imag = (C1.imag - C2.imag);
		System.out.println("Subtraction is(" + real + ")+(" + imag + ")i");
	}

	// Divide the Numbers
	public void DivideNumbers(Complex_num C1, Complex_num C2) {
		if (C2.real == 0 & C2.imag == 0) // Validation for dividing by zero
			System.out.println("Invalid Result!! Dividing by zero is undefined");
		else {
			real = (((C1.real * C2.real) + (C1.imag * C2.imag)) / ((C2.real * C2.real) + (C2.imag * C2.imag)));
			imag = (((C2.real * C1.imag) - (C1.real * C2.imag)) / ((C2.real * C2.real) + (C2.imag * C2.imag)));
			System.out.println("Division is(" + real + ")+(" + imag + ")i");
		} // end of else

	} // end of Division method
}

public class Complex {

	public static void main(String[] args) {

		float comp1, comp2;

		Complex_num cal = new Complex_num();
		// Taking two complex numbers from user as input

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number");
		System.out.print("Real Part: ");
		comp1 = input.nextInt(); // Input is converted to Integer
		System.out.print("Imaginary Part ");
		comp2 = input.nextInt(); // Input is Converted to Integer
		Complex_num Object1 = new Complex_num(comp1, comp2);
		// Object of first number is created

		System.out.println("Enter the Second Number");
		System.out.print("Real Part: ");
		comp1 = input.nextInt(); // Input is converted to Integer
		System.out.print("Imagiary Part ");
		comp2 = input.nextInt(); // Input is converted to Integer
		Complex_num Object2 = new Complex_num(comp1, comp2);
		// Object of second number is created

		// Menu Driven Program using switch case

		while (true) {
			System.out.println(
					"\nChoose one operation of complex numbers\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit");

			int c = input.nextInt();
			
			switch (c) {
			case 1:
				cal.AddNumbers(Object1, Object2);
				// Method of Addition is called
				break;
			case 2:
				cal.SubtractNumbers(Object1, Object2);
				// Method of Subtraction is called
				break;
			case 3:
				cal.DivideNumbers(Object1, Object2);
				// Method of Division is called
				break;
			case 4:
				cal.MultiplyNumbers(Object1, Object2);
				// Method of Multiplication is called
				break;
			case 5:
				System.exit(0); // Exit from program
			default:
				System.out.println("Enter a valid choice");
				break;
			} // end of switch case

		} // end of while loop

	}// end of main method

}// end of class Complex

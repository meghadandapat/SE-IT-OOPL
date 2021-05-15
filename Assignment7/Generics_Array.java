import java.util.*;


//template class T 
class Template<T> {

	// method to check palindrome of string or integer
	void isPalindrome(T[] t) {
		int pal = 0;
		for (int i = 0; i < t.length; i++) {

			// create string buffer for string temp
			String temp = t[i].toString();
			StringBuffer s = new StringBuffer(temp);

			// compare string to its reverse
			if (t[i].equals(s.reverse().toString())) {
				System.out.println(t[i] + " is a PALINDROME");
				pal += 1; // increment no of palindrome
			} else {
				System.out.println(t[i] + " is a NOT A PALINDROME");
			}
		}

		// ANALYSIS
		System.out.println("\n-------------PALINDROME ANALYSIS-------------");
		System.out.println("Total palindrome strings are:" + pal);
		System.out.println("Total non-palindrome strings are:" + (t.length - pal));
		System.out.println("---------------------------------------------");
	}

	// method to check odd or even
	void OddEven(T[] t) {
		int even = 0;
		for (int i = 0; i < t.length; i++) {
			// even condition
			if ((int) t[i] % 2 == 0) {
				System.out.println(t[i] + " is EVEN");
				even++; // increment no of even numbers
			} else {
				System.out.println(t[i] + " is ODD");
			}
		}

		// ANALYSIS
		System.out.println("\n------------- ODD-EVEN ANALYSIS-------------");
		System.out.println("Total even numbers:" + even);
		System.out.println("Total odd numbers:" + (t.length - even));
		System.out.println("---------------------------------------------");
	}

	// method to check prime or composite
	void isPrime(T[] t) {
		boolean flag = false;
		int prime = 0;
		for (int i = 0; i < t.length; i++) {
			flag = false;
			// composite number condition
			for (int j = 2; j < (int) t[i]; j++) {

				if ((int) t[i] % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(t[i] + " is PRIME");
				prime++; // increment no of prime numbers
			} else {
				System.out.println(t[i] + " is COMPOSITE");
			}

		}
		// ANALYSIS
		System.out.println("\n------------- PRIME-COMPOSITE ANALYSIS-------------");
		System.out.println("Total prime numbers:" + prime);
		System.out.println("Total composite numbers:" + (t.length - prime));
		System.out.println("---------------------------------------------");

	}

}// class end

public class Generics_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("\nEnter the type for which you want yo use template?");
			System.out.println("1)STRING \n2)INTEGER \n3)EXIT");
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter your choice:");
			int opn = sc.nextInt();

			switch (opn) {

			case 1:
				Template<String> T1 = new Template<String>(); // STRING template
				
				System.out.println("Enter the number of strings:");
				int no_strings = sc.nextInt();

				// input for strings
				String s[] = new String[no_strings];
				for (int i = 0; i < no_strings; i++) {
					System.out.print("Enter the string " + (i + 1) + "::");
					s[i] = sc.next();
				}
				T1.isPalindrome(s);
				break;

			case 2:
				Template<Integer> T2 = new Template<Integer>(); // INTEGER template
				System.out.println("Enter the number of integrs:");
				
				int no_int = sc.nextInt();

				// input for integers
				Integer x[] = new Integer[no_int];
				for (int j = 0; j < no_int; j++) {
					System.out.print("Enter the integer " + (j + 1) + "::");
					x[j] = sc.nextInt();
				}

				boolean flag = true;
				int ch = 0;
				do {
					System.out.println("\nEnter the operation \n1.ODD-EVEN\n2.PRIME-COMPOSITE ");
					System.out.println("Enter the choice:");
					ch = sc.nextInt();

					if (ch == 1) {
						T2.OddEven(x); // odd-even method call
					}

					if (ch == 2) {
						T2.isPrime(x); // prime-composite method call
						flag = false; // to go out of do loop
					}

				} while (flag == true); // end do
				break;

			case 3:
				
				System.out.println("Are you sure you want to exit? \n1.YES\n2.NO");
				int p = sc.nextInt();
				if (p == 1) {
					System.out.println("THANK YOU!!!"); // exit the program
					return;
				} else {
					break; // go for options
				}
			default:
				System.out.println("Enter valid choice!!"); // for invalid choice
				break;
			}
		}
	}
}// end function
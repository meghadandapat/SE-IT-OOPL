import java.util.Scanner;

class Employee { // Parent class Employee
	String Emp_name;
	int Emp_id;
	String Address;
	String mail_id;
	long mobile_no;

	public void get_details() {
		// Method to take input of details

		Scanner sc = new Scanner(System.in);

		// Take input as Name of Employee
		System.out.print("Enter employee name");
		Emp_name = sc.next();

		// Validation of name of employee. It should contain only alphabets

		// Creating an array that contains characters of string emp_name
		int i = 0;
		do {
			char[] charArray = Emp_name.toCharArray();

			char ch = charArray[i];
			// Every character in the Emp_name is checked whether alphabet or not
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
				// If user enters digits or special characters program will ask user to enter a
				// valid name consisting of only alphabets
				System.out.print("Enter a valid name");
				Emp_name = sc.next();
			} else {
				i++;
			}

		} while (i < Emp_name.length());
		// when emp_name will have only alphabets then it will be valid and program will
		// break the loop and ask next input

		// Validation of Employee id
		do {
			System.out.print("Enter employee id");
			Emp_id = sc.nextInt();
		} while (Emp_id < 0);
		// Employee id cannot be negative

		// Take input as address of employee
		System.out.print("Enter address of employee");
		Address = sc.next();

		// Take input as Mail id of employee
		System.out.print("Enter mail id of employee ");
		mail_id = sc.next();

		// Take input as mobile number of employee
		System.out.print("Enter mobile number of employee +91 ");
		mobile_no = sc.nextLong();

		// Validation of Mobile number
		long num = Long.toString(mobile_no).length();
		// Long is converted to string to count the number of digits in mobile number
		// using .length method of string
		while (num != 10) {
			// As long as mobile number contains less than 10 digits program will ask to
			// enter it again
			System.out.print("Please enter a valid 10 digit mobile number +91 ");
			mobile_no = sc.nextLong();
			long num1 = Long.toString(mobile_no).length();
			num = num1;
		}
	}

	// Method to calculate and display the pay slip of employee
	public void calc(double basic_pay) {
		// Calculating various incomes using formulae
		double DA = 0.97 * basic_pay;
		double HRA = 0.1 * basic_pay;
		double PF = 0.12 * basic_pay;
		double fund = 0.001 * basic_pay;
		double gross_salary = DA + HRA;
		double net_salary = gross_salary - (PF + fund);

		// Display pay slip
		System.out.println("\n___________________________________________________ ");
		System.out.println("\nEmployee Id          : " + Emp_id);
		System.out.println("\nEmployee name        : " + Emp_name);
		System.out.println("\nEmployee e-mail      : " + mail_id);
		System.out.println("\nEmployee DA          : " + DA);
		System.out.println("\nEmployee HRA         : " + HRA);
		System.out.println("\nEmployee PF          : " + PF);
		System.out.println("\nEmployee FUND        : " + fund);
		System.out.println("\nEmployee gross Salary: " + gross_salary);
		System.out.println("\nEmployee net salary  :" + net_salary);
		System.out.println("\n __________________________________________________ ");
	}

}

class Programmer extends Employee {
	// Programmer class is inherited from parent class Employee
	public void inputP() {
		System.out.println("\nEnter details of Programmer");
		super.get_details();
		/*
		 * get_details method is present in the main class. Hence using concept of
		 * inheritance we can call method of immediate parent class inside the child
		 * class using super keyword
		 */
		System.out.println("Enter basic pay of Programmer");
		Scanner s = new Scanner(System.in);
		double basic_pay = s.nextDouble();
		// Basic pay of employee is entered
		super.calc(basic_pay);
		/*
		 * calc method is present in the main class. Hence using concept of inheritance
		 * we can call method of immediate parent class inside the child class using
		 * super keyword
		 */

	}

}

class TeamLead extends Employee {
	// TeamLead class is inherited from parent class Employee
	public void inputT() {
		System.out.println("\nEnter details of Team Lead");
		super.get_details();
		/*
		 * get_details method is present in the main class. Hence using concept of
		 * inheritance we can call method of immediate parent class inside the child
		 * class using super keyword
		 */
		System.out.println("Enter basic pay of Team Lead");
		Scanner s = new Scanner(System.in);
		double basic_pay = s.nextDouble();
		// Basic pay of employee is entered
		super.calc(basic_pay);
		/*
		 * calc method is present in the main class. Hence using concept of inheritance
		 * we can call method of immediate parent class inside the child class using
		 * super keyword
		 */

	}

}

class AssistantProjectManager extends Employee {
	// Assistant Project Manager class is inherited from parent class Employee
	public void inputA() {
		System.out.println("\nEnter details of Assistent Project Manager");
		super.get_details();
		/*
		 * get_details method is present in the main class. Hence using concept of
		 * inheritance we can call method of immediate parent class inside the child
		 * class using super keyword
		 */
		System.out.println("Enter basic pay of Assistent Project Manager");
		Scanner s = new Scanner(System.in);
		double basic_pay = s.nextDouble();
		// Basic pay of employee is entered
		super.calc(basic_pay);
		/*
		 * calc method is present in the main class. Hence using concept of inheritance
		 * we can call method of immediate parent class inside the child class using
		 * super keyword
		 */

	}
}

class ProjectManager extends Employee {
	// Project Manager class is inherited from parent class Employee
	public void inputPM() {
		System.out.println("\nEnter details of Project Manager");
		super.get_details();

		/*
		 * get_details method is present in the main class. Hence using concept of
		 * inheritance we can call method of immediate parent class inside the child
		 * class using super keyword
		 */
		System.out.println("Enter basic pay of Project Manager");
		Scanner s = new Scanner(System.in);
		double basic_pay = s.nextDouble();
		super.calc(basic_pay);

		/*
		 * calc method is present in the main class. Hence using concept of inheritance
		 * we can call method of immediate parent class inside the child class using
		 * super keyword
		 */

	}
}

public class Main {

	public static void main(String[] args) {

		// Menu to display all the positions of an Employee
		while (true) {
			System.out.println(
					"\nChoose position of Employee\n1.Programmer\n2.Team Lead\n3.Assistent Project Manager\n4.Project Manager\n5.Exit");
			Scanner choice = new Scanner(System.in);
			int c = choice.nextInt();

			// switch case to generate pay slip for particular employee
			switch (c) {
			case 1:
				Programmer p1 = new Programmer(); // Object of class programmer is created
				p1.inputP(); // Method of class programmer is called

				break;
			case 2:
				TeamLead t1 = new TeamLead(); // Object of class Team leader is created
				t1.inputT(); // Method of Class Team Leader is called

				break;
			case 3:
				AssistantProjectManager a1 = new AssistantProjectManager(); // Object of class Assistant Project Manager
																			// is created

				a1.inputA(); // Method of Class Assistant Project Manger is called

				break;
			case 4:
				ProjectManager pm = new ProjectManager(); // Object of class Project Manager is created
				pm.inputPM(); // Method of Class Project Manger is called

				break;
			case 5:
				System.exit(0); // Exit from program
			default:
				System.out.println("Please enter a valid choice");
				break;
			}

		}
	}

}

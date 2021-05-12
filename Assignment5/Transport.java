import java.util.Scanner;

interface Vehicle {

// methods are public and abstract by default
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);
}

class Bicycle implements Vehicle {

	// data members
	int speed;
	int gear;

	// constructor
	Bicycle() {
		speed = 10;
		gear = 1;
	}

	// all the abstract methods of Vehicle interface will are implemented in Bicycle
	// class

	// to change gear
	public void changeGear(int newGear) {

		gear = newGear;
		System.out.println("Bicycle is now running on gear " + gear);

	}

	// to increase speed

	public void speedUp(int increment) {

		System.out.println("Initially speed of bicycle was " + speed + " km/hr.");
		speed = speed + increment;
		System.out.println("After increasing speed of Bicycle is " + speed + " km/hr.");
	}

	// to decrease speed

	public void applyBrakes(int decrement) {
		System.out.println("Initially speed of bicycle was " + speed + " km/hr.");
		speed = speed - decrement;
		System.out.println("After applying brakes speed of Bicycle is " + speed + " km/hr.");
	}

	public void display() {
		System.out.println("Speed: " + speed + " km/hr. \nGear: " + gear);
	}

}

class Bike implements Vehicle {

	int speed;
	int gear;

	// all the abstract methods of Vehicle interface will are implemented in Bike
	// class

	// constructor
	Bike() {
		speed = 20;
		gear = 1;
	}

	// to change gear

	public void changeGear(int newGear) {

		gear = newGear;
		System.out.println("Bike is now running on gear " + gear);
	}

	// to increase speed

	public void speedUp(int increment) {
		System.out.println("Initially speed of bike was " + speed + " km/hr.");
		speed = speed + increment;
		System.out.println("After increasing speed of Bike is " + speed + " km/hr.");
	}

	// to decrease speed

	public void applyBrakes(int decrement) {
		System.out.println("Initially speed of bike was " + speed + " km/hr.");
		speed = speed - decrement;
		System.out.println("After applying brakes speed of Bike is " + speed + " km/hr.");
	}

	public void display() {
		System.out.println("Speed: " + speed + " km/hr. \nGear: " + gear);
	}

}

class Car implements Vehicle {

	int speed;
	int gear;

	// constructor
	Car() {
		speed = 20;
		gear = 1;
	}

	// all the abstract methods of Vehicle interface will are implemented in Car
	// class

	// to change gear

	public void changeGear(int newGear) {

		gear = newGear;
		System.out.println("Car is now running on gear " + gear);
	}

	// to increase speed

	public void speedUp(int increment) {
		System.out.println("Initially speed of car was " + speed + " km/hr.");
		speed = speed + increment;
		System.out.println("After increasing Speed of car is " + speed + " km/hr.");
	}

	// to decrease speed

	public void applyBrakes(int decrement) {
		System.out.println("Initially speed of car was " + speed + " km/hr.");
		speed = speed - decrement;
		System.out.println("After applying brakes speed of Car is " + speed + " km/hr.");
	}

	public void display() {
		System.out.println("Speed: " + speed + " km/hr. \nGear: " + gear);
	}

}

public class Transport {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nSelect the mode of transportation: \n\t1. Bicycle\n\t2. Bike\n\t3. Car");
		int ch = sc.nextInt();
		
		Bicycle bicycle = new Bicycle(); // instance of Bicycle Class
		Bike bike = new Bike(); // instance of Bike Class
		Car car = new Car(); // instance of Car Class


		while (ch > 0 && ch < 4) {
			
			System.out.println(
					"\nChoose operation: \n\t1. Change Gear\n\t2. Increase Speed\n\t3. Decrease Speed\n\t4. Display present state\n\t5. Exit");
			int operationNo = sc.nextInt();
			
			switch (operationNo) {
			case 1:

				System.out.println("Which gear do you want to use? ");
				int g = sc.nextInt();
				if (ch == 1)
					bicycle.changeGear(g);
				else if (ch == 2)
					bike.changeGear(g);
				else
					car.changeGear(g);

				break;

			case 2:
				System.out.println("By how many km/hr do you want to increase speed?");
				int incre = sc.nextInt();
				if (ch == 1)
					bicycle.speedUp(incre);
				else if (ch == 2)
					bike.speedUp(incre);
				else
					car.speedUp(incre);

				break;

			case 3:
				System.out.println("By how many km/hr do you want to decrease speed?");
				int decre = sc.nextInt();
				if (ch == 1)
					bicycle.applyBrakes(decre);
				else if (ch == 2)
					bike.applyBrakes(decre);
				else
					car.applyBrakes(decre);

				break;

			case 4:
				if (ch == 1)
					bicycle.display();
				else if (ch == 2)
					bike.display();
				else
					car.display();
			
				break;
				
			case 5:
				System.exit(0);

			default:
				System.out.println("Enter valid choice");

			}//end of switch
		}//end of while
		System.out.println("Invalid choice!!");
	}// end of main method

}

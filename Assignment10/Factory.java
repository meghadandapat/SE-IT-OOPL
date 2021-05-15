

import java.util.Scanner;

enum CarType {	//Specify the car type
	SMALL, SEDAN, LUXURY, SUV
}

abstract class Car1 {//Class for car

	public Car1(CarType model) {
		this.model = model;
	}


	// Do subclass level processing in this method
	protected abstract void construct();

	private CarType model = null;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	public void build() {
		System.out.println("Gathering components");
		System.out.println("Building chasis");
		System.out.println("Adding seats");
		System.out.println("Installing Engine");
		System.out.println("Painting");
	}
}

class LuxuryCar extends Car1 {//Luxury car class

	LuxuryCar() {//Constructor
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {//Building class
		System.out.println("Building luxury car");
		// add accessories
	}
	
	void showAvailable() {//Show available cars
		Scanner sc = new Scanner(System.in);
		int choice;//Choice 
		int x = 1;
		
		do {
		System.out.println("\n\nChoose car::");//Luxury cars
		System.out.println("\n1. Mercedes-Benz S-class"
				+ "\n2. Jaguar XF"
				+ "\n3. Land Rover Discovery" +"\n4. Exit");
	
		System.out.println("Enter choice:: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1://1st car specifications
			build();
			
			System.out.println("\n\n---Mercedes-Benz S-class Specifications---");
			System.out.println("Price::			Rs.1.38 - 2.78 Cr");
			System.out.println("Seating Capacity::	5");
			System.out.println("Fuel Economy::		16km/l");
			System.out.println("Engine::		2.9 L 6-cylinder diesel, 3.0 L V6");
			System.out.println("Mileage (upto)::	13.5 kmpl");
			System.out.println("Transmission::		Automatic");
			System.out.println("Boot Space::		500");
			System.out.println("---------------------------");
			break;
			
		case 2://2nd car specifications
			build();
			
			System.out.println("\n\n---Jaguar XF Specfications---");
			System.out.println("Price::			Rs.55.67 Lakh");
			System.out.println("Seating Capacity::	5");
			System.out.println("Fuel Capacity::		74 L");
			System.out.println("Engine::		2.0 L 4-cylinder");
			System.out.println("Mileage (upto)::	10.8 kmpl");
			System.out.println("Transmission::		Automatic");
			System.out.println("Boot Space::		505");
			System.out.println("---------------------------");
			break;
			
		case 3://3rd car specifications 
			build();
			
			System.out.println("\n\n---Land Rover Discovery Specfications---");
			System.out.println("Price::			Rs 75.59 Lakh onwards");
			System.out.println("Seating Capacity::	5");
			System.out.println("Mileage (upto)::	12.05 kmpl");
			System.out.println("Transmission::		Automatic");
			System.out.println("Fuel Type::		Petrol");
			System.out.println("---------------------------");
			break;
		case 4:
			System.exit(0);
			break;
			
		default:
			System.out.println(" Please Enter Valid Choice");
		}
		}while(x==1);
	}
}

class SmallCar extends Car1 {//Small car class

	SmallCar() {//Constructor
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {//Building small car
		System.out.println("Building small car");
		// add accessories
	}
	
	void showAvailable() {//Show available cars
		Scanner sc = new Scanner(System.in);
		int choice;
		int x = 1;
		
		do {
		System.out.println("\n\nChoose car to build::");//Display cars
		System.out.println("\n1. Maruti Alto"
				+ "\n2. Kia Forte"
				+ "\n3. Volkswagen Polo" +"\n4. Exit");
		
		System.out.println("Enter choice:: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1://Specifications of 1st car
			build();
			
			System.out.println("\n\n---Maruti Alto Specfications---");
			System.out.println("Price::			Rs 2.95 lakhs - Rs 4.41 lakhs");
			System.out.println("Seating Capacity::	4,5");
			System.out.println("Engine::		0.80 L 3-cylinder, 0.80 L 3-cylinder natural gas");
			System.out.println("Mileage (upto)::	22.05 to 31.59 km/kg");
			System.out.println("Transmission::		Manual");
			System.out.println("---------------------------");
			break;
			
		case 2://Specifications of 2nd car
			build();
			
			System.out.println("\n\n---Honda Brio Specfications---");
			System.out.println("Price::			Rs 4.73 Lakh - 6.81 Lakh");
			System.out.println("Seating Capacity::	5");
			System.out.println("Engine::		1198 cc");
			System.out.println("Mileage (upto)::	22.0 kmpl");
			System.out.println("Transmission::		Manual & Automatic");
			System.out.println("---------------------------");
			break;
			
		case 3://Specifications of 3rd car
			build();
			
			System.out.println("\n\n---Maruti Suzuki Wagon R Specfications---");
			System.out.println("Price::			Rs 4.51 Lakh onwards");
			System.out.println("Seating Capacity::	5");
			System.out.println("Engine::		1197 cc");
			System.out.println("Mileage (upto)::	20.52 to 32.52 kmpl");
			System.out.println("Transmission::		Manual");
			System.out.println("---------------------------");
			break;
		case 4:
			System.exit(0);
			break;
			
		default:
			System.out.println(" Please Enter Valid Choice");
		}
		}while(x==1);
	}
}

class SedanCar extends Car1 {//Sedan car class

	SedanCar() {//Constructor
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building sedan car");
		// add accessories
	}
	
	void showAvailable() {//Show available cars
		Scanner sc = new Scanner(System.in);
		int choice;
		int x = 1;
		
		do {//Show cars
		System.out.println("\n\nChoose car::");
		System.out.println("\n1. Maruti Suzuki Ciaz"
				+ "\n2. Maruti Dzire"
				+ "\n3. Hyundai Verna" + "\n4. Exit");
		
		System.out.println("Enter choice:: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1://Display specifications
			build();
			
			System.out.println("\n\n---Honda City Specfications---");
			System.out.println("Price::			Rs 10.9 lakhs - 14.8 lakhs");
			System.out.println("Seating Capacity::	5");
			System.out.println("Engine::		1498 cc");
			System.out.println("Mileage (upto)::	24.1 kmpl");
			System.out.println("Transmission::		Manual/Automatic");
			System.out.println("---------------------------");
			break;
			
		case 2:
			build();
			
			System.out.println("\n\n---Maruti Dzire Specfications---");
			System.out.println("Price::			Rs 5.89 Lakh onwards");
			System.out.println("Seating Capacity::	5");
			System.out.println("Engine::		1197 cc");
			System.out.println("Mileage (upto)::	24.1 kmpl");
			System.out.println("Transmission::		Manual/Automatic");
			System.out.println("---------------------------");
			break;
			
		case 3:
			build();
			
			System.out.println("\n\n---Hyundai Verna Specfications---");
			System.out.println("Price::			Rs 9.03 Lakh onwards");
			System.out.println("Seating Capacity::	5");
			System.out.println("Engine::		1497 cc");
			System.out.println("Mileage (upto)::	17.7 to 25 kmpl");
			System.out.println("Transmission::		Manual/Automatic");
			System.out.println("---------------------------");
			break;
		case 4:
			System.exit(0);
			break;
			
		default:
			System.out.println(" Please Enter Valid Choice");
			
		
		}
		}while(x==1);
	}
}

class SuvCar extends Car1 {//Suv car class

	SuvCar() {//Constructor
		super(CarType.SUV);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building SUV car");
		// add accessories
	}
	
	void showAvailable() {//Show available cars
		Scanner sc = new Scanner(System.in);
		int choice;
		int x = 1;
		do {//Display cars
		System.out.println("\n\nChoose car to build::");
		System.out.println("\n1. Hyundai Creta"
				+ "\n2. KIA Sonet"
				+ "\n3. Nissan Magnite" + "\n4. Exit");
	
		System.out.println("Enter choice:: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1://Show specifications
			System.out.println("\n\n---Hyundai Creta---");
			System.out.println("Price::			Rs 9.03 Lakh onwards");
			System.out.println("Seating Capacity::	5");
			System.out.println("Engine::		1497 cc");
			System.out.println("Mileage (upto)::	17.7 to 25 kmpl");
			System.out.println("Transmission::		Manual/Automatic");
			System.out.println("---------------------------");
			break;
			
		case 2:
			System.out.println("\n\n---KIA Sonet---");
			System.out.println("Price::			Rs 6.71 lakhs onwards");
			System.out.println("Seating Capacity::	5");
			System.out.println("Fuel Type::		Petrol & Diesel");
			System.out.println("Engine::		1.0 L 3-cylinder, 1.2 L 4-cylinder, 1.5 L 4-cylinder diesel");
			System.out.println("Mileage (upto)::	18.2 to 24.1 kmpl");
			System.out.println("Transmission::		Manual/Automatic");
			System.out.println("---------------------------");
			break;
			
		case 3:
			System.out.println("\n\n---Nissan Magnite---");
			System.out.println("Price::			Rs 4.99 Lakh onwards");
			System.out.println("Seating Capacity::	5");
			System.out.println("Fuel Type::		Petrol & Diesel");
			System.out.println("Engine::		999 cc");
			System.out.println("Mileage (upto)::	17.7 to 19.42 kmpl");
			System.out.println("Transmission::		Manual & Automatic (CVT)");
			System.out.println("---------------------------");
			break;
			
		case 4:
			System.exit(0);
			break;
			
		default:
			System.out.println(" Please Enter Valid Choice");
		}
		}while(x==1);
	}
}


class CarFactory {//Car factory class
	
	public static Car1 buildCar(CarType model) {
		Car1 car = null;
		switch (model) {
		case SMALL:
			//Show small cars
			SmallCar small = new SmallCar();
			small.showAvailable();
			break;

		case SEDAN:
			//Show sedan cars
			SedanCar sedan = new SedanCar();
			sedan.showAvailable();
			break;

		case LUXURY:
			//Show luxury cars
			LuxuryCar luxury = new LuxuryCar();
			luxury.showAvailable();
			break;
			
		case SUV:
			//Show SUV cars
			SuvCar suv = new SuvCar();
			suv.showAvailable();
		default:
			// throw some exception
			break;
		}
		return car;
	}
}

public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		int x = 1;
		
		
		do {//Menu driven car
			System.out.println("\n\nChoose car::");
			System.out.println("1. SMALL"
					+ "\n2. SEDAN"
					+ "\n3. LUXURY"
					+ "\n4. SUV" + "\n5. Exit");
			
			System.out.println("Enter choice:: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1://Small car
				System.out.println(CarFactory.buildCar(CarType.SMALL));
				break;
				
			case 2://Sedan car
				System.out.println(CarFactory.buildCar(CarType.SEDAN));
				break;
				
			case 3://Luxury car
				System.out.println(CarFactory.buildCar(CarType.LUXURY));
				break;
				
			case 4://Suv
				System.out.println(CarFactory.buildCar(CarType.SUV));
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println(" Please Enter Valid Choice");
				break;
			}
		}while(x == 1);         
	}

}
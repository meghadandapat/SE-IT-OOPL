
import java.util.Scanner;
import java.io.*;

public class Student {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String studentname; //name of student
	int rollno, mob_no; //roll number and mobile number
	float marks;//marks
		
	//method to create a new file
	void create() {
		try {
			File file = new File("Student.txt");
			//File named Student.txt is created
			boolean x = file.createNewFile();
			if (x) {
				System.out.println("File has been  created successfully! ");
			//Message of successful creation after new file is created

			} else {
				System.out.println("File already present");
				//message if file already exists
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");

		}				
		
				
		try {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Student.txt", true)));
		int x = 1;
		
		do {
			Scanner sc = new Scanner(System.in);
			int y;
			//take input from user for name,roll no and mobile no.
			
			System.out.print("\nEnter Student Name: ");
			studentname = br.readLine();
			
			System.out.print("Student Roll no: ");
			rollno = Integer.parseInt(br.readLine());		
			
			System.out.print("Mobile Number: ");
			mob_no = Integer.parseInt(br.readLine());
			
			System.out.print("Marks : ");
			marks = Float.parseFloat(br.readLine());
			
			//display student data

			pw.println(studentname + "\t" + rollno + "\t" + marks + "\t" + mob_no);
			
			System.out.println("Do you want to enter more records? \n1) Yes\n2) No");
			
			y = sc.nextInt();
			
			if(y == 2) {
				x = 0;
			}
		}while(x==1); //loop to add more records
		pw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	void display() {
		try {
			// Open the file
			BufferedReader file = new BufferedReader(new FileReader("Student.txt"));
			String name;
			int i = 1;
			// Read records from the file
			while ((name = file.readLine()) != null) {
				System.out.println(name);
				System.out.println("");
			}
			file.close();

		} catch (FileNotFoundException e) {
			System.out.println("\nERROR : File not Found !!!");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	void search() {
		try {
			// Open the file
			BufferedReader file = new BufferedReader(new FileReader("Student.txt"));
			String name;
			int flag = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an id of the student you want to search: ");
			String searchname = sc.next();
			// Read records from the file
			while ((name = file.readLine()) != null) {
				String[] line = name.split("\t");
				//System.out.println(line[0]);
				if (searchname.equalsIgnoreCase(line[1])) {
					System.out.println("Record found");
					System.out.println(name);
					System.out.println("");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("Record not found");
			file.close();

		} catch (FileNotFoundException e) {
			System.out.println("\nERROR : File not Found !!!");
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
	void clearRecords() {
		// Create a blank file
		try {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Student.txt")));
		pw.close();
		System.out.println("\nAll Records cleared successfully !");
		for (int i = 0; i < 999999999; i++);
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
	void modify() {
		try {
			// Open the file
			BufferedReader file1 = new BufferedReader(new FileReader("Student.txt"));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Student.txt", true)));
			String name;
			int flag = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name of the student you want to update: ");
			String searchname = sc.next();
			// Read records from the file
			while ((name = file1.readLine()) != null) {
				String[] line = name.split("\t");
				System.out.println(line[0]);
				if (!searchname.equalsIgnoreCase(line[0])) {
					pw.println(name);
					flag = 0;
				} else {
					System.out.println("Record found");
					System.out.println("Enter updated marks:");
					String up_mark = sc.next();
					pw.println(line[0] + "\t" + line[1] + "\t" + up_mark+ "\t" + line[3]);
					flag = 1;
				}
			}
			file1.close();
			pw.close();

			File delName = new File("Student.txt");
			File oldName = new File("StudentDb.txt");
			File newName = new File("Student.txt");
			if (delName.delete())
				System.out.println("record updated successfully");
			else
				System.out.println("Error");
			if (oldName.renameTo(newName))
				System.out.println("Renamed successfully");
			else
				System.out.println("Error");
			
		} catch (FileNotFoundException e) {
			System.out.println("\nERROR : File not Found !!!");
		}catch (IOException e) {
			System.out.println(e);
		}		
	}
	
	void delete() {
		File file = new File("Student.txt");
		if (file.delete()) {
			System.out.println(file.getName() + " is deleted!");
		} else {
			System.out.println("Delete failed: File didn't delete");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		int x = 1;
		int ch;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n\n1. Create Database" + "\n2. Display Database" + "\n3. Search Records" + "\n4. Modify Records" + "\n5. Clear Records" + "\n6. Delete file" + "\n7. Exit");
			System.out.println("Enter Choice:: ");
			ch = sc.nextInt();
			
			switch(ch) {
		
				
			case 1:
				s.create();
//				s.write();
				break;
				
			case 2:
				s.display();
				break;
				
			case 3:
				s.search();
				break;
				
			case 4:
				s.modify();
				break;
				
			case 5:
				s.clearRecords();
				break;
				
			case 6:
				s.delete();
				break;
				
			case 7:
				x = 1;
				break;
				
			default:
				System.out.println("Invalid choice!");
				
			}
		}while(x==1);
	}

}

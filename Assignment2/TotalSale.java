import java.util.Scanner;

class Publication{//Parent class
	
	String Title;	//Title of book
	float price;	//Price 
	int copies=0;	//Number of copies
	String author; //Author of the book
	
	void input() { //Method to input details of the book
		Scanner sc = new Scanner(System.in);
		System.out.println("Title:");
	    Title=sc.nextLine();
	    //sc.nextLine();
	    System.out.println("Price:");
	    price=sc.nextFloat();
	}
	public String getTitle() {//Get title
		return Title;
	}
	public float getPrice() {//Get price
		return price;
	}
	public int getCopies() {//Get copies
		return copies;
	}
	public void saleCopy() {//MEthod for selling
		System.out.println("Total price:: " + getCopies()*getPrice());
	}
	public boolean search(String key)//Searching the book to be sold
	  {
	    if(key.equalsIgnoreCase(Title))//IF found
	      return true;//return true
	    return false;
	  }
	
}

class Book_class extends Publication{//Child class Book
	
	int orderCopy; //Order copy of the book
	
	String getAuthor() {
		return author;
	}
	void input() { //Overridden function input
		super.input(); //Calling the super function
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Author name:");
		author = sc.nextLine();//Input author name
		
	}
	void orderCopies() { //Order books
		
		System.out.println("Enter the number of copies: ");
		Scanner sc = new Scanner(System.in);
		orderCopy = sc.nextInt();
		copies = copies + orderCopy;//Add to copies
	}
	 public void saleCopy(int n) //Overloaded method
	 {
	    int x=getCopies();
	    if(x>=n)//If stock is greater than the ordered number
	    {
	      copies = x-n; //Decrease the copies
	      System.out.println("Total sale price:"+(n*getPrice()));//Calculate price
	    }
	    else if(x==0) {//If zero copies are present
	    	System.out.println("Sorry no copies available");
	    }
	    else
	    {//If the ordered number is greater than the stock
	      System.out.println("Only "+getCopies()+" are avaliable");
	    }
	 }
	 public void display()//Display function
	  {
	    System.out.println("Title:			"+getTitle());
	    System.out.println("Author:			"+author);
	    System.out.println("Price:			"+getPrice());
	    System.out.println("Available copies:	"+getCopies());
	  }
	
	
}

class Magazine extends Publication{ //Child class Magazine
	int orderQty; //Order magazines
	String currIssue;
	
	void input() {//Overridden function
		super.input();//calling the parent function
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	    System.out.println("Current Issue:");//Input the current issue to be ordered
	    currIssue=sc.nextLine();
	}
	void recieveIssue() {//Order magazines
		System.out.println("Enter copies: ");
		Scanner sc = new Scanner(System.in);
		orderQty = sc.nextInt();//Input no of copies required
		copies = copies+orderQty;//Add to the number of copies
	}
	public void saleCopy(int n) {//Overloaded method
		int x=getCopies();
	    if(x>=n)//If stock is greater than the ordered number
	    {
	    	copies = x-n;
	        System.out.println("Total sale price:"+(n*getPrice()));
	    }
	    else if(x==0) {//If zero copies are present
	    	System.out.println("Sorry no copies available");
	    }
	    else//If the ordered number is greater than the stock
	    {
	        System.out.println("Only "+getCopies()+" are avaliable");
	    }
	}
	
	public void display()//Display function
	  {
	    System.out.println("\nTitle:			"+getTitle());
	    System.out.println("Current Issue:		"+currIssue);
	    System.out.println("Price:			"+getPrice());
	    System.out.println("Available copies:	"+getCopies());
	  }
	
	
	
	
}

public class TotalSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Book_class b[] = new Book_class[15];//Book class array of object
		Magazine m[] = new Magazine[15];//Magazine class array of object
		
		int x=1;
		int ch;
		int books_no, mag_no;
		String key;
		boolean found;
		
		do {
			System.out.println("Enter the number of books:: ");
			books_no = s.nextInt();	//Get the total types of books
			if(books_no>0) {
				x=0;
			}
			else {
				System.out.println("Wrong number entered");
			}
		}while(x==1);
		x=1;
		do {
			System.out.println("Enter the number of Magazines:: ");
			mag_no = s.nextInt();	//Get the total types of magazines
			if(mag_no>0) {
				x=0;
			}
			else {
				System.out.println("Wrong number entered");
			}
		}while(x==1);
		
		x=1;
			
		do {
			//Menu driven
			System.out.println("\n\t\t===========MENU===========");
			System.out.println("\n\t\t1. Order Books\n\t\t2. Order Magazines\n\t\t3. Sell Books"
					+ "\n\t\t4. Sell Magazine\n\t\t5. Display Books\n\t\t6. Display Magazines\n\t\t7. Exit");
			System.out.println("\n\t\t==========================");
			ch = s.nextInt();//Enter choice
			
			switch(ch) {
			case 1://Order books
				
				for(int i=0; i<books_no; i++) {
					System.out.println("---Enter details for book no "+ (i+1) + "---");
					b[i] = new Book_class();//Call the constructor
					b[i].input();//Input details
					b[i].orderCopies();//Order copies
				}
				break;
				
			case 2://Order Magazines
				
				for(int i=0; i<mag_no; i++) {
					System.out.println("---Enter details for magazine no "+ (i+1) + "---");
					m[i] = new Magazine();//Call the constructor
					m[i].input();//Input details
					m[i].recieveIssue();//Order copies
				}
				break;
				
			case 3://Sell books
				s.nextLine();
		        System.out.println("Enter title of book to be sold:");
		        key=s.nextLine();//Take the title of the book that has to be sold
		        found=false;
		        for(int i=0;i<books_no;i++)
		        {
		          found=b[i].search(key);//Search if the book is present
		          if(found)//if found 
		          {
		            //s.nextLine();
		            System.out.println("Enter number of copies to be sold:");
		            int n=s.nextInt();//Input number of copies 
		            b[i].saleCopy(n);//Sell the book
		            break;
		          }
		          
		        }
		        break;
		        
			case 4://Sell Magazine
				s.nextLine();
		        System.out.println("Enter title of magazine to be sold:");
		        key=s.nextLine();//Take the title of the Magazine that has to be sold
		        found=false;
		        for(int i=0;i<mag_no;i++)//Search if the Magazine is present
		        {
		          found=m[i].search(key);
		          if(found)//if found
		          {
		            //s.nextLine();
		            System.out.println("Enter number of copies:");
		            int n=s.nextInt();//Input number of copies 
		            m[i].saleCopy(n);//Sell the Magazine
		            break;
		          }
		        }
		        break;
		        
			case 5://Display all the books
				System.out.println("\n---Books Display--- ");
				for(int i=0; i<books_no; i++) {
					System.out.println("\n-----Details of book "+(i+1)+"-----");
					b[i].display();
					System.out.println("\n---------------------------\n");
				}
				break;
				
			case 6://Display all  the magazines
				System.out.println("\n-----Magazines Display----- ");
				for(int i=0; i<mag_no; i++) {
					System.out.println("\n---Details of Magazine "+(i+1)+"---");
					m[i].display();
					System.out.println("\n---------------------------\n");
				}
				break;
				
			case 7://Exit
				int z;
				System.out.println("----Press 0 to exit OR 1 to continue----");
				z = s.nextInt();
				if(z==1)
					x = 0;
				break;
				
			default://Default case
				System.out.println("Wrong choice");
			}
			
			
		}while(x==1);
		

	}

}

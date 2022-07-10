import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Menu mn = new Menu();
        
     // variables
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        char choice = '\0';
        
        char input;
        boolean menuYes = false;
        
        System.out.println("*************************************");
		System.out.println("*\tWelcome to Online Street Food!\t*");
		System.out.println("*************************************");
		System.out.println("\t\t\tMENU");
		
		while(true){
    		System.out.println("Do you like to see the menu? y/n");
    		input = in.next().charAt(0);
    		input =  Character.toLowerCase(input);
    		
        	if(input=='y'){
        	    menuYes=true;
        	    break;
        	}
        	else if(input=='n'){
        	    System.out.println("Call me again for menu :D");
        	    break;
        	}
        	else{
        	    System.out.print("invalid input\n");
        	}
		}
		if(menuYes){
		    mn.menu();
		}
		
		List<costumerPicks> product = new ArrayList<costumerPicks>();

		// if user input 'n' the system breaks
		if(!(input=='n')) {
			
		    do {
		      // read input values
		      System.out.println("Enter product details,");
		      System.out.println("Name: ");
		      productName = in.next();
		      System.out.print("Quantity: ");
		      quantity = in.nextInt();
		      System.out.print("Price (per item): ");
		      price = in.nextDouble();
	
		      // calculate total price for that product
		      totalPrice = price * quantity;
	
		      // calculate overall price
		      overAllPrice += totalPrice;
	
		      // create Product class object and add it to the list
		      product.add( new costumerPicks(
		          productName, quantity, price, totalPrice) );
	
		      // ask for continue?
		      System.out.print("Want to add more item? (y or n): ");
		      choice = in.next().charAt(0);
	
		      // read remaining characters, don't store (no use)
		      in.nextLine();
		      
		    } while (choice == 'y' || choice == 'Y');
	
		    // display all product with its properties
		    costumerPicks.displayFormat();
		    for (costumerPicks p : product) {
		      p.display();
		    }
		    
		    DecimalFormat ft = new DecimalFormat("####"); 
		    ft = new DecimalFormat("###,###.##");
		    // overall price
			System.out.println("\nTotal Price = " + ft.format(overAllPrice));
	
		    // close Scanner
		    in.close();
		  }
    }
}

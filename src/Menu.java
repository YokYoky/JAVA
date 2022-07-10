import java.util.Scanner;
import java.util.Currency;

class Menu{
	char input;
	boolean pickYes = false;
	Scanner in = new Scanner(System.in);
	
	// getting currency
	private String currencyCode = "USD";
	Currency currency = Currency.getInstance(currencyCode);
	private String symbol = currency.getSymbol();
	
    public void menu(){
    	// displaying menu / product
    	// print format 
	     System.out.printf("(1) %s55 Tusok-Tusok\n", symbol);
	     System.out.printf("(2) %s25.50 Fried Food\n", symbol);
	     System.out.printf("(3) %s12.25 Drinks\n", symbol);
		 System.out.println("(n) Exit ");
		 
		 // asking the user/s to continue
		 while(true){
	    		System.out.println("Would you like to order? y/n");
	    		input = in.next().charAt(0);
	    		input =  Character.toLowerCase(input);
	    		
	    		// if user input y/Y continue and break to get out of loop
	        	if(input=='y'){
	        	    break;
	        	}
	        	
	        	// if user input n/N the system exit
	        	else if(input=='n'){
	        	    System.out.println("Call me again if you want to order :D");
	        	    System.exit(1);
	        	}
	        	// if user !n || !y
	        	else{
	        	    System.out.print("invalid input\n");
	        	}
			}
    }
}
class costumerPicks{
	
	// this code i got from googling
	// https://www.knowprogram.com/java/java-program-for-shopping-bill/
	//properties
		private String pname;
		private int qty;
		private double price;
		private double totalPrice;
				
		// constructor
		costumerPicks(String pname, int qty, double price, double totalPrice){
			this.pname = pname;
			this.qty = qty;
			this.price = price;
			this.totalPrice = totalPrice;
		}
		// getter methods
		public String getPname() {
			return pname;
			}
		public int getQty() {
		    return qty;
		    }
		public double getPrice() {
		    return price;
		    }
		public double getTotalPrice() {
		    return totalPrice;
		    }
	   	 // displayFormat
		public static void displayFormat() {
		    System.out.print(
		    		"\nName      Quantity    Price   Total Price\n");
       	 }

		// display
		public void display() {
		    System.out.format("%-9s %8d %10.2f %10.2f\n", 
		    	pname, qty, price, totalPrice);
		 }
				}


// my code before googling
//
//	void menuPicks() {
//		
//
//		
//	    int total=0, count=0;
//	    boolean totalYes = false;
//	    
//		while(!totalYes) {
//	        System.out.println("(A) Tusok Tusok");
//	    	System.out.println("(B) Fried Food");
//	    	System.out.println("(C) Drinks");
//		    System.out.println("(D) Go Back");
//		    System.out.println("(E) Total");
//		    
//		    char p = in.next().charAt(0);
//		    p = Character.toLowerCase(p);   
//		    
//		    try {
//		    	if(!(p == 'a' || p == 'b' || p == 'c' || p == 'e')) {
//		    		System.out.println("Invalid input; enter correct character\n");
//		    		continue;
//		    	}
//		    }
//		    catch (InputMismatchException e) {
//		    	System.out.println("invalid input; enter correct character\n");
//		    	continue;
//		    }
//		    
//		    
//		    if(p == 'a') {
//				System.out.println(A + " A");
//			}
//		    else if(p == 'b') {
//				System.out.println(B + " B");
//			}
//		    else if(p == 'c') {
//				System.out.println(C + " C");
//			}
//		    else if(p == 'd') {
//		    	menu();
//		    }
//		    else if(p == 'e') {
//		    	totalYes = true;
//
//		    }
//		    else {
//		    	System.out.println("invalid input; enter correct character\n");
//		    }
//		    total = total + p;
//		}
////		total += p;
//		System.out.println(total);
//	}



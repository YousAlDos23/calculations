package calculations;
import java.util.Scanner;

public class calculations {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  
		 System.out.println("For sum  enter 1");
		 System.out.println("For sub  enter 2");
		 System.out.println("For div  enter 3");
		 System.out.println("For mul  enter 4");
		 
		 System.out.println("Enter your choice");
		 
		 int oper = input.nextInt();
		 oper(oper);
		       
		  }
	public static void oper(int x) {
		
		Scanner input = new Scanner(System.in);
		
		switch (x) {
		
		case 1:
	        System.out.println("Enter number one");
			    int int1 = input.nextInt();
	    
	        System.out.println("Enter number two");
	            int int2 = input.nextInt();
	            
			math(int1 , int2);
		    	break;
			
		
		case 2:
		   System.out.println("Enter number one");
	           int int3 = input.nextInt();
	    
	       System.out.println("Enter number two");
	           double dou1 = input.nextDouble();
	           
			math(int3 , dou1);
			    break;
		
		
		case 3:
		   System.out.println("Enter number one");
		       double dou2 = input.nextInt();
		    
		   System.out.println("Enter number two");
		       double dou3 = input.nextInt();
		       
		   math(dou2 , dou3);
				break;
		
		case 4:
		   System.out.println("Enter number one");
	          double dou4 = input.nextInt();
	    
	       System.out.println("Enter number two");
	          int int4 = input.nextInt();
	          
			math(dou4 , int4);
		}	
} 
    
          public static void math(int x , int y) {
  	
			  int sum = x + y;
			  System.out.println("The sum of " + x + " and " + y + " is: " + sum);
		  }
		  
		  public static void math(int x , double y) {
			  
			  double sub = x - y;
			  System.out.println("The sub of " + x + " and " + y + " is: " + sub);
		  
		}
		  public static double math(double x , double y) {
			  
			  double div = x / y;
			  System.out.println("The div of " + x + " and " + y + " is: " + div);
			  return div;
		  }
		  
		  public static double math(double x , int y) {
			  
			  double mul = x * y;
			  System.out.println("The mul of " + x +  " and " + y + " is: " + mul);
			  return mul;
		  }
	}
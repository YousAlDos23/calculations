package calculations;
import java.util.Scanner;

public class calculations {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  
		    System.out.println("Enter number one");
		    double num1 = input.nextDouble();
		    
		    System.out.println("Enter number two");
		    double num2 = input.nextDouble();
		    sum(num1 , num2);
		    sub(num1 , num2);
		    div(num1 , num2);
		    mul(num1 , num2);
		    
		  }
		  
		  public static void sum(double x , double y) {
			  double sum = x + y;
			  System.out.println("The sum of " + " and " + y + " is: " + sum);
		  }
		  
		  public static void sub(double x , double y) {
			  double sub = x - y;
			  System.out.println("The sub of " + " and " + y + " is: " + sub);
		  
		  
		}
		  public static double div(double x , double y) {
			  double div = x / y;
			  System.out.println("The div of " + " and " + y + " is: " + div);
			  return div;
		  }
		  
		  public static void mul(double x , double y) {
			  double mul = x * y;
			  System.out.println("The mul of " + " and " + y + " is: " + mul);
		  }
	}
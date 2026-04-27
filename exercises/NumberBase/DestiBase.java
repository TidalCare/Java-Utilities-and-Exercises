package NumberBase;

import java.util.Scanner;
public class DestiBase {
	 public static void main(String []args) throws NumberFormatException {
		 try {
			 	System.out.println("Input Source Number Base (2-36): ");
		        Scanner sc = new Scanner(System.in);
		        int sourceBase = sc.nextInt();
			 	System.out.println("Input Number String: ");
		        String sourceString = sc.next();
			 	System.out.println("Input Destination Number Base (2-36): ");
		        int destiBase = sc.nextInt();
		        try 
		        {
		        	long decimalValue = Long.parseLong(sourceString, sourceBase);
		        	String result = Long.toString(decimalValue, destiBase);
		        	System.out.println("\nResult: " + result.toUpperCase());
		        } catch(IllegalArgumentException e) {
		        	System.err.println("Error: '" + sourceString + "' is not a valid number for base " + sourceBase);
		        }
			 
		 }catch (Exception e) {
			 System.err.println("An unexpected error occurred: " + e.getMessage());
		 }

	    }
}
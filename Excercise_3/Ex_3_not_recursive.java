import java.util.Scanner;

public class  Ex_3_not_recursive

{
	    
	    public static void main(String[] args)
	    {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter a number");
	        int n=scan.nextInt();
	        if (n==1) {
	        	n = n-1;
	        	
	        	System.out.println ( n);
	        }
	        
	        else if  ((n / 2) * 2 == n) {
	        	
	        System.out.println(n/2);
	        
	        }
	        
	        else {
	        	
	        	System.out.println(Math.round(n)/2);
	        }
	    }
	    

    }
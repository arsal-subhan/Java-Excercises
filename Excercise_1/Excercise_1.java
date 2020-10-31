
public class Excercise_1 
{
	
	
	// Method 
	static int maxPrefix(String S , String T)
 { 
		
int i ;
int j = 0;


 for ( i = 1; i < S.length() && j < T.length(); i++) 
 
   {
    if(T.charAt(j)!=S.charAt(i)) 
        {
    	
    	
    	}
    	
  
     else if (T.charAt(j)==S.charAt(i) ) 
     
           {
    	
    	break;
    
    	
            }
    
    
   }
return i +1 ;

 }
    
   

	

public static void main(String args[]) 

   { 
	
	String S = "abracadabra"; 
	String T = "da"; 
	
System.out.println(maxPrefix(S,T)); 


   } 
} 
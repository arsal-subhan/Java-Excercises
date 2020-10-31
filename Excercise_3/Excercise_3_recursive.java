
public class Excercise_3_recursive 
{

	
    int DoSomething(int n)
   {
   if (n == 1) 
       
       return n - 1;
   else
       {
           
       if ((n / 2) * 2 == n)
           
          {
           
   return 1 + DoSomething(n-1); 
   
           
          }
   
       else
     {
   
           return DoSomething(n - 1);
     } 
       
        }
   
   }
   
   
   
   public static void main (String []args) 
   {
       
       
    Excercise_3_recursive k = new Excercise_3_recursive();
       

       System.out.println(k.DoSomething(10));
   }
}


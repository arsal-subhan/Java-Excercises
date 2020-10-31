import java.util.Scanner; 
import java.util.Arrays;

public class Pseudocode 

{ 
    public static void main(String[] args) 
    {

        boolean istrue=true; int k=0; int d=0;

            int a=args.length-1; while(k<a) 
        {

                if(Integer.parseInt(args[k])==Integer.parseInt(args[a])) 
            {

                    istrue=true;

                    d=Integer.parseInt(args[k]);

                    break;

            } 

                    else
                    { 

                istrue=false;

                    } 

                k++;

         }

                if(istrue==true) 
             { 

                System.out.println(d); 
        
             } 

                if(istrue==false) 

                {

                System.out.print("k+1: "); 
                System.out.println(a+2);

                 }

    } 

}
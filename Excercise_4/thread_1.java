public class thread_1  implements Runnable 
{
	public int a = 0;
 
 
	public void run() 	
	{
	
		synchronized(this) 
		{
	
			for(int i = 0; i < 1000000; i++) 
			{
									a = a + 1; 
	
		
			}
	
		}
		
	}
	
	
			public static void main(String[] args) throws Exception 
			{
	
	    
	    	   thread_1 value = new thread_1();
	    	   Thread t1 = new Thread(value);
	    	   Thread t2 = new Thread(value);
	    	   t1.start();
	    	   t2.start();
	    	   t1.join();
	    	   t2.join();
	    
	    	
	    	   
	    	   System.out.println("Expected a = 2000000, " + " but a = " + value.a);
	       }
	       
}
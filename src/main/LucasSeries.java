package main;

public class LucasSeries implements IOperation  {

	  public void notifyOperation(int input) {
	        System.out.println("The numbered entered for lucas series is " + input + " is " + operate(input) + " ");
	    }

	    @Override
	    public int operate(int n) {
	    	if(n==1)
	    		return 2;
	    	if(n==2)
	    		return 1;
	   
	         // generating number 
	         for (int i = 2; i <= n; i++)  
	         {}
	           
	         return operate(n-1)+operate(n-2); 
	        
	    
	    }}

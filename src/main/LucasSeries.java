package main;

public class LucasSeries extends ThreadedOperation  {

	  public void notifyOperation() {
	        System.out.println("The numbered entered for lucas series is " + subject.getInput() + " is " + operate() + " ");
	    }

	    @Override
	    public int operate() {
	  		int n = subject.getInput();
	    	if(n==1)
	    		return 2;
	    	if(n==2)
	    		return 1;
	   
	         // generating number 
	         for (int i = 2; i <= n; i++)  
	         {}
	           
	         return operate()+operate();
	    
	    }}

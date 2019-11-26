public class Fibonacci extends ThreadedOperation {
	
		@Override
	public void notifyOperation() {
		System.out.println(" The Fibonacci of  " + subject.getInput() + " is " + operate() + ".");
	}

        @Override
	public int operate() {
		int n = subject.getInput(); 
        int a = 0 , b = 1 , c;
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    } 
      
    }   
  



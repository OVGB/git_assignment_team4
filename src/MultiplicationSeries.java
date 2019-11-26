
public class MultiplicationSeries extends ThreadedOperation {
    public void notifyOperation(){
        System.out.println("the number you entered for multiplication series is " + subject.getInput() + "is" + operate()+ " ");
    }
    @Override
    public int operate()
    {
        int n=subject.getInput();
        int Mul=1;
        for(int i=1;i<=n;i++ )
        {
            Mul=Mul*i;
            
        }
        return Mul;
        
        
    }
    
}

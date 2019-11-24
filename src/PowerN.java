public class PowerN extends ThreadedOperation {

    @Override
    public void notifyOperation()
    {
        System.out.println("The result for 2 Power "+subject.getInput()+"is "+operate()+".");
    }

    @Override
    public int operate() {

        return (int) Math.pow(2,subject.getInput());
    }



}

public class SphereArea extends ThreadedOperation  {

    private final double pi = 3.14 ;

    @Override
    public void notifyOperation() {
        System.out.println("Surface Area of the sphere with Radius  " + subject.getInput() + " is " + operate() + ".");
    }
    @Override
    public int operate () { return (int ) (4 * pi * subject.getInput() * subject.getInput() );
    }

}

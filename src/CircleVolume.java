public class CircleVolume extends ThreadedOperation {
    private final double pi = 3.14;
    @Override
    public void notifyOperation() {
        System.out.println("The Circle volume with a radius " + subject.getInput() + " is " + operate() + ".");
    }
    @Override
    public int operate() {
        return (int)((4/3) * pi * subject.getInput() * subject.getInput() * subject.getInput());
    }
}
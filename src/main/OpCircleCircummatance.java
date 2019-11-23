package main;

public class OpCircleCircummatance extends ThreadedOperation {

    private final double pi = 3.14;

    @Override
    public void notifyOperation() {
        System.out.println("The Circle circumference with a radius " + subject.getInput() + " is " + operate() + ".");
    }

    @Override
    public int operate() {
        return (int)(2 * pi * subject.getInput());
    }
}

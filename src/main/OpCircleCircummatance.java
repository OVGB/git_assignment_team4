package main;

public class OpCircleCircummatance implements IOperation {

    private final double pi = 3.14;

    @Override
    public void notifyOperation(int input) {
        System.out.println("The Circle circumference with a radius " + input + " is " + operate(input) + ".");
    }

    @Override
    public int operate(int input) {
        return (int)(2 * pi * input);
    }
}

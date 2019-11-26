
public class CircleArea extends ThreadedOperation {
	
	private final double pi = 3.14;

	@Override
	public void notifyOperation() {
		System.out.println("The Circle area with a radius " + subject.getInput() + " is " + operate() + ".");
	}

	@Override
	public int operate() {
		return (int)(pi * subject.getInput() * subject.getInput());
	}

}

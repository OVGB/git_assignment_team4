public class LucasSeries extends ThreadedOperation  {


	public void notifyOperation() {
		System.out.println("The numbered entered for lucas series is " + subject.getInput() + " is " + operate() + " ");
	}

	@Override
	public int operate() {
		int n = subject.getInput();
		int a = 2, b = 1, c, i;

		if (n == 0)
			return a;

		for (i = 2; i <= n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		return b;

	}
}

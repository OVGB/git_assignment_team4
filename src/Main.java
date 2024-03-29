import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true) {
            ThreadedOperation[] ops = {
                    new OpCircleCircummatance(),
                    new LucasSeries(),
                    new Fibonacci(),
                    new PowerN(),
                    new SphereArea(),
                    new CircleArea(),
                    new MultiplicationSeries()
            };
            Subject subject = new Subject();
            int input;
            Scanner scn = new Scanner(System.in);

            for (ThreadedOperation op : ops) {
                subject.addOperation(op);
                op.setSubject(subject);
            }

            input = scn.nextInt();
            if (input == 0)             //Enter 0 to close program
                break;
            subject.setInput(input);

        }

    }
}

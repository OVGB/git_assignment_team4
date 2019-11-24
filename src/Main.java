import java.util.Scanner;

public class Main {

    private static ThreadedOperation[] ops = {
        new OpCircleCircummatance(),
        new LucasSeries(),
            new PowerN()
    };

    public static void main(String[] args) {

        while(true) {
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

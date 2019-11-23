package main;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    private static IOperation[] ops = {

    };

    public static void main(String[] args) {

        Subject subject = new Subject();
        int input;
        Scanner scn = new Scanner(System.in);

        for(IOperation op : ops){
            subject.addOperation(op);
        }

        input = scn.nextInt();
        subject.triggerEvent(input);
    }
}

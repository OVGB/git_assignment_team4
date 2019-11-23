package main;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int input;

    private List<ThreadedOperation>  operations;

    public Subject() { this.operations = new ArrayList<>(); }

    public void addOperation(ThreadedOperation op){
        this.operations.add(op);
    }

    public List<ThreadedOperation> getOperations(){
        return this.operations;
    }

    public void triggerEvent() {
        for(ThreadedOperation op : this.operations)
            op.start();
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }
}

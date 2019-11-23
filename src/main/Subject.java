package main;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<IOperation>  operations;

    public Subject() { this.operations = new ArrayList<>(); }

    public void addOperation(IOperation op){
        this.operations.add(op);
    }

    public List<IOperation> getOperations(){
        return this.operations;
    }

    public void triggerEvent(int input) {
        for(IOperation op : this.operations)
            op.notifyOperation(input);
    }


}

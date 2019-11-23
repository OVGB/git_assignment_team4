package main;

public abstract class ThreadedOperation extends Thread implements IOperation {
    Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void run() {
        notifyOperation();
    }
}

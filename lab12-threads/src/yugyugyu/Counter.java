package yugyugyu;

public class Counter {
    int counter=0;

    public int getCounter() {
        return counter;
    }

    synchronized void increment(){
        counter++;
    }
}

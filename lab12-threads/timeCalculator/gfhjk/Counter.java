package gfhjk;

public class Counter {
    long counter=0;

    public long getCounter() {
        return counter;
    }

    synchronized void increment(){
        counter++;
    }
}

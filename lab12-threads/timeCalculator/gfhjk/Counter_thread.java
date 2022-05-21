package gfhjk;

import gfhjk.Counter;

public class Counter_thread extends Thread {
    Counter counter;
    boolean stop = false;

    public void stopThread(){
        this.stop = true;
    }

    public Counter_thread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
//        for(long i=0; i<25000000000L; i++) {
//            counter.increment();
//        }
        while (counter.getCounter()<1000000000 && !stop){
            counter.increment();
        }
    }
}

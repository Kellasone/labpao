package gfhjk;

import gfhjk.Counter;
import gfhjk.Counter_thread;

public class Main {
    public static void main(String[] args) {

        Counter c= new Counter();
        Counter_thread c1 = new Counter_thread(c);
//        Counter_thread c2 = new Counter_thread(c);
//
//        long start = System.currentTimeMillis();
//
        c1.start();
//        c2.start();
//
//        try {
//            c1.join();
////            c2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);
//        System.out.println(c.getCounter());
//
//        //50000000000L
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        c1.interrupt();

        // Lasam asa

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.getCounter());

//        405056764 ; 405633169 ; 406595620
//        150273438 ; 151475398
//        405000130 ; 406719252

    }
}

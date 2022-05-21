package yugyugyu;

import gfhjk.Counter;
import gfhjk.Counter_thread;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        yugyugyu.Test_thread t1 = new yugyugyu.Test_thread(1);
//        yugyugyu.Test_runnable t2 = new yugyugyu.Test_runnable(2);
//
//        t1.start();
//        Thread th = new Thread(t2);
//        th.start();
//
//        try {
//            t1.join();
//            th.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //
//        for (int i=0; i<100; i++){
//            System.out.print(3+" ");
//        }

//        Counter c = new Counter();
//        Counter_thread c1 = new Counter_thread(c);
//        Counter_thread c2 = new Counter_thread(c);
//
//        c1.start();
//        c2.start();
//
//        try {
//            c1.join();
//            c2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println(c.getCounter());


        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.stream().distinct().forEach(System.out::println);
    }
}

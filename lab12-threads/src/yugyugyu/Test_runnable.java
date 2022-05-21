package yugyugyu;

public class Test_runnable implements Runnable {

    int ceva;

    public Test_runnable(int ceva) {
        this.ceva = ceva;
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            System.out.print(ceva+" ");
        }
    }
}

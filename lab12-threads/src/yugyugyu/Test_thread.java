package yugyugyu;

public class Test_thread extends Thread {

    int ceva;

    public Test_thread(int ceva) {
        this.ceva = ceva;
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            System.out.print(ceva+" ");
        }
    }
}

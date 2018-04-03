package tba.bingfa;

/**
 * Created by dongzhang on 6/2/17.
 */
public class Thread_{
    public static void main(String[] args) {
        MutliThread m1 = new MutliThread("mac 1");
        m1.start();
        m1.start();
        m1.start();
    }
}

class MutliThread extends Thread{
    private int ticket=10;
    private String name;
    public MutliThread(String name){
        super(name);
    }

    @Override
    public void run() {
        while (ticket>0){
            System.out.println(ticket-- + " is selled by " + Thread.currentThread());
        }
    }
}

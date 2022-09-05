class Pair {
    private int a, b;
    public Pair() {
        a = 0;
        b = 0;
    }

    // Answers start
    public synchronized int sum()
    {
      return(a+b);
    }
    public synchronized void inc()
    {
        a++;
        b++;
    }
}

// ends

public class PairWorker extends Thread {
    public final int COUNT = 1000;
    private Pair pair;
    public PairWorker(Pair pair) {
        this.pair = pair;
    }
    public void run() {
        for(int i=0; i<COUNT; i++) {
            pair.inc();
        }
    }

    public static void main(String args[]) {
        Pair pair = new Pair();
        PairWorker w1 = new PairWorker(pair);
        PairWorker w2 = new PairWorker(pair);
        PairWorker w3 = new PairWorker(pair);
        w1.start();
        w2.start();
        w3.start();
        try{
            w1.join();
            w2.join();
            w3.join();
        }
        catch(InterruptedException ignored) {}
        System.out.println("Final sum:" + pair.sum());
    }
}
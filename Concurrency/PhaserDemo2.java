import java.util.concurrent.*;

class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount){
        super(parties);
        numPhases = phaseCount - 1;
    }

    protected boolean onAdvance(int p, int regParties){
        System.out.println("Phase " + p + "completed.\n");
        if (p == numPhases || regParties == 0) return true;
        return false;
    }
}

class PhaserDemo2{
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);
        System.out.println("Starting \n");

        new Thread(new MyThread(phsr, "A")).start();
        new Thread(new MyThread(phsr, "B")).start();
        new Thread(new MyThread(phsr, "C")).start();

        while (!phsr.isTerminated()){
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("The Phaser is Terminated");
    }
}

class MyThread implements Runnable {
    Phaser phsr;
    String name;

    MyThread(Phaser p, String n){
        phsr = p;
        name = n;
        phsr.register();

    }

    public void run() {
        while (!phsr.isTerminated()){
            System.out.println("Thread " + name + " Beginning Phase" + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
import java.util.concurrent.*;

class PhaserDemo{
    public static void main(String[] args) {
        Phaser p = new Phaser(1);
        int curPhase;

        System.out.println("Starting ");
        new Thread(new MyThread(p, "A")).start();
        new Thread(new MyThread(p, "B")).start();
        new Thread(new MyThread(p, "C")).start();

        curPhase = p.getPhase();
        p.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete");

        curPhase = p.getPhase();
        p.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete");

        curPhase = p.getPhase();
        p.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete");

        p.arriveAndDeregister();
        if (p.isTerminated()){
            System.out.println("The Phaser is terminated");
        }
    }
}

class MyThread implements Runnable {
    Phaser psr;
    String name;

    MyThread(Phaser p, String s){
        psr = p;
        name = s;
        psr.register();
    }

    public void run(){
        System.out.println("Thread " + name + " Beginning Phase one");
        psr.arriveAndAwaitAdvance();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Thread " + name + " Beginning Phase Two");
        psr.arriveAndAwaitAdvance();

        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread " + name + "Beginning Phase Three");
        psr.arriveAndDeregister();

    }

}
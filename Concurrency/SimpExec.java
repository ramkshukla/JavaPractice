import java.util.concurrent.*;
class SimpExec{
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService ex = Executors.newFixedThreadPool(2);

        System.out.println("Starting");

        ex.execute(new MyThread(cdl, "A"));
        ex.execute(new MyThread(cdl2, "B"));
        ex.execute(new MyThread(cdl3, "C"));
        ex.execute(new MyThread(cdl4, "D"));

        try{
            cdl.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        }catch (InterruptedException e){
            System.out.println(e);
        }

        ex.shutdown();
        System.out.println("Done");

    }
}


class MyThread implements Runnable{
    String name;
    CountDownLatch latch;

    MyThread(CountDownLatch c, String n){
        latch = c;
        name = n;
    }

    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
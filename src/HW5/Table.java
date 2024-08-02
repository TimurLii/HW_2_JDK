package HW5;

import java.util.List;

import java.util.concurrent.CountDownLatch;

public class Table extends Thread {
    private final CountDownLatch countPhilosopher;
    private List<Philosopher> philosopherList;




    public Table(List<Philosopher> philosopherList) {
        this.philosopherList = philosopherList;
        this.countPhilosopher = new CountDownLatch(philosopherList.size());

    }

    public void run() {
        for(Philosopher philosopher : philosopherList){
            philosopher.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }

}

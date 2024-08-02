package HW5;

import java.util.concurrent.CountDownLatch;

public class Philosopher extends Thread {
    private CountDownLatch countEat = new CountDownLatch(3);
    private int id;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        System.out.printf("Философ %s размышляет \n ", this.id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        eat();

    }


    public void eat() {
        while (countEat.getCount() > 0) {
            if (!leftFork.isUses() && !rightFork.isUses()) {
                leftFork.setUses(true);
                rightFork.setUses(true);
                countEat.countDown();
                System.out.printf("Философ %d кушает  \n ", this.id);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            } else {
                System.out.printf("Философ %s размышляет \n ", this.id);
                leftFork.setUses(false);
                rightFork.setUses(false);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public Fork getLeftFork() {
        return leftFork;
    }

    public Fork getRightFork() {
        return rightFork;
    }


    @Override
    public String toString() {
        return "Philosopher{" +
                "id=" + id +
                ", leftFork=" + leftFork +
                ", rightFork=" + rightFork +
                '}' + "\n";
    }
}

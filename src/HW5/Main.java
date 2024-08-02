package HW5;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;


public class Main {
    public static void main(String[] args) {
        int countPhilosopher = 3;

        Fork[] forkList = getForks(countPhilosopher);

        List<Philosopher> philosopherList = getPhilosopherList(forkList);


        Table table = new Table(philosopherList);

        table.start();


    }




    private static @NotNull List<Philosopher> getPhilosopherList(Fork[] forkList) {
        List<Philosopher> philosopherList = new ArrayList<>();
        Fork leftFork;
        Fork rightFork;
        for (int i = 0; i < forkList.length; i++) {
            if (i == 0) {
                leftFork = forkList[forkList.length - 1];
            } else {
                leftFork = forkList[i - 1];
            }
            rightFork = forkList[i];
            philosopherList.add(new Philosopher(i, leftFork, rightFork));

        }
        return philosopherList;
    }

    private static Fork @NotNull [] getForks(int count ) {
        Fork[] forkList = new Fork[count];
        for (int i = 0; i < count; i++) {
            forkList[i] = new Fork(i);
        }
        return forkList;
    }
}

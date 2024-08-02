package Sem5.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Main {
    private static int COUNT_RUNNERS = 3;

    public static void main(String[] args) {
        CountDownLatch readySignal = new CountDownLatch(COUNT_RUNNERS);
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch finishSignal = new CountDownLatch(COUNT_RUNNERS);


        List<Runner> lst = new ArrayList<>(Arrays.asList(
                new Runner("Jon", readySignal,startSignal,finishSignal),
                new Runner("Timur", readySignal,startSignal,finishSignal),
                new Runner("Don", readySignal,startSignal,finishSignal)
        ));

        new Thread(new Race(readySignal,startSignal,finishSignal)).start();
        for(Runner runner: lst){
            new Thread(runner).start();
        }
    }
}

package Sem5.Task1;

public class Main1 {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB(threadA);

        Thread thread1 = new Thread(threadA);
        Thread thread2 = new Thread(threadB);

        thread1.start();
        thread2.start();

        try {
            thread2.join();
            thread2.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

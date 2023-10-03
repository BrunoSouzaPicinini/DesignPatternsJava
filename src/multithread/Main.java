package multithread;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            var multithreadThing = new MultithreadThingWithExtension(i);
            multithreadThing.start();
        }

        for (int i = 3; i < 5; i++) {
            var multithreadThing = new MultithreadThingImplRunnable(i);
            var thread = new Thread(multithreadThing);
            thread.start();
        }

        var threadList = new ArrayList<Thread>();

        for (int i = 5; i < 8; i++) {
            final int finalI = i;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException exception) {
                System.out.println("Thread was interrupted");
            }
            threadList.add(new Thread(() -> System.out.println("Hello from thread" + finalI)));
        }
        threadList.forEach(Thread::start);


        Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread"));
    }

}

class MultithreadThingWithExtension extends Thread {
    private int threadNumber;
    public MultithreadThingWithExtension (int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            var randomNumber = 100 + (int)(Math.random() * 1000);
            System.out.println("Thread " + threadNumber + " is running; random number:" + randomNumber +" counter:" + i);
            try{
                Thread.sleep(randomNumber);
            }
            catch(InterruptedException exception) {
                System.out.println("Thread " + threadNumber + " was interrupted");
            }
        }
    }
}

class MultithreadThingImplRunnable implements Runnable {

    private int threadNumber;
    public MultithreadThingImplRunnable (int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            var randomNumber = 100 + (int)(Math.random() * 1000);
            System.out.println("Thread " + threadNumber + " is running; random number:" + randomNumber +" counter:" + i);
            try{
                Thread.sleep(randomNumber);
            }
            catch(InterruptedException exception) {
                System.out.println("Thread " + threadNumber + " was interrupted");
            }
        }
    }
}



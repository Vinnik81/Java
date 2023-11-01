/*class CustomThread extends Thread {
    private int i = 0;
    @Override
    public void run() {
        while (true) {
            i++;
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}*/

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/*class InfinityIncrement implements Runnable {
    private int i = 0;
    @Override
    public void run() {
        while (true) {
            i++;
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}*/

class ClassForThread {
    private int value = 0;
    private int goal = 1_000_000;
//    AtomicInteger value = new AtomicInteger(0); // 4 способ
//    Object lock = new Object(); // 3 способ
    private ReentrantLock lock = new ReentrantLock(); // 5 способ

    class Incrementator extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < goal; i++) {
//                value++; // 1 способ
//                modifyValue(true); // 2 способ
                /*synchronized (lock) { // 3 способ
                    value++;
                }*/
//                value.incrementAndGet(); // 4 способ
                lock.lock(); // 5 способ
                value++;
                lock.unlock();
            }
        }
    }
    class Decrementator extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < goal; i++) {
//                value--; // 1 способ
//                modifyValue(false); // 2 способ
                /*synchronized (lock) { // 3 способ
                    value--;
                }*/
//                value.decrementAndGet(); // 4 способ
                lock.lock(); // 5 способ
                value--;
                lock.unlock();
            }
        }
    }

    public int getValue() {
        return value; // 1, 2, 3, 5 способ
//        return value.get(); // 4 способ
    }

    public void setValue(int value) {
        this.value = value; // 1, 2, 3, 5 способ
//        this.value.set(value); // 4 способ
    }

    /*public synchronized void modifyValue(boolean op) {
        if (op) {
            value++;
        } else {
            value--;
        }
    }*/ // 1, 2, 3 способ

    public void start(int goal) {
        System.out.println("Start value: " + value);
        this.goal = goal;
        Incrementator incrementator = new Incrementator();
        Decrementator decrementator = new Decrementator();

        incrementator.start();
        decrementator.start();

        try {
            decrementator.join();
            incrementator.join();
        } catch (Exception e) {

        }
        System.out.println("End value: " + value);
        value = 0; // 1, 2, 3, 5 способ
//        value.set(0); // 4 способ
        goal = 0;
    }
}

public class Main {
    public static void main(String[] args) {

        ClassForThread classForThread = new ClassForThread();
        classForThread.start(1_000_000);

        /*int a = 1;
       System.out.println(a++ - ++a);*/

        /*System.out.println("start");

        InfinityIncrement[] infinityIncrement = new InfinityIncrement[] {
        new InfinityIncrement(),
        new InfinityIncrement(),
        new InfinityIncrement()
        };
        Thread[] threads = new Thread[] {
            new Thread(infinityIncrement[0]),
            new Thread(infinityIncrement[1]),
            new Thread(infinityIncrement[2])
        };
        threads[0].setPriority(Thread.MIN_PRIORITY);
        threads[1].setPriority(Thread.NORM_PRIORITY);
        threads[2].setPriority(Thread.MAX_PRIORITY);

        Arrays.stream(threads).forEach(item -> {
                item.start();

        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        Arrays.stream(threads).forEach(item-> {item.interrupt();});
        System.out.println();
        System.out.println("stop");

        System.out.println("Min: " + infinityIncrement[0].getI());
        System.out.println("Norm: " + infinityIncrement[1].getI());
        System.out.println("Max: " + infinityIncrement[2].getI());*/

        /*System.out.println("start");

        InfinityIncrement infinityIncrement = new InfinityIncrement();
        Thread thread = new Thread(infinityIncrement);
        thread.start();

        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        System.out.println(infinityIncrement.getI());
        System.out.println("stop");*/

        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread childThread = Thread.currentThread();
                System.out.println(childThread.getName());
                System.out.println("Hello with child thread!");
            }
        });

        thread.setName("Child thread");
        thread.start();

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());

        System.out.println("Hello with main thread!");*/
    }
}
package Ques8;
import java.util.concurrent.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Q8SemaphoreDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 200; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    Q8Connections.getInstance().connect();
                }
            });
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {

        }
    }
}
public class Q8Connections {
    private static Q8Connections instance = new Q8Connections();
    private Semaphore sem = new Semaphore(10, true);
    private int connections = 0;
    private Q8Connections() { }
    public static Q8Connections getInstance() {
        return instance;
    }
    public void connect() {
        try {
            sem.acquire();
        } catch (InterruptedException e1) {
            e1.printStackTrace(); }
        try {
            doConnect();
        } finally {
            sem.release();
        } }
    public void doConnect() {
        synchronized (this) {
            connections++;
            System.out.println("Current connections: " + connections); }
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connections--; } }
}



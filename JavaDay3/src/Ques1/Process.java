package Ques1;

import java.util.Scanner;



class Process2 extends Thread{
    private volatile boolean running=true;

    public void run(){
        while(running) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception"); }
        } }
    public void shutdown(){
        running=false;
    }
}
public class Process {

    public static void main(String[] args) {
        Process2 p=new Process2();
        p.start();
        System.out.println("Press return to stop...");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        p.shutdown();

    }
}
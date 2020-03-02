package Ques7;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secs,tot;
        int rem=0;
        System.out.println("Enter time in seconds:");
        secs= input.nextInt();
        tot=secs;
        int days= (secs/86400);
        rem= secs-(days*86400);
        int hour= (rem/3600);
        rem=rem-(hour*3600);
        int min= (rem/60);
        rem=rem-(min*60);
        System.out.println("Total time in seconds: "+tot);
        System.out.println("Time in days "+days+" hours "+hour+" minutes "+min+" seconds "+rem);
    }
}

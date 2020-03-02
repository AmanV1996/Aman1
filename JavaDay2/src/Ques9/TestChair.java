package Ques9;

import java.util.Scanner;

class Ques9 {

    String ftest;
    String stest;
    Scanner input = new Scanner(System.in);
    void fireTest()
    {
        System.out.println("Does it passed fire test?");
        ftest=input.next();
        //System.out.println(""+ftest);
    }

    void stressTest()
    {
        System.out.println("Does it passed stress test?");
        stest=input.next();
        //System.out.println(""+stest);
    }
}

public class TestChair extends Ques9{
    String type;
    int cost;
    Scanner input = new Scanner(System.in);
    void prop(){
        System.out.println("Type of Chair(metal or wood)?");
        type=input.next();
        System.out.println("Cost of Chair:");
        cost=input.nextInt();
    }
    public static void main(String[] args) {

        TestChair obj=new TestChair();
        obj.prop();
        obj.fireTest();
        obj.stressTest();
        System.out.println("It is a "+obj.type+" table having cost "+obj.cost);
        System.out.println("Result of fire test: "+obj.ftest);
        System.out.println("Result of stress test: "+obj.stest);
    }

}


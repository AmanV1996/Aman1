package Ques10;
import java.util.Scanner;

class Customer{
    String name;
    String oname;
    static String ispaid;
    int orderno;
    Scanner input = new Scanner(System.in);
    void getDetails(){
        System.out.println("1. Taking Customer details");
       /* String name = input.next();
        System.out.println("Customer order name:");
        String oname = input.next();
        System.out.println("Has Customer paid?:(y/n)");
        String ispaid = input.next();*/
        ispaid="y";
    }
}
class Cashier extends Customer{
    int money;
    String corder;
    int corderno;
    int i=1;
    void setDetails(){
        System.out.println("2. Forwarding Customer order details if money is paid");
        if(Customer.ispaid=="y" || Customer.ispaid=="Y")
        {
            //corderno=i;
            //i++;
        }
        else
        {
            System.out.println("Please ask customer to pay.");
        }

    }
}



public class Barista extends Cashier {
    String orname;
    String status;
    String ornum;
    String feedback;

    void showDetails()
    {
        System.out.println("3. Customer order details received \n - Preparing order");
        System.out.println("4. Taking order feedback");
    }
    public static void main(String[] args) {

        Barista b= new Barista();
        b.getDetails();
        b.setDetails();
        b.showDetails();
    }
}
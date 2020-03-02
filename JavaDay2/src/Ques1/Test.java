package Ques1;
import java.util.Scanner;

public class Test {

    String lname="Central Library";
    String librarian="M.k.Gupta";
    void libraryDetails()
    {
        System.out.println(""+lname);
        System.out.println(""+librarian);
    }

}

class Ques1book extends Test {
    String bookname;
    String writer;
    String bookno;

    void getDetails()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details of book");

        System.out.println("Enter book number: ");
        bookno=input.next();

        System.out.println("Enter book author: ");
        writer=input.next();

        System.out.println("Enter book name: ");
        bookname=input.next();


    }

    void showDetails()
    {
        System.out.println("The book issued is "+bookname+" written by "+writer+" and having book number "+bookno);
    }
}



class Ques1User extends Ques1book {

    String uname;
    String stream;
    String rollno;

    void getUDetails()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details of user");
        System.out.println("Enter user name: ");
        uname=input.next();
        System.out.println("Enter user stream: ");
        stream=input.next();
        System.out.println("Enter roll number: ");
        rollno=input.next();
    }

    void showUDetails()
    {
        System.out.println("The book issued to "+uname+" of "+stream+" and having roll number "+rollno);
    }

    public static void main(String[] args) {
        Ques1User ob=new Ques1User();
        ob.libraryDetails();
        ob.getDetails();
        ob.showDetails();
        ob.getUDetails();
        ob.showUDetails();
    }

}



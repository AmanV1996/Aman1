package Ques7;

public class Ques7 {

    public static String finame;
    public static String laname;
    public static int rollno;

    public static void display(String fname, String lname, int rno)
    {
        System.out.println("First name is:"+fname );
        System.out.println("First name is:"+lname );
        System.out.println("First name is:"+rno );
    }

    static{
        System.out.println("First name is: Aman");
        System.out.println("First name is: Verma" );
        System.out.println("First name is: 21" );
    }

    public static void main(String[] args)
    {
        String fname="Aman";
        String lname="Verma";
        int rno= 21;
        Ques7 ob= new Ques7();
        Ques7.display(fname, lname, rno);
        Ques7.finame=fname;
        Ques7.laname=lname;
        Ques7.rollno=rno;
        System.out.println(Ques7.finame + Ques7.laname + Ques7.rollno);
    }
}

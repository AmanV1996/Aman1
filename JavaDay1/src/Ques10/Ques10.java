package Ques10;

class Overload
{
    public double res=0;
    String res1;
    public void sum(double a, double b)
    {
        res=a+b;
        System.out.println(res);
    }

    public void sum(int a,int b)
    {
        res=a+b;
        System.out.println(res);
    }

    public void multiply(int a, int b)
    {

        res= a*b;
        System.out.println(res);
    }

    public void multiply(float a, float b)
    {
        res= a*b;
        System.out.println(res);
    }

    public void concatenate(String s1, String s2, String s3)
    {
        res1= s1+s2;
        res1= res1+s3;
        System.out.println(res1);
    }

    public void concatenate(String s1, String s2)
    {
        res1=s1+s2;
        System.out.println(res1);
    }

    public static void main(String[] args) {

        Overload ob = new Overload();
        ob.sum(2,3);
        ob.sum(2.3, 0.7);
        ob.multiply(3,5);
        ob.concatenate("Aman","Verma");
    }

}

public class Ques10
{
    public double res=0;
    String res1;
    public void sum(double a, double b)
    {
        res=a+b;
        System.out.println(res);
    }

    public void sum(int a,int b)
    {
        res=a+b;
        System.out.println(res);
    }

    public void multiply(int a, int b)
    {

        res= a*b;
        System.out.println(res);
    }

    public void multiply(float a, float b)
    {
        res= a*b;
        System.out.println(res);
    }

    public void concatenate(String s1, String s2, String s3)
    {
        res1= s1+s2;
        res1= res1+s3;
        System.out.println(res1);
    }

    public void concatenate(String s1, String s2)
    {
        res1=s1+s2;
        System.out.println(res1);
    }

    public static void main(String[] args) {

        Overload ob = new Overload();
        ob.sum(2,3);
        ob.sum(2.3, 0.7);
        ob.multiply(3,5);
        ob.concatenate("Aman","Verma");
    }



}

package Ques5;

class Test2
{
    int x, y;
    Test2()
    {
        x = 10;
        y = 20;
    }
}
public class Test {

    public static void main(String[] args)
    {
        Test2 ob1 = new Test2();

        System.out.println(ob1.x + " " + ob1.y);

        // Creating a new reference variable ob2
        // pointing to same address as ob1
        Test2 ob2 = ob1;

        // Any change made in ob2 will be reflected
        // in ob1
        ob2.x = 100;

        System.out.println(ob1.x+" "+ob1.y);
        System.out.println(ob2.x+" "+ob2.y);
    }
}

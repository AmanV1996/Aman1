package Ques5;

class Test1
{
    int x, y;
}
class Test3 implements Cloneable
{
    int a;
    int b;
    Test1 c = new Test1();
    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}

public class Clone {
    public static void main(String args[]) throws
            CloneNotSupportedException
    {
        Test3 t1 = new Test3();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test3 t2 = (Test3)t1.clone();

        // Creating a copy of object t1 and passing
        //  it to t2
        t2.a = 100;

        // Change in primitive type of t2 will not
        // be reflected in t1 field
        t2.c.x = 300;

        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
        System.out.println(t1.a + " " + t1.b + " " +
                t1.c.x + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " +
                t2.c.x + " " + t2.c.y);
    }
}

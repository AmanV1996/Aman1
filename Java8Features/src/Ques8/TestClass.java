package Ques8;
interface TestInterface1
{
default void show()
       {
        System.out.println("Default TestInterface1");
        }
}

interface TestInterface2 {
    default void show() {
        System.out.println("Default TestInterface2");
    }
}

public class TestClass implements TestInterface1, TestInterface2 {
    TestClass() {
    }

    public void show() {
        TestInterface1.super.show();
        TestInterface2.super.show();
    }

    public static void main(String[] args) {
        TestClass d = new TestClass();
        d.show();
    }
}

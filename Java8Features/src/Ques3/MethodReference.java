package Ques3;

interface forInstance1 {
    void add(int var1, int var2);
}

interface forInstance2 {
    void sub(int var1, int var2);
}

interface forStatic {
    void say(int var1);
}

public class MethodReference {
    public MethodReference() {
    }

    public static void saySomething(int i) {
        System.out.println("Multiplication is:" + i * i);
    }

    public void saySomething2(int i, int j) {
        System.out.println("Addition is:" + (i + j));
    }

    public void saySomething3(int i, int j) {
        System.out.println("Subtraction is:" + (i - j));
    }

    public static void main(String[] args) {
        forStatic says = MethodReference::saySomething;
        System.out.println("Using static method reference:");
        says.say(8);
        MethodReference methodReference = new MethodReference();
        forInstance1 says2 = methodReference::saySomething2;
        System.out.println("\nUsing instance method reference:");
        says2.add(10, 20);
        MethodReference var10000 = new MethodReference();
        forInstance2 sayable2 = var10000::saySomething3;
        sayable2.sub(15, 8);
    }
}
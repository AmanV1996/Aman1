package Ques7;

interface MyInterface1 {
    int num = 100;

    default void display() {
        System.out.println("display method of MyInterface1");
    }
}

public class OverrideDefault implements MyInterface1 {
    public OverrideDefault() {
    }

    public void display() {
        System.out.println("display method of MyInterface1 overwritten.");
    }

    public static void main(String[] args) {
        OverrideDefault obj = new OverrideDefault();
        obj.display();
    }
}

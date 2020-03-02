package Ques6;


interface test {
    static void hello() {
        System.out.println("Static method of interface.");
    }

    default void show() {
        System.out.println("Default method of interface");
    }
}

public class CreateAndAccess implements test {
    public CreateAndAccess() {
    }

    public static void main(String[] args) {
        CreateAndAccess obj = new CreateAndAccess();
        test.hello();
        obj.show();
    }
}

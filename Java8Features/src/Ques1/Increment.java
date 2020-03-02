package Ques1;

interface increment {
    void test(int var1);
}

public class Increment {
    public Increment() {
    }

    public static void main(String[] args) {
        increment res = (a) -> {
            ++a;
            System.out.println(a);
        };
        res.test(12);
    }
}

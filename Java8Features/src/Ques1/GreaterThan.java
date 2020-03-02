package Ques1;

interface greater {
    void test(int var1, int var2);
}

public class GreaterThan {
    public GreaterThan() {
    }

    public static void main(String[] args) {
        greater res = (a, b) -> {
            if (a > b) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        };
        res.test(12, 15);
    }
}

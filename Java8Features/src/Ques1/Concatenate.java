package Ques1;

interface concatenating {
    void test(String var1, String var2);
}

public class Concatenate {
    public Concatenate() {
    }

    public static void main(String[] args) {
        concatenating res = (a, b) -> {
            System.out.println(a + b);
        };
        res.test("Company ", "TTN");
    }
}

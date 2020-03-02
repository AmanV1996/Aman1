package Ques1;

interface toUpper {
    void test(String var1);
}

public class Upper {
    public Upper() {
    }

    public static void main(String[] args) {
        toUpper res = (a) -> {
            System.out.println(a.toUpperCase());
        };
        res.test("company ");
    }
}

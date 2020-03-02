package Ques2;

import java.util.function.BiFunction;

public class BiFunImplement {
    public BiFunImplement() {
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> Myfunc = (e1, e2) -> {
            return e1 + Integer.parseInt(e2.toString());
        };
        System.out.println(Myfunc.apply(2, 8));
    }
}

package Ques5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public FunctionalInterfaces() {
    }

    public static void main(String[] args) {
        System.out.println("Consumer:");
        Consumer<Integer> display = (a) -> {
            System.out.println(a);
        };
        display.accept(10);
        System.out.println("\nSupplier:");
        Supplier<Double> randomValue = () -> {
            return Math.random();
        };
        System.out.println(randomValue.get() + "\n");
        System.out.println("Predicate:");
        Predicate<Integer> lesserthan = (i) -> {
            return i < 18;
        };
        System.out.println(lesserthan.test(10) + "\n");
        System.out.println("Function:");
        Function<Integer, Integer> doubling = (a) -> {
            return 2 * a;
        };
        System.out.println(doubling.apply(5) + "\n");
    }
}

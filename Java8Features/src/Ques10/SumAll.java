package Ques10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAll {
    public SumAll() {
    }

    public static void main(String[] args) {
        List<Integer> evenList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer result = (Integer)evenList.stream().filter((e) -> {
            return e > 5;
        }).collect(Collectors.summingInt((e) -> {
            return e;
        }));
        System.out.println(result);
    }
}

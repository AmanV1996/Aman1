package Ques11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAll {
    public AverageAll() {
    }

    public static void main(String[] args) {
        List<Integer> evenList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Double result = (Double)evenList.stream().map((e) -> {
            return e * 2;
        }).collect(Collectors.averagingInt((e) -> {
            return e;
        }));
        System.out.println(result);
    }
}

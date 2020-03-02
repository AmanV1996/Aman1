package Ques9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenList {
    public EvenList() {
    }

    public static void main(String[] args) {
        List<Integer> evenList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List result = (List)evenList.stream().filter((e) -> {
            return e % 2 == 0;
        }).collect(Collectors.toList());
        System.out.println(result);
    }
}

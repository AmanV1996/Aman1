package Ques12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEven {
    public FirstEven() {
    }

    public static void main(String[] args) {
        List<Integer> evenList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> result = evenList.stream().filter((e) -> {
            return e % 2 == 0;
        }).filter((e) -> {
            return e > 3;
        }).findFirst();
        if (result.isPresent()) {
            System.out.println(result);
        } else {
            System.out.println("No result found");
        }

    }
}

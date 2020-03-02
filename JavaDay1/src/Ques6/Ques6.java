package Ques6;

public class Ques6 {

    static int findSingle(int ar[], int ar_size)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];

        return res;
    }

    public static void main(String[] args) {


        int ar[] = {2, 3, 5, 4, 5, 3, 4, 2, 9, 7, 9};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");

    }
}
package Ques2;

public class Test {

        public static void main(String[] args)
        {
            String str="sortthisstring";

            char temp = 0;

            char arr[] = str.toCharArray();
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr.length; j++)
                {
                    if (arr[j] > arr[i])
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Original: "+str);
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i]);
            }
        }
    }


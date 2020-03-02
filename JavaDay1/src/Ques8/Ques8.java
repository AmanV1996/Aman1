package Ques8;

public class Ques8 {
    public static void main(String[] args)
    {
        String input = "To The New is Noida based company";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println("Reversed string is: "+input1);
        String del= input1.substring(4,10);
        System.out.println(del);
        input1.replace(4,10," ");
        System.out.println(input1);
    }
}

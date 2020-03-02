package JavaDay4.Ques2;
import java.util.*;
public class App {

    public static void main(String[] args) {

        boolean flag = false;
        String test = "Trying string in TTN";
        System.out.println(test);
        test=test.toLowerCase();
        List<Character> uniqueList = new LinkedList<>();
        List<Character> repeatedList = new LinkedList<>();
        HashSet<Character> unique = new HashSet<>();
        for (int i=0; i<test.length();i++){
            flag = unique.add(test.charAt(i));
            if (flag==true) {
                uniqueList.add(test.charAt(i));
            }
            else
                repeatedList.add(test.charAt(i));
        }
        for (int i=0;i<uniqueList.size();i++){
            for (int j=0;j<repeatedList.size();j++){
                if (uniqueList.get(i).equals(repeatedList.get(j))){
                    uniqueList.remove(i);
                } } }
        System.out.print("Unique characters are:");
        System.out.println(uniqueList.size());
        Iterator<Character> uniqueChars= uniqueList.iterator();
        while (uniqueChars.hasNext()){
            System.out.print(uniqueChars.next()+", ");
        } }}

package JavaDay4.Ques3;

import java.util.*;

public class App {
    public static void main(String[] args) {

        String str="This is TTN company";
        System.out.println("String entered: "+str);
        str=str.toLowerCase();
        System.out.println("String in lowercase: "+str+"\n");
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char i:str.toCharArray()){
            if(map.keySet().contains(i))
            {
                int x=map.get(i);
                map.put(i,++x);
            }
            else {
                map.put(i,1); }

        }
        for (char c:map.keySet())
        {
              if(c==' ')
                  System.out.print("");
              else
              System.out.println(c+" "+map.get(c));
            }
        }
}


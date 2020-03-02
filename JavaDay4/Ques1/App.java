package JavaDay4.Ques1;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<Float> sumlist=new ArrayList<>();
        sumlist.add(2.1f);
        sumlist.add(1f);
        sumlist.add(8.55f);
        sumlist.add(7.3f);
        sumlist.add(4f);
         float sum=0;
        Iterator<Float> it= sumlist.iterator();

        while(it.hasNext()){
            sum+=it.next();
        }

        System.out.println("The sum of list is: "+sum);
    }
}

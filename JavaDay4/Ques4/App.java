package JavaDay4.Ques4;
import java.util.*;

public class App {
    public static
    Map<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {

        map.put("Cat", 20);
        map.put("Dog", 100);
        map.put("Swan", 40);
        map.put("Giraffe", 1);
        map.put("Tiger", 41);
        map.put("Monkey", 26);

        printMap(map);
        System.out.println("\n");
        //sortMap(map);

        printMap(sortMap(map));


    }

    private static HashMap<String, Integer> sortMap(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> map1 : list) {
            sortedMap.put(map1.getKey(), map1.getValue());
        }

        return sortedMap;
    }

    private static void printMap(Map map) {
        Iterator<String> keyIterator = map.keySet().iterator();
        Iterator<Integer> valueIterator = map.values().iterator();
        while (keyIterator.hasNext() && valueIterator.hasNext()){
            System.out.println(keyIterator.next() + ": " + valueIterator.next());
        }
    }

}
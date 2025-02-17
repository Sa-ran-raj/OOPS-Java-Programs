import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String name;
        int num;
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
       
        for (int i = 0; i < n; i++) {
            name = sc.next();
            num = sc.nextInt();
            map.put(name, num);
        }
       
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("----------");

        HashMap<String, Integer> anotherMap = new HashMap<String, Integer>();

        anotherMap.put("SIX", 6);
        anotherMap.put("SEVEN", 7);

        anotherMap.putAll(map);

        entrySet = anotherMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.putIfAbsent("FIVE", 5);

        int value = map.get("TWO");
        System.out.println(value);

        System.out.println(map.containsKey("ONE"));

        System.out.println(map.containsValue(3));

        System.out.println(map.size());

        sc.close();
    }
}

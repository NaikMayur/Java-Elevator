import java.util.*;

class HashMapExample {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("mango");
        set.add("Banana");
        System.out.println(set);
        if (set.contains("apple")) {
            System.out.println("apple found");
        }
        if (!set.contains("chikooo")) {
            System.out.println("chikoo not found");
        }
        Iterator it = set.iterator();
        for (String val : set) {
            System.out.println(it.next());
        }
        System.out.println(".............................");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(20, "Mayur");
        map.put(22, "Radha");
        map.put(24, "Aman");
        map.put(50, "Tanay");
        if (map.containsKey(12)) {
            System.out.println("12 is present");
        } else {
            System.out.println("12 not found");
        }
        System.out.println(map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

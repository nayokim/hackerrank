import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class HrHashMap {
    public static void main(String[] args) {
        // Creating a map using the HashMap
//        Map<String, Integer> numbers = new HashMap<>();
//
//        // Insert elements to the map
//        numbers.put("One", 1);
//        numbers.put("Two",2);
//        System.out.println("Map: " + numbers);
//
//        // Access keys of the map - keySet() - returns a set of all the keys of the map
//        System.out.println("keys: " + numbers.keySet());
//
//        //Access values of map - values() - returns a set of all the values of the map
//        System.out.println("values: " +  numbers.values());
//
//        // Access entries of the map -entrySet() - returns a set of all the key/value mapping of the map
//        System.out.println("Entries: " +  numbers.entrySet());
//
//        // Remove Elements from the map
//        int value = numbers.remove("Two");
//        System.out.println("Removed Value: " + value);

        //HashSet cannot contain duplicate elements. Hence, each hash set element has a unique hashcode.In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table are accessed using hash codes.

//        HashSet<Integer> evenNumber = new HashSet<>();
//
//        // Using add() method
//        evenNumber.add(2);
//        evenNumber.add(4);
//        evenNumber.add(6);
//        System.out.println("HashSet: " + evenNumber);
//
//        HashSet<Integer> numbers = new HashSet<>();
//
//        // Using addAll() method
//        numbers.addAll(evenNumber);
//        numbers.add(5);
//        System.out.println("New HashSet: " + numbers);
//
//        }

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> pairs = new  HashSet<>();
        for (int i = 0; i <t; i++){
            pairs.add("(" + pair_left[i] + ", "  + pair_right[i] + ")");
            System.out.println(pairs.size());
        }

    }
}

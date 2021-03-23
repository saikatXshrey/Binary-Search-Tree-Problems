import java.util.*;

class GFG {
    public static void main(String args[]) {

        // Initialization of a TreeMap using Generics
        TreeMap<Integer, String> t = new TreeMap<>();

        // Inserting the Elements
        t.put(10, "geeks");
        t.put(15, "ide");
        t.put(5, "courses");

        // Prints the TreeMap
        System.out.println(t);

        // Check for the key in the map
        System.out.println(t.containsKey(10));

        // Iterating over TreeMap
        for (Map.Entry<Integer, String> e : t.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
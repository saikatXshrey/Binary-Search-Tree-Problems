import java.util.*;

class GFG {
    public static void main(String args[]) {
        TreeMap<Integer, String> t = new TreeMap<>();

        // Inserting the Elements
        t.put(10, "geeks");
        t.put(15, "ide");
        t.put(5, "courses");

        // returns the key-value pair corresponding
        // to higher key and prints the associated value
        System.out.println(t.higherEntry(10).getValue());

        // returns the key-value pair corresponding
        // to lower key prints the associated value
        System.out.println(t.lowerEntry(10).getValue());

        // returns a key-value mapping associated
        // with the greatest key <= to the given key
        System.out.println(t.floorEntry(10).getValue());

        // returns a key-value mapping associated
        // with the least key >= to the given key
        System.out.println(t.ceilingEntry(10).getValue());
    }
}
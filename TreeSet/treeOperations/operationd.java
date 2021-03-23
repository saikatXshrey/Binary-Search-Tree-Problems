import java.util.*;

class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();

        // Elements are added using add() method
        s.add(10);
        s.add(5);
        s.add(2);
        s.add(15);

        // Prints the largest value lower than 5 here it is 2
        System.out.println(s.lower(5));

        // Prints the smallest higher value than 5 between 10 and 15 smallest is 10
        System.out.println(s.higher(5));

        // Value <= 5
        System.out.println(s.floor(5));

        // Value >= 5
        System.out.println(s.ceiling(5));
    }
}

import java.util.*;
import java.util.TreeMap;

class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

class Vertical {
    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(50);
        root.left.left = new Node(30);
        root.left.right = new Node(40);

        vSum(root);
    }

    static void vSum(Node root) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        vSumR(root, 0, mp);
        for (Map.Entry sum : mp.entrySet())
            System.out.print(sum.getValue() + " ");
    }

    static void vSumR(Node root, int hd, TreeMap<Integer, Integer> mp) {
        if (root == null)
            return;

        vSumR(root.left, hd - 1, mp);

        int pSum = (mp.get(hd) == null) ? 0 : mp.get(hd);
        mp.put(hd, pSum + root.key);

        vSumR(root.right, hd + 1, mp);
    }
}
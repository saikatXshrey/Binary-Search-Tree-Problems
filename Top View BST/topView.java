import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node n, int h) {
        node = n;
        hd = h;
    }
}

class Vertical {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        vTraversal(root);
    }

    static void vTraversal(Node root) {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> m = new TreeMap<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node current = p.node;

            if (!m.containsKey(p.hd)) {
                m.put(p.hd, current.key);
            }
            if (current.left != null)
                q.add(new Pair(current.left, p.hd - 1));
            if (current.right != null)
                q.add(new Pair(current.right, p.hd + 1));
        }

        for (Map.Entry<Integer, Integer> x : m.entrySet()) {
            System.out.print(x.getValue() + " ");
        }
    }
}
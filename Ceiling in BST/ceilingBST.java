class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

class Driver {
    public static void main(String args[]) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 17;

        System.out.print("Ceiling: " + (getCeiling(root, x).key));
    }

    static Node getCeiling(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (x == root.key)
                return root;
            else if (x > root.key) {
                root = root.right;
            } else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }
}
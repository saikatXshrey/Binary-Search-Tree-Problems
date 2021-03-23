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
        int x = 16;

        if (search(root, x))
            System.out.print("Found");
        else
            System.out.print("Not Found");
    }

    public static boolean search(Node root, int x) {
        while (root != null) {
            if (x == root.key)
                return true;
            else if (x > root.key)
                root = root.right;
            else
                root = root.left;
        }

        return false;
    }
}
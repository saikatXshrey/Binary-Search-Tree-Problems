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

        inorder(insert(root, x));
    }

    public static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
        if (x > root.key)
            root.right = insert(root.right, x);
        else if (x < root.key)
            root.left = insert(root.left, x);

        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}
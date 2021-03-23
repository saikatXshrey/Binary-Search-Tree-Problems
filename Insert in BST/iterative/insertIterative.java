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
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        int x = 20;

        inorder(insert(root, x));
    }

    public static Node insert(Node root, int x) {
        Node temp = new Node(x);
        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (x > root.key)
                current = current.right;
            else if (x < root.key)
                current = current.left;
            else
                return root;
        }

        if (parent == null)
            return temp;
        if (x > parent.key)
            parent.right = temp;
        else if (x < parent.key)
            parent.left = temp;

        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}
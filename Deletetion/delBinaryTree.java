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
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        int x = 15;

        root = delNode(root, x);
        inorder(root);
    }

    static Node delNode(Node root, int x) {
        if (root == null)
            return root;
        if (x > root.key)
            root.right = delNode(root.right, x);
        else if (x < root.key)
            root.left = delNode(root.left, x);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                Node succesor = getSuccesor(root);
                root.key = succesor.key;
                root.right = delNode(root.right, succesor.key);
            }
        }
        return root;
    }

    static Node getSuccesor(Node current) {
        current = current.right;

        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}
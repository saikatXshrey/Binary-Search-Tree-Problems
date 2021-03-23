class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

class Driver {
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        if (isBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

    static int previous = Integer.MIN_VALUE;

    static boolean isBST(Node root) {
        if (root == null)
            return true;

        if (!isBST(root.left))
            return false;

        if (root.key <= previous)
            return false;

        previous = root.key;

        return isBST(root.right);
    }
}
class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

class Driver {
    public static void main(String args[]) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        if (checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

    static boolean checkBST(Node root, int leftLimit, int rightLimit) {
        if (root == null)
            return true;

        return (root.key > leftLimit && root.key < rightLimit && checkBST(root.left, leftLimit, root.key)
                && checkBST(root.right, root.key, rightLimit));
    }
}
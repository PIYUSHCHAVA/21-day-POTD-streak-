class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class MirrorTree {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Base case: if the node is null, return.
        if (node == null) 
            return;
        
        // Recursively mirror the left and right subtrees.
        mirror(node.left);
        mirror(node.right);

        // Swap the left and right children.
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    // Function to print the inorder traversal of the binary tree.
    void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        // Creating the binary tree.
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        

        // Printing original inorder traversal of the tree.
        MirrorTree mt = new MirrorTree();
        System.out.println("Inorder traversal of original tree:");
        mt.inOrder(root);
        System.out.println();

        // Converting to mirror.
        mt.mirror(root);

        // Printing inorder traversal of the mirror tree.
        System.out.println("Inorder traversal of mirror tree:");
        mt.inOrder(root);
    }
}

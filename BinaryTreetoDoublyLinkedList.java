import java.util.ArrayList;

class Node {
    Node left, right;
    int data;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTreetoDoublyLinkedList {
    // Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root) {
        // Your code here
        ArrayList<Integer> al = inorder(root);
        if (al.size() == 0) return null;  // If tree is empty
        
        Node curr = new Node(al.get(0));
        Node prev = curr;
        
        for (int i = 1; i < al.size(); i++) {
            Node newNode = new Node(al.get(i));
            prev.right = newNode;
            newNode.left = prev;
            prev = newNode;
        }
        return curr;
    }

    // Helper function to perform in-order traversal
    ArrayList<Integer> inorder(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        if (root == null)
            return al;

        al.addAll(inorder(root.left));
        al.add(root.data);
        al.addAll(inorder(root.right));

        return al;
    }

    // Helper function to print the Doubly Linked List
    void printDoublyLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        BinaryTreetoDoublyLinkedList converter = new BinaryTreetoDoublyLinkedList();

        // Manually creating the binary tree
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);

        // Converting binary tree to doubly linked list
        Node dllHead = converter.bToDLL(root);

        // Printing the Doubly Linked List
        System.out.println("Doubly Linked List:");
        converter.printDoublyLinkedList(dllHead);
    }
}

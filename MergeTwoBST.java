

import java.util.*;

// Class to represent a Node of a Binary Search Tree
class Node 
{
    int data;
    Node left, right;
    
    Node(int item) {
        data = item;
        left = right = null;
    }
}


public class MergeTwoBST
 {
    // Function to return a list of integers denoting the node
    // values of both the BSTs in sorted order using stacks
    public List<Integer> merge(Node root1, Node root2) {
        // List to store the merged result
        List<Integer> mergedList = new ArrayList<>();
        
        // Stacks to store nodes for in-order traversal
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        
        // Traverse both trees using in-order traversal
        while (root1 != null || root2 != null || !stack1.isEmpty() || !stack2.isEmpty()) {
            // Push all left nodes of root1 into stack1
            while (root1 != null) {
                stack1.push(root1);
                root1 = root1.left;
            }
            
            // Push all left nodes of root2 into stack2
            while (root2 != null) {
                stack2.push(root2);
                root2 = root2.left;
            }
            
            // Compare the top elements of both stacks and pop the smaller one
            if (stack2.isEmpty() || (!stack1.isEmpty() && stack1.peek().data <= stack2.peek().data)) 
            {
                root1 = stack1.pop();
                mergedList.add(root1.data);
                root1 = root1.right;  // Move to the right subtree
            } else {
                root2 = stack2.pop();
                mergedList.add(root2.data);
                root2 = root2.right;  // Move to the right subtree
            }
        }
        
        return mergedList;
    }

    public static void main(String[] args) 
    {
        // Constructing first BST
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(6);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        
        // Constructing second BST
        Node root2 = new Node(2);
        root2.left = new Node(1);
        root2.right = new Node(3);
        root2.right.right = new Node(7);
        root2.right.right.left = new Node(6);

        // Create an instance of Solution and merge the trees
        MergeTwoBST sc = new MergeTwoBST();
        List<Integer> mergedList = sc.merge(root1, root2);
        
        // Printing the merged sorted list
        for (int val : mergedList) 
        {
            System.out.print(val + " ");
        }
    }
}


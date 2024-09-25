import java.util.*;

class Node
 {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class PalindromeLinkedList {

    static boolean isPalindrome(Node head) {
        Node currNode = head;
        Stack<Integer> st = new Stack<>();

        // Push all elements of the linked list into the stack
        while (currNode != null) {
            st.push(currNode.data);
            currNode = currNode.next;
        }

        // Pop elements from the stack and compare with the linked list
        while (head != null) {
            // Get the topmost element
            int c = st.pop();
            if (head.data != c) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // Linked-List: 1->2->1->1->2->1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        boolean result = isPalindrome(head);

        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

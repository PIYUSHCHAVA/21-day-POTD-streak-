class Node 
{
    int data;
    Node next, random;

    Node(int d) {
        data = d;
        next = random = null;
    }
}

class ClonedLinkedList 
{
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;
        while (curr != null) {
            Node next = curr.next;

            Node copy = new Node(curr.data);
            curr.next = copy;
            copy.next = next;
            curr = next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;

        while (curr != null) {
            Node next = curr.next.next;

            // Extract the copy
            copyCurr.next = curr.next;
            copyCurr = copyCurr.next;

            // Restore the original list
            curr.next = next;
            curr = next;
        }

        // Return the head of the cloned list
        return dummy.next;
    }
    // Helper function to print the list
    static void printList(Node head) 
    {
        Node curr = head;
        while (curr != null) {
            System.out.print("Node data: " + curr.data);
            if (curr.random != null) 
            {
                System.out.print(", Random points to: " + curr.random.data);
            } else 
            {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        // Create the original linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Set random pointers
        head.random = head.next.next;       // 1 -> 3
        head.next.random = head;            // 2 -> 1
        head.next.next.random = head.next;  // 3 -> 2
        head.next.next.next.random = head.next.next; // 4 -> 3

        // Print the original list
        System.out.println("Original list:");
        printList(head);

        // Clone the list
        ClonedLinkedList cl_obj = new ClonedLinkedList();
        Node clonedList = cl_obj.copyList(head);

        // Print the cloned list
        System.out.println("Cloned list:");
        printList(clonedList);
    }
}

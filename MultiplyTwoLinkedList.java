class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class MultiplyTwoLinkedList 
{
    public static long multiplyTwolinkedlist(Node first, Node second)
    {
        long mod=1000000007;
        long num1=0;
        long num2=0;

        while(first != null || second != null)
        {
            if(first !=  null)
            {
                num1=(num1*10+first.data)%mod;
                first=first.next;
            }
            if(second != null)
            {
                num2=(num2*10+second.data)%mod;
                second=second.next;
            }
        }
        return (num1*num2)%mod;
    }
    static void printList(Node curr)
    {
        while(curr != null)
        {
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) 
    {
        Node head1=new Node(3);
        head1.next=new Node(2);
        
        Node head2=new Node(2);
        
        System.out.println(multiplyTwolinkedlist(head1, head2));
        
    }
}

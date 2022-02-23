// Iterative approach of Reversing a Linked List
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class ReverseIteratively
{
    public void traverse(Node head)  // Traversing the Linked List
    {
        Node current = head;
        while(current != null)
        {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    public Node ReverseLL(Node node)
    {
        Node prev = null;
        Node current = node;
//        Node next;
        while(current != null)
        {
            Node next = current.next;
            current.next = prev;  // Here we are making prev Node the next of Current Node so that the elements gets reversed
            // update
            prev = current;
            current = next;
        }
        node.next = null;
        node = prev;

        return node;
    }
}



public class LinkedListReverse {
    public static void main(String[] args) {
        ReverseIteratively obj = new ReverseIteratively();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        Node n5 = new Node(100);
        Node n6 = new Node(1000);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        System.out.println("Given Linked List is: ");
        obj.traverse(head);

        head = obj.ReverseLL(head);
        System.out.println(" ");
        System.out.println("Reversed Linked List is: ");
        System.out.println(" ");
        obj.traverse(head);





    }




}

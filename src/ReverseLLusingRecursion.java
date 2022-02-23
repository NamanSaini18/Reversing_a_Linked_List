// Reversing a Linked List using Recursion
class Node2
{
    int data;
    Node2 next;
    public Node2(int data)
    {
        this.data = data;
        next = null;
    }
}

class ReverseRecursively
{
    public Node2 reverseRecursive(Node2 head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
         Node2 newHead = reverseRecursive(head.next);
//         head.next.next = head;
//         head.next = null;
          Node2 headNext = head.next;
          headNext.next = head;
          head.next = null;


         return newHead;
    }

    public void traverse(Node2 head)
    {
        Node2 current = head;
        while(current != null)
        {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}


class ReverseLLusingRecursion {
    public static void main(String[] args) {
        ReverseRecursively obj = new ReverseRecursively();
//        Node2 obj2 = new Node2();
        Node2 n1 = new Node2(100);
        Node2 n2 = new Node2(200);
        Node2 n3 = new Node2(300);
        Node2 n4 = new Node2(400);
        Node2 n5 = new Node2(500);
        Node2 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next= n5;
        System.out.println("Original Linked List is :");
        obj.traverse(head);
        System.out.println(" ");
        head = obj.reverseRecursive(head);
        System.out.println();
        System.out.println("Reversed Linked List using Recursion is: ");
        obj.traverse(head);



    }
}

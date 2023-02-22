package mock;
/*
2)create and add values in addfirst LinkedIn list,reverse the LinkedIn list
 */
public class mocklink {
    Node head;
    class Node
    {
        Node next;
        int val;
        Node(int val)
        {
            this.val=val;
            next=null;
        }
    }
    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(temp==null)
        {
            newnode.next=null;
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }

    }
    public void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("List is empty");
        }
        while(temp!=null)
        {
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }
    public void reverse()
    {
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;

    }

    public static void main(String[] args) {
        mocklink ll=new mocklink();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        System.out.println();
        ll.display();
        System.out.println("After reversing");
        ll.reverse();
        ll.display();
    }
}

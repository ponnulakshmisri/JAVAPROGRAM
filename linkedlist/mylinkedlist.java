package linkedlist;

public class mylinkedlist {
    Node head;
    Node tail;

    // private int size;
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public void addFirst(int val) {
        Node newnode = new Node(val);
        Node temp = head;
        if (temp == null) {

            newnode.next = null;
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addlast(int val) {
        Node newnode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        // newnode.next=null;
    }

    public void deletefirst() {
        Node temp = head;
        if (temp.next == null) {
            temp = null;
            System.out.print("List is empty");
        } else {
            head = temp.next;
        }
    }

    public void deletelast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void addmiddle(int val) {
        Node newnode = new Node(val);
//    Node temp=head;
//    int count=0;
//    while(temp!=null)
//    {
//        count++;
//        temp=temp.next;
//    }
//    int middle=count/2;
//    Node current=head;
//    for(int i=0;i<middle-1;i++)
//    {
//        current=current.next;
//    }
//    current.next=newnode;
//    current.next.next=current.next;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newnode.next = slow.next;
        slow.next = newnode;
    }

    public void addat(int index, int data) {
        Node newnode = new Node(data);
        Node temp = head;
        if (index == 1) {
            newnode.next = head;
            head = newnode;
        }
        if (index == 2) {
            newnode.next = temp.next;
            temp.next = newnode;
        } else {
            for (int i = 2; i < index; i++) {
                temp = temp.next;
            }
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public Node deletemiddle() {
        Node slow = head;
        Node fast = head.next;
        Node prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }

    public void reverselinklist() {
        Node temp = head;
        Node prev = null;
        Node next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    public boolean palindrome() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int a[] = new int[count];
        Node current = head;
        for (int i = 0; i < count; i++) {
            a[i] = current.val;
            current = current.next;
        }
        int start = 0, end = a.length - 1;
        for (int i = 0; i < count; i++) {
            if (a[start] != a[end]) {
                //System.out.println("Not palindrome");
                return false;
            }
            start++;
            end--;
        }
       // System.out.println("true");
        return true;
    }
}
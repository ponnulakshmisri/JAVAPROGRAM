package linkedlist;

public class LinkedList {
/*private Node head;
private Node tail;
private int size;
public class Node
{
    int val;
    Node next;
    Node()
    {

    }
    Node (int value)
    {
        this.val=value;
        this.next=null;
    }
}
public void display()
{
    Node temp=this.head;
    while(temp!-null)
    {
        System.out.print(temp.val+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
public int size()
{
    return this.size;
}
public int getFirst()throws Exception
{
    Node FirstNode=this.head;
    if(FirstNode!=null)
    {
        return FirstNode.val;
    }
    else {
        throw new Exception("Size of ll is 0");
    }
}
public int getLast()throws Exception
{
    if(this.size==0)
    {
        throw new Exception("Size of ll is 0");
    }
    return this.tail.val;
}
public int getAt(int index)throws Exception
{
    if(this.size==0)
    {
        throw new Exception("Size of ll is 0");
    }
  if(index<0 ||index>=this.size)
  {
      throw new Exception("Index out of bound"+"Index"+index+"Size"+this.size);
  }
  Node temp=this.head;
  while(index--!=0)
  {
      temp=temp.next;
  }
  return  temp.val;
}
public Node getNodeAt(int index)throws Exception
{
    if(this.size==0)
    {
        throw new Exception("Size of ll is 0");
    }
    if(index<0 ||index>=this.size)
    {
        throw new Exception("Index out of bound"+"Index"+index+"Size"+this.size);
    }
    Node temp=this.head;
    while(index--!=0)
    {
        temp=temp.next;
    }
    return temp;
}
public void addLast(int data)
{
    Node newNode=new Node(data);
    if(this.size==0)
    {
        this.head=newNode;
        this.tail=newNode;
        this.size=1;
    }
    else {
        Node tailNode=this.tail;
        tailNode.next=newNode;
        this.tail=newNode;
        this.size=this.size+1;
    }
}
public void addFirst(int data)
{
    Node newNode=new Node(data);
    if(this.size==0)
    {
        this.head=newNode;
        this.tail=newNode;
        this.size=1;
    }
    else
    {
        newNode.next=this.head;
        this.head = newNode;
        this.size +=1;
    }
}
public void addAt(int index,int data)throws Exception
{
    if(index==0)
    {
        this.addFirst(data);
        
    }
}*/
}

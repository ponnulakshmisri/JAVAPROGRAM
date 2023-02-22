package linkedlist;

public class client {
    public static void main(String[] args) {


        mylinkedlist list = new mylinkedlist();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(30);
        list.addlast(40);
//        list.addlast(50);
//        list.addlast(60);
//        list.addmiddle(100);
//        list.addat(4,45);
      //list.deletefirst();
//      //exit
//        list.deletemiddle();
//       list.deletelast();
       list.reverselinklist();
        list.display();
       boolean ans= list.palindrome();
       if(ans==true)
       {
           System.out.println("palindrome");
       }
       else
       {
           System.out.println("Notpalindrome");
       }

    }
}

package Array;

import java.util.ArrayList;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        ArrayList <Integer> a1=new ArrayList<Integer>();
//add values in arraylist
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(60);
        a1.add(70);
        a1.add(80);
        a1.add(90);
        System.out.println(a1);
        //get the arraylist value
        //  a.get(0);
        System.out.println(a1.get(0));
        //remove the value in the array list
        System.out.println(a1.remove(1));
        System.out.println(a1);
        //set the value,replace the value 30 to 50
        a1.set(1,50);
        System.out.println(a1);
        a1.sort((a,b)->b-a);//b-a means descending order,   -> is a lamda function
        System.out.println(a1);
        a1.sort((a,b)->a-b);//a-b means ascending order
        System.out.println(a1);
        int val=0;
        for(int i=0;i<a1.size();i++)
        {
            val=a1.get(i)+val;
        }
        System.out.println(val);
        //finding array list size
        System.out.println(a1.size());
        //using scanner we are getting input
        int n=sv.nextInt();

    }
}

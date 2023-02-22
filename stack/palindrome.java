package stack;

import java.util.Scanner;
import java.util.Stack;

public class palindrome {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        String s=sv.next();
        Stack stack=new Stack();

        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        String rev="";
        while(!stack.isEmpty())
        {
            rev=rev+stack.pop();
        }
        System.out.println(rev);
        if(s.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not");
        }
    }
}

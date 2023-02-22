package stack;

import java.util.Scanner;
import java.util.Stack;

public class revstringarray {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        String[] name=new String[n+2];
        Stack stack=new Stack();
        for(int i=0;i<n;i++)
        {
            name[i]=sv.next();
        }
        for(int i=0;i<n;i++)
        {
            stack.push(name[i]);
        }
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}

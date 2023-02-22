package mock;

import java.util.Scanner;
import java.util.Stack;
/*
3) Given a string of words reverse the words by using stack  // hello
 olleh
 */
public class stringrev {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        String name=sv.next();
        Stack stack=new Stack();
       // String rev="";
        for(int i=0;i<name.length();i++)
        {
            stack.push(name.charAt(i));
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
}

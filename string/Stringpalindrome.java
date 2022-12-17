package string;

import java.util.*;
public class Stringpalindrome {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        String s=sv.nextLine();
        System.out.println(s.toLowerCase());
        String ss=s.toLowerCase();
        String sk="";
        for(int i=ss.length()-1;i>=0;i--)
        {
            sk=sk+ss.charAt(i);
        }
        System.out.println(sk);
        if(ss.equals(sk))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

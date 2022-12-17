package basicprogram;

import java.util.*;
public class numberpalindrome {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        boolean ans=isPalindrome(n);
        if(ans==true)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }


    static boolean isPalindrome(int x)
    {

        boolean res = false;
        if (x < 0) {
            return res = false;
        } else {
            int result = palindrome(x, 0);
            if (x == result) {
                return res = true;
            } else {
                return res = false;
            }
        }
    }

    static int palindrome(int x, int result) {
        if (x == 0) {
            return result;

        }
        result = result * 10 + x % 10;
        return palindrome(x / 10, result);
    }


}

package string;

import java.util.Scanner;

public class vowelsstring {
    public static void main(String args[])
    {
        Scanner sv=new Scanner(System.in);
        String s=sv.nextLine();
        String s1=sv.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                System.out.print(s.charAt(i)+" ");
            }
        }
        System.out.println();
      //concatination
        System.out.println(s.concat(s1));
        //substring
        String subString=s1.substring(4);
        System.out.println(subString);
        String subString2=s.substring(3,8);
        System.out.println(subString2);
        //compare the string


    }
}

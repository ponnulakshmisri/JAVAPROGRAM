package string;

import java.util.Arrays;
import java.util.Scanner;

public class stringanagram {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        String s1=sv.nextLine();
        String s2=sv.nextLine();
        char[] st=s1.toCharArray();
        char[] st1=s2.toCharArray();
int count=0;
        if(s1.length()==s2.length())
        {
            Arrays.sort(st);
            Arrays.sort(st1);
            for(int i=0;i<s1.length();i++)
            {
                if(st[i]==st1[i])
                {
                   count=count+1;
                }
                else
                {
                    count=0;
                }
            }
            if(count==s1.length())
            {
                System.out.println("Yes");
            }
            else {
                System.out.print("No");
            }
        }
        else{
            System.out.print("String length are not equal");
        }
    }
}

package string;

import java.util.Scanner;

public class sumofages {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int fatherage=sv.nextInt();
        int sonage=sv.nextInt();
        sv.nextLine();
        String fathername=sv.nextLine();
        String sonname=sv.nextLine();
        int sum=sumofage(fatherage,sonage);
        System.out.println("Age: " +sum);
      String s=  nameprint(fathername,sonname);
      System.out.println("Father and son name is :" +s);
    }
    public static int sumofage(int a,int b)
    {
        return a+b;
    }
    public static String nameprint(String a, String b)
    {
        return a.concat(b);
    }
}

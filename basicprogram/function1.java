package basicprogram;

import java.util.*;
public class function1 {
    public static void main(String[] args) {
       Scanner sv=new Scanner(System.in);
        //int num=10,num1=20;
        int num=sv.nextInt();
        int num1=sv.nextInt();
      //  System.out.println(num+num1);
        int add1=sum(num,num1);
        System.out.println("Addition "+add1);
        int sub1=sub(num,num1);
        System.out.println("Subtraction "+sub1);
        int mul1=mul(num,num1);
        System.out.println("Multiplication "+mul1);
        int div1=div(num,num1);
        System.out.println("division "+div1);
    }
    public static int sum(int num,int num1) {
        int add = num + num1;
        return add;
    }
        public static int sub(int a,int b)
        {
            int sub1=a-b;
            return sub1;
        }
        public static int mul(int a,int b)
        {
            int mul1=a*b;
            return mul1;
    }
    public static int div(int a,int b)
    {
        int div1=a/b;
        return div1;
    }
}

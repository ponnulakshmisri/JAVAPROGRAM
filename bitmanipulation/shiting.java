package bitmanipulation;

import java.util.Scanner;

public class shiting {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        System.out.println(n>>1);
        System.out.println(n>>2);
        System.out.println(n<<1);
        System.out.println(n<<2);
    }
}

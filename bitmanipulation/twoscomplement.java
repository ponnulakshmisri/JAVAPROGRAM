package bitmanipulation;

import java.util.Scanner;

public class twoscomplement {
    public static void main(String[] args) {
        Scanner sv=new Scanner((System.in));
        int n= sv.nextInt();
        System.out.println(~n+1);
    }
}

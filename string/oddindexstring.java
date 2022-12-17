package string;

import java.util.Scanner;

public class oddindexstring {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("aeroplanes");
        for(int i=1;i<sb.length();i+=2)
        {

                System.out.print(sb.charAt(i));

        }

    }
}

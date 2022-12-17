package basicprogram;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class average {
    public static void main(String[] args)throws Exception {
       // Scanner sv=new Scanner(System.in);
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader  br=new BufferedReader(reader);
        int mark1=Integer.parseInt(br.readLine());
        int mark2=Integer.parseInt(br.readLine());
        int mark3=Integer.parseInt(br.readLine());
        int ans=averagefun(mark1,mark2,mark3);
        System.out.println("Average" +ans);
    }
    public static int averagefun(int mark1,int mark2,int mark3)
    {
        int average1=(mark1+mark2+mark3)/3;
        return average1;
    }
}

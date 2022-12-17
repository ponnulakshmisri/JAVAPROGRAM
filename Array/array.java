package Array;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        String s="aa 33 ff 44 33 55 gg rr 66 ff 33 22";
        ArrayList<String> a1=new ArrayList<>();
        ArrayList <Integer> a2=new ArrayList<>() ;
        String []str=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            try
            {
                a2.add(Integer.parseInt(str[i]));
            }
            catch(Exception e){
                a1.add(str[i]);
            }
        }
        System.out.println(a1);
        System.out.println(a2);
    }
}


package normal;

public class Main {
    public static void main(String[] args) {
        String s="hello";
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.substring(i+1));
        }
        System.out.println("Hello world!");
    }
}
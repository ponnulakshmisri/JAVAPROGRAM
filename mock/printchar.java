package mock;

public class printchar {
    public static void main(String[] args) {
        String s="ffajf88640&^#$0";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&& s.charAt(i)<='z')
            {
                System.out.println(s.charAt(i));
            }
        }
    }
}

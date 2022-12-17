package string;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hey there is a class");
        System.out.println(sb.toString());
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));
        sb=sb.insert(2,'h');
        System.out.println(sb);
        sb=sb.delete(2,3);
        System.out.println(sb);
       sb= sb.reverse();

        System.out.println(sb);
    }
}

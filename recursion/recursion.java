package recursion;

public class recursion {
    public static void main(String[] args) {
      //  Scanner sv=new Scanner(System.in);
        int n=10,i=1;
        recursion(n,i);
       // System.out.println(v);
    }
    public static void recursion(int n,int i)
    {
    if(i<n) {
        i = i + 1;
            System.out.println(i);
            recursion(n,i);
        }

    }
}

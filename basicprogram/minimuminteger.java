package basicprogram;

public class minimuminteger {
    public static void main(String[] args) {
        int n1=2000;
        int n2=3000;
        int n3=1;
        int minimumvalue=minimuminteger1(n1,n2,n3);
        System.out.println("The minimum value is  "+minimumvalue);
    }
    public static int minimuminteger1(int n,int m,int o)
    {
        if(n<m && n<o)
        {
            return n;
        }
        else if(m<n && m<o)
        {
            return m;
        }
        else
        {
            return o;
        }
    }
}

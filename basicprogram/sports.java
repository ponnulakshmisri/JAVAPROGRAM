package basicprogram;

public class sports {
    public static void main(String args[])
    {
        int ball=10;
        int bat=5;
        int net=20;
        int shoes=4;
        int sportsitem=sportsfun(ball,bat,net,shoes);
        System.out.println("Sports items "+sportsitem);
    }
    public static int sportsfun(int ball,int bat,int net,int shoes)
    {
        int expenses=ball+bat+net+shoes;
        return expenses;
    }
}

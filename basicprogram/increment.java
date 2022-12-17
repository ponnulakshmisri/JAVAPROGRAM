package basicprogram;

public class increment {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = a++ + b++;
        int d = --a + ++b;
        if (++a > 20 && (--b > 30 || c++ > 40) && --d > 50) {
            System.out.println("a=" + a + "b=" + b + "c=" + c + "d=" + d);
        } else {
            System.out.println("a=" + a + "b=" + b + "c=" + c + "d=" + d);
        }
    }
}

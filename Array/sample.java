package Array;

import java.util.ArrayList;
import java.util.Collections;

public class sample {
    public static void main(String[] args) {
        ArrayList a11=new ArrayList();
        a11.add(10);
        a11.add(20);
        a11.add(50);
        Collections.reverse(a11);
        Collections.shuffle(a11);
        System.out.println(a11);
    }
}

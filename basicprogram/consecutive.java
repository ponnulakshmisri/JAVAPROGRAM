package basicprogram;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class consecutive {
    public static void main (String[] args) {
        // Your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0;i<n;i++) {
            int X = scn.nextInt();
            int duplicateX = X;
            boolean xIsPowerOf2 = false;

            if(X < 3) {
                System.out.println("No");
            } else {

                //  check if it is power of 2 .......
                while(X % 2 == 0) {
                    X /= 2;

                    if(X == 1) {
                        xIsPowerOf2 = true;
                        System.out.println("No");
                    }
                }

                // other nubers // odd even (but not power of 2)
                if(!xIsPowerOf2) {
                    System.out.println("Yes");
                }
            }




        }
    }
}
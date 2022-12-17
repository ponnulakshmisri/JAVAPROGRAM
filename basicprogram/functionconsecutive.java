package basicprogram;

import java.io.*; // for handling input/output
import java.util.*;
public class functionconsecutive {
   // contains Collections framework
   public static void main (String[] args) {
            // Your code here

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            for(int i=0;i<n;i++) {
                int X = scn.nextInt();

                if(X < 3) {
                    System.out.println("No");
                } else {

                    //  check if it is power of 2 .......
                    boolean xIsPowerOf2 = isNumPowerOf2(X);

                    if(xIsPowerOf2) {
                        System.out.println("No");
                    } else {
                        System.out.println("Yes");
                    }

                }
            }
        }
// true -> num is power of 2
//  false -> num is not power of 2.

        public static boolean isNumPowerOf2(int num) {
            while(num % 2 == 0) {
                num = num /2;

                if(num == 1) {
                    //  number is power of 2
                    return true;
                }
            }

            //  in this regioon i can say that number is not power fo 2.
            return false;
        }

    }


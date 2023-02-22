package normal;

import java.util.*;
public class array {

    public static void main(String args[]) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sv.nextInt();
        }
        Arrays.sort(a);
        //1 2 2 3 4 5
        for (int i = 1; i < n; i++) {

                if (a[i] == a[i-1]) {
                    System.out.print(a[i]);
                } else {
                    continue;
                }

            }

        }
    }


package hashing;

import java.util.HashSet;
import java.util.Scanner;

public class countpairofsum {
    public static void main(String[] args) {
        /*Find out the pair of integer equal to the target number
        Input:7 5 9 1 8 2 3 7 target is 4
        output: 3
        (9 1 )  (8 2)(3 7)

         */
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sv.nextInt();
        }
        int target = sv.nextInt();
        int count = 0;
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (list.contains(target - a[i])) {
                count = count + 1;
            } else {
                list.add(a[i]);
            }
        }
        System.out.println(count);
    }
}

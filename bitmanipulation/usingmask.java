package bitmanipulation;

import java.util.Scanner;

public class usingmask {
    public static void main(String[] args) {
        /*
        Question: We need to make sure that 4th bit is ALWAYS (SET)
        Input: 181
        Output: 189
        Explanation: (SET) bit is always 1 and not 0.
        HINT: OR Operation
     */
        Scanner sv=new Scanner(System.in);
        int num=sv.nextInt();
        int position=sv.nextInt();
        int mask=1<<position;
        int mostbit=mask|num;
        System.out.println(mostbit);
 /*
        Question: We need to make sure that 4th bit is ALWAYS (Un-SET)
        Input: 181
        Output: 165
        Explanation: (Un-SET) bit is always 0 and not 1.
        HINT: AND operation
     */

        int mask2=1<<position;
        int mostbit2=~mask2;
        System.out.println(mostbit2&num);
           /*
        Question: We need to make sure that 4th bit is Flipped.
        Input: 181
        Output: 165
        Input: 165
        Output: 181
        Explanation: At the position flip the bit (if 0 flip it to 1 )and (if 1 flip it to 0).
        HINT: XOR operation
     */
        int mask3=1<<position;
        System.out.println(mask3^num);
    }
}

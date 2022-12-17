package basicprogram;

import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);

        int a = sv.nextInt();

        int b = sv.nextInt();

        int c = sv.nextInt();

        int d = sv.nextInt();
        int total = (a+b+c+d)/4;

        System.out.println(total);

        if(total>=95){

            System.out.println("O");

        }

        else if(total<=94 && total>=90){

            System.out.println("+A");

        }

        else if(total<=89 && total>=85){

            System.out.println("A");

        }

        else if(total<=84 && total>=80){

            System.out.println("B+");

        }

        else if(total<=79 && total>=70){

            System.out.println("B");

        }

        else if(total<=69 && total>=60){

            System.out.println("C");

        }

else if(total<=59 && total>=50){

            System.out.println("D");

        }

        else{

            System.out.println("Fail");

        }

    }

    }


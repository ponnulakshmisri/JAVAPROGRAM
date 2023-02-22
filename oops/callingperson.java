package oops;

import java.util.Scanner;

public class callingperson {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int age=sv.nextInt();
        String name=sv.next();
        int dogage=sv.nextInt();
        String dogname=sv.next();
        person p=new person(age,name);
//        animals a=new animals(dogage,dogname);
//        animals.animalmethod();
        p.hello();
        int height=sv.nextInt();
        int mesa=sv.nextInt();
        p.measure(height,mesa);
        //animals(dogage,dogname);
       // p.animalmethod();
    }


}

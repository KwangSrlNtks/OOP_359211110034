package Midterm;

import java.util.Scanner;

public class Midterm31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Midterm31 l = new Midterm31();
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter year " + i + " :");
            int a = in.nextInt();
            System.out.println("Age" + i + ": " + l.calculate(a));
        }
        System.out.println("Thank you.");
    }
    public int calculate(int l){
        int sum;
        return  sum = 2561-l;

    }//main

}//class
//SrlNtks

package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write two numbers:");
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        
        System.out.println(close(a1, b1));
        System.out.println(close(8, 13));
        System.out.println(close(13, 8));
        System.out.println(close(13, 7));

    }
    static String close(int a, int b){
        String words = "";
        int absA = Math.abs(a - 10);
        int absB = Math.abs(b - 10);
        if(absA < absB){
            words = a + " is closer to ten than " + b;
        }
        if(absB < absA){
            words = b + " is closer to ten than " + a;
        }
        if(absB == absA){
            words = b + " and " + a + " are the same distance from 10";
        }
        return words;
    }
}

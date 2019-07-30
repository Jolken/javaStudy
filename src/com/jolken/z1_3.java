package com.jolken;

import java.util.Scanner;

public class z1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        System.out.println(String.format("Вы ввели число %d", x));


        System.out.print("Вы ввели число ");
        System.out.println(x);


        String output = "Вы ввели число " + Integer.toString(x);
        System.out.println(output);
    }
}

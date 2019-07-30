package com.jolken;

import java.util.Scanner;

public class z1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        System.out.println(String.format("%d - вот какое число Вы ввели", x));


        System.out.print(x);
        System.out.println(" - вот какое число Вы ввели");


        String output = Integer.toString(x) + " - вот какое число Вы ввели";
        System.out.println(output);
    }
}

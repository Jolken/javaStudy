package com.jolken;

import java.awt.*;
import java.util.Scanner;

public class z1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("t: ");
        int t = sc.nextInt();
        System.out.println();

        System.out.print("v: ");
        int v = sc.nextInt();
        System.out.println();

        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.println();

        System.out.print("y: ");
        int y = sc.nextInt();
        System.out.println();

        System.out.println("5 10\n7 см\n");
        System.out.println(String.format("100 %d\n1949 %d\n", t, v));
        System.out.println(String.format("%d 25\n%d %d\n", x, x, y));



    }
}

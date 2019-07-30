package com.jolken;

public class z1_5 {
    public static void main(String[] args) {
        System.out.println("1 13 49");

        System.out.print(1);
        System.out.print(" ");
        System.out.print(13);
        System.out.print(" ");
        System.out.println(49);

        System.out.println(String.format("%d %d %d", 1, 13, 49));

        char sep = ' ';
        int[] nums = new int[]{1, 13, 49};
        for (int i : nums) {
            System.out.print(String.valueOf(i) + sep);
        }
        System.out.println();

    }
}

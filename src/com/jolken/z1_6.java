package com.jolken;

public class z1_6 {
    public static void main(String[] args) {
        System.out.println("7  15  100");

        System.out.print(7);
        System.out.print("  ");
        System.out.print(15);
        System.out.print("  ");
        System.out.println(100);

        System.out.println(String.format("%d  %d  %d", 7, 15, 100));

        String sep = "  ";
        int[] nums = new int[]{7, 15, 100};
        for (int i : nums) {
            System.out.print(String.valueOf(i) + sep);
        }
        System.out.println();

    }
}

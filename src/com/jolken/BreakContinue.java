package com.jolken;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 98; i++) {
            if (i < 9) {
                continue;
            }
            if (i == 25) {
                break;
            }
            System.out.println(i);
        }
        //Программа выведет числа от 9 до 24
    }
}

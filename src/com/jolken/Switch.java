package com.jolken;

public class Switch {
    public static void main(String[] args) {
        int a = 42;
        switch (a) {
            case 1:
                System.out.println("a=1");
                break;
            case 12:
                System.out.println("a=12");
                break;
            case 42:
                System.out.println("a=42");
                break;
            default:
                System.out.println("Значение a неизвестно");
                break;
        }
    }
}

package com.jolken;

import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Сканер нужен для считывания данных из потока, в данном случае консоли
        int x = sc.nextInt(); //Считываем переменную типа int
        System.out.println(x+2);
    }
}

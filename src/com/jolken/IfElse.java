package com.jolken;

public class IfElse {
    public static void main(String[] args) {

        int a = 42;
        //условие, вместо цифр могут быть переменные
        if (a > 0) { //Код выполняемый, если условие верно
            System.out.println("a > 0");
        }
        else { //Код выполняемый, если условие неверно
            System.out.println("a < 0");
        }

        if (a > 0) { System.out.println("a > 0"); }
        else if (a > 2) { System.out.println("a > 2"); }
        else if (a > 6) { System.out.println("a > 6"); }
        else if (a > 12) { System.out.println("a > 12"); }
        else if (a > 999) { System.out.println("a > 999"); }
    }

}

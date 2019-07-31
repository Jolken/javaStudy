package com.jolken;

public class For {
    public static void main(String[] args) {
        // переменная, видимая только в теле цикла
        //   ↓↓↓↓↓      условие, когда оно будет неверным, то цикл закончится
        //   ↓↓↓↓↓      ↓↓↓↓↓    действие в конце цикла
        //   ↓↓↓↓↓      ↓↓↓↓↓    ↓↓↓↓↓
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }
        //Выведет в столбик числа от 0 до 15
    }

}

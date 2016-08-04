package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    //напишите тут ваш код

    public static void main(String[] args) {
        int h1=1;
        int h2=2;
        int s1,s2;
        s1=convertToSeconds(h1);
        s2=convertToSeconds(h2);
        System.out.println(s1);
        System.out.println(s2); //напишите тут ваш код
    }
    public static int convertToSeconds(int hour){

        return hour*3600;
    }

}
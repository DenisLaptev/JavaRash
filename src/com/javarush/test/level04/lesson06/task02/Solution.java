package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine(); //читаем строку с клавиатуры
        int a = Integer.parseInt(sA);

        String sB = reader.readLine(); //читаем строку с клавиатуры
        int b = Integer.parseInt(sB);

        String sC = reader.readLine(); //читаем строку с клавиатуры
        int c = Integer.parseInt(sC);

        String sD = reader.readLine(); //читаем строку с клавиатуры
        int d = Integer.parseInt(sD);

        int M1,M2;

        if (a>=b) M1=a;
        else M1=b;
        if (c>=d) M2=c;
        else M2=d;
        if (M1>=M2) System.out.println (M1);
        else System.out.println (M2);

    }
}

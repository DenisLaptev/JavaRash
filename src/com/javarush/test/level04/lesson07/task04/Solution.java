package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        int n=0;
        int p=0;

        if (a < 0)n++;
        else p++;

        if (b < 0)n++;
        else p++;

        if (c < 0)n++;
        else p++;
        System.out.println("количество отрицательных чисел: "+n);
        System.out.println("количество положительных чисел: "+p);
    }
}

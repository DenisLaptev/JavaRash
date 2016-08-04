package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int s=0;
        int a=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (a!=-1)
        {
            String sA = reader.readLine(); //читаем строку с клавиатуры
            a = Integer.parseInt(sA); //преобразовываем строку в число.

            s=s+a;

        }
        System.out.println(s);
    }
}

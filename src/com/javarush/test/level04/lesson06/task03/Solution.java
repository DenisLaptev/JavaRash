package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int i1,i2,i3;


        if (a < b)
        {
            if (a < c)
            {
                i1 = a;
                if (b < c)
                {
                    i2 = b;
                    i3 = c;
                } else
                {
                    i2 = c;
                    i3 = b;
                }
            } else
            {
                i1 = c;
                if (a < b)
                {
                    i2 = a;
                    i3 = b;
                } else
                {
                    i2 = b;
                    i3 = a;
                }

            }
        }
        else
        {
            if (b < c)
            {
                i1 = b;
                if (a < c)
                {
                    i2 = a;
                    i3 = c;
                } else
                {
                    i2 = c;
                    i3 = a;
                }
            }
            else
            {
                i1 = c;
                if (a < b)
                {
                    i2 = a;
                    i3 = b;
                } else
                {
                    i2 = b;
                    i3 = a;
                }

            }
        }
        System.out.println(i3+" "+i2+" "+i1);
    }
}

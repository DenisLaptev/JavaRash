package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Вводим с клавиатуры 2 числа N  и M.
        //System.out.println("Введите число N");
        String sN = reader.readLine();
        int N = Integer.parseInt(sN);

        //System.out.println("Введите число M");
        String sM = reader.readLine();
        int M = Integer.parseInt(sM);

        //Вводим N строк и заполнить ими список.

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < N; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        //Переставим M первых строк в конец списка.

        for (int i = 0; i < M; i++)
        {
            list.add(list.get(0));
            list.remove(0);
        }

        //Выведем список на экран, каждое значение с новой строки.

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}

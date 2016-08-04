package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //создание списка
        ArrayList<String> list = new ArrayList<String>();

        //ввод строк с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }
/*
        // удаляем последнюю строку и вставляем её в начало. Повторяем 13 раз.
        for (int i = 1; i <= 13; i++)
        {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        }
        После list.size() или n*list.size() таких операций список становится собой.
        Поэтому фактически мы можем выкинуть 10 операций, оставить 3.

*/
        // удаляем последнюю строку и вставляем её в начало. Повторяем 13 раз.
        for (int i = 1; i <= 3; i++)
        {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        }
        // вывод на экран содержимого списка
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println((list.get(i)));
        }

    }
}

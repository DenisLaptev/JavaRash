package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
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
        //определение самой короткой строки в списке и определение длины этой строки
        String sMin;
        sMin = list.get(0);
        for (int i = 1; i < 5; i++)
        {
            if (sMin.length() > list.get(i).length())
            {
                sMin = list.get(i);
            }
        }
        // вывод на экран одной или нескольких строк с минимальной длиной
        for (int i = 0; i < 5; i++)
        {
            if (list.get(i).length() == sMin.length())
            {
                System.out.println((list.get(i)));
            }
        }

    }
}

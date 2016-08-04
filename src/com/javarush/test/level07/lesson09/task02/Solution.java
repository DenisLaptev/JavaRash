package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
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

        //удаляем 3 - ий элемент списка
        list.remove(2);

        //выводим оставшиеся элементы в обратном порядке.
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(list.size()-1-i));
        }


    }
}

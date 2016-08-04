package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {

        ArrayList<String> list = new ArrayList<String>();

        {
            String s1 = "str1";
            list.add(s1);
            String s2 = "str2";
            list.add(s2);
            String s3 = "str3";
            list.add(s3);
            String s4 = "str4";
            list.add(s4);
            String s5 = "str5";
            list.add(s5);
        }//напишите тут ваш код
        System.out.println("Размер списка: " + list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}

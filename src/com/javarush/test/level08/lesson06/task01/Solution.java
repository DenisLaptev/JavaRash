package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{
    public static Object createArrayList()
    {
        //напишите тут ваш код
        List<String> aList = new ArrayList<String>();
        aList.add("Mama");
        aList.add("Mila");
        aList.add("Ramu");

        return aList;

    }

    public static Object createLinkedList()
    {
        //напишите тут ваш код
        List<String> lList = new LinkedList<String>();
        lList.add("Mama");
        lList.add("Mila");
        lList.add("Ramu");

        return lList;

    }
}

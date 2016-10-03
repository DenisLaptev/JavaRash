package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Ivan", new Date("JANUARY 1 1940"));
        //напишите тут ваш код
        map.put("Petr", new Date("FEBRUARY 1 1950"));
        map.put("Sidor", new Date("MARCH 1 1960"));
        map.put("Vasja", new Date("APRIL 1 1970"));
        map.put("Kolja", new Date("MAY 1 1980"));
        map.put("Misha", new Date("JUNE 1 1990"));
        map.put("Schwartz", new Date("JULY 1 1981"));
        map.put("Stallone", new Date("AUGUST 1 1965"));
        map.put("Andrej", new Date("SEPTEMBER 1 1978"));
        map.put("Sergej", new Date("OCTOBER 1 1989"));

        printMap(map);

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        List<String> summerKeys = new ArrayList<>();
        for (Map.Entry<String, Date> entry : map.entrySet())
        {
            if (entry.getValue().getMonth() == 5 ||
                    entry.getValue().getMonth() == 6 ||
                    entry.getValue().getMonth() == 7)
            {
                summerKeys.add(entry.getKey());
            }
        }
        for (String summerKey : summerKeys)
        {
            map.remove(summerKey);
        }

        System.out.println("after removing");

        printMap(map);
    }

    public static void printMap(HashMap<String, Date> map)
    {
        for (Map.Entry<String, Date> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue().getMonth());
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}

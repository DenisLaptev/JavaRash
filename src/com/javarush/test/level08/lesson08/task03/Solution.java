package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String,String> human = new HashMap<>();
        human.put("Pupkin","Vasja");
        human.put("Ivanov","Petr");
        human.put("Petrov","Ivan");
        human.put("Sidorov","Denis");
        human.put("Laptev","Vasja");

        human.put("Kuznezov","Vasja");
        human.put("Stoljarov","Denis");
        human.put("Pushkin","Ivan");
        human.put("Lermontov","Petr");
        human.put("Krylov","Ivan");

        return (HashMap<String, String>) human;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int countFirst = 0;
        for (String s : map.values())
        {
            if (s.equals(name)){
                countFirst++;
            }
        }
        return countFirst;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int countLast = 0;
        for (String s : map.keySet())
        {
            if (s.equals(lastName)){
                countLast++;
            }
        }
        return countLast;
    }

    public static void main(String[] args)
    {
        HashMap<String, String> human = createMap();
        for (Map.Entry<String, String> entry : human.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue() + ";");
        }
        System.out.println("----------------------------");
        System.out.println("First name Vasja: " + getCountTheSameFirstName(human, "Vasja"));
        System.out.println("Last name Petrov: " + getCountTheSameLastName(human, "Petrov"));
    }
}

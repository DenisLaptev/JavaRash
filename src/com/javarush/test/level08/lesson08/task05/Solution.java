package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov", "Ivan");
        //напишите тут ваш код
        map.put("Petrov", "Sidor");
        map.put("Sidorov", "Vasja");
        map.put("Vasiljev", "Ruslan");
        map.put("Pushkin", "Sidor");
        map.put("Gogol", "Andrej");
        map.put("Schwartzneger", "Vasja");
        map.put("Stallone", "Ivan");
        map.put("Newton", "Sidor");
        map.put("Betchoven", "Vasja");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        List<String> values = new ArrayList<>();
        List<String> copyOfValues = new ArrayList<>();
        List<String> dublicateValues = new ArrayList<>();
        List<String> dublicateKeys = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            values.add(entry.getValue());
        }
        copyOfValues = values;
        for (int i = 0; i < values.size(); i++)
        {
            for (int j = i+1; j < copyOfValues.size(); j++)
            {
                if(values.get(i).equals(copyOfValues.get(j))){
                    dublicateValues.add(values.get(i));
                }
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            dublicateKeys = entry.getKey()
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}

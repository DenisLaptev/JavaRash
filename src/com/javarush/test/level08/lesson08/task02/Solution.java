package com.javarush.test.level08.lesson08.task02;

import java.util.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        Set<Integer> mySet = new HashSet<>();
       // Random random = new Random();
        for (int i = 0; i <20 ; i++)
        {
            //mySet.add(random.nextInt(15));
            mySet.add(i);
        }
        for (Integer integer : mySet)
        {
            System.out.println(integer);
            System.out.println("-------------------------");
        }
        return (HashSet<Integer>) mySet;
    }


    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        List<Integer> myList = new ArrayList<>();
        HashSet<Integer> newHS = new HashSet<>();

        for (Integer integer : set)
        {
            myList.add(integer);
        }

        for (int i = 0; i < myList.size(); )
        {
            if (myList.get(i) > 10){
                myList.remove(i);
            }else
            {
                i++;
            }
        }
        for (int i = 0; i < myList.size(); i++)
        {
            newHS.add(myList.get(i));
        }
        for (Integer integer : newHS)
        {
            System.out.println(integer);
        }
        return newHS;
    }


    public static void main(String[] args)
    {
        HashSet<Integer> setOfNumbers;
        setOfNumbers = createSet();
        removeAllNumbersMoreThan10(setOfNumbers);
    }
}

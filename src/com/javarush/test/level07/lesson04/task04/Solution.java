package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        }

        int[] invertArray = new int[10];

        for (int i = 0; i < array.length; i++){
            invertArray[i]=array[i]; //читаем строку с клавиатуры
        }

        for (int k = 0; k < invertArray.length/2; k++){
            int tmp = invertArray[k];
            invertArray[k] = invertArray[invertArray.length - k -1];
            invertArray[invertArray.length - k -1] = tmp;
        }
        //напишите тут ваш код
        for (int k = 0; k < invertArray.length; k++){
            System.out.println(invertArray[k]);
        }

    }
}

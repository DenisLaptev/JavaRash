package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] bigArr = new int[20];
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArr.length; i++){
            bigArr[i] = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        }

        for (int i = 0; i < bigArr.length/2; i++){
            smallArr1[i] = bigArr[i]; //читаем строку с клавиатуры
        }

        for (int i = bigArr.length/2; i < bigArr.length; i++){
            smallArr2[i-bigArr.length/2] = bigArr[i]; //читаем строку с клавиатуры
        }

        for (int i = 0; i < smallArr2.length; i++){
            System.out.println(smallArr2[i]); //читаем строку с клавиатуры
        }


        //напишите тут ваш код

    }
}

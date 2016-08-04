package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String [] sNum = new String [5];//массив из строк
        int [] intNum = new int [5];//массив из чисел
        int [] increaseNum = new int [5];//упорядоченный массив
        int temp1, temp2;//временные переменные для того, чтобы менять местами значения двух элементов в массивах

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<5;i++)
        {
            sNum[i] = reader.readLine(); //читаем строку с клавиатуры
            intNum[i] = Integer.parseInt(sNum[i]); //преобразовываем строку в число.
            increaseNum[i] = intNum[i];
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(increaseNum[i]<intNum[j]){


                    temp1=increaseNum[i];
                    increaseNum[i]=increaseNum[j];
                    increaseNum[j]=temp1;

                    temp2=intNum[i];
                    intNum[i]=intNum[j];
                    intNum[j]=temp2;

                }
            }
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(increaseNum[i]);
        }


//напишите тут ваш код
    }
}

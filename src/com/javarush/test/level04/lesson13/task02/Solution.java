package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sM = reader.readLine(); //читаем строку с клавиатуры
        int m = Integer.parseInt(sM); //преобразовываем строку в число.

        String sN = reader.readLine(); //читаем строку с клавиатуры
        int n = Integer.parseInt(sN); //преобразовываем строку в число.

        for (int i=1;i<=(m-1);i++){
              for (int j=1;j<=(n-1);j++){
              System.out.print("8");
              }
              System.out.println("8");
        }
        for (int j=1;j<=n;j++){
            System.out.print("8");
        }
    }
}

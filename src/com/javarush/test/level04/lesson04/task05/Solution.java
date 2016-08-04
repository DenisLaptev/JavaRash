package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine(); //читаем строку с клавиатуры
        int nNum = Integer.parseInt(sNum); //преобразовываем строку в число.
        if (nNum > 0) System.out.println(2 * nNum);
        if (nNum < 0) System.out.println(nNum + 1);

        /*
        public class Solution
        {
            public static void main(String[] args) throws Exception
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            }

            String blaka = reader.readLine();
            int num = Integer.parseInt(blaka);
            if(num>=0)num=num*2;
            else num=num+1;
            System.out.println(num);
        }
        }
        */
    }

}
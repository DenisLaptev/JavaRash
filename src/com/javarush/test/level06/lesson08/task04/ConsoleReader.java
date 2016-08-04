package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine(); //читаем строку с клавиатуры
        return name;
//напишите тут ваш код

    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String StringIntNum = reader.readLine(); //читаем строку с клавиатуры
        int intNum = Integer.parseInt(StringIntNum); //преобразовываем строку в число.
        return intNum;
//напишите тут ваш код

    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String StringDoubleNum = reader.readLine(); //читаем строку с клавиатуры
        double doubleNum = Double.parseDouble(StringDoubleNum); //преобразовываем строку в число.
        return doubleNum;
//напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String StringBool = reader.readLine(); //читаем строку с клавиатуры
        boolean Bool = Boolean.parseBoolean(StringBool);
        if (Bool==true) {
            return true;//преобразовываем строку в число.
        }
        else{
            return false;
        }
//напишите тут ваш код

    }
}

package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String name;
    double weight;
    int age;
    String color;
    String adress;
    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, double weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        this.weight = 5.0;
        this.age = age;
    }
    public void initialize(double weight, String color)
    {
        this.weight = weight;
        this.color = color;

        this.name = null;
        this.adress = null;
        this.age = 3;
    }
    public void initialize(double weight, String color, String adress)
    {
        this.weight = weight;
        this.color = color;
        this.adress = adress;

        this.name = null;
        this.age = 4;
    }

}


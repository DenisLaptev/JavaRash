package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name;
    private double height;
    private String color;

    Dog (String name){
        this.name=name;

    }
    Dog (String name, double height){
        this.name=name;
        this.height=height;

    }
    Dog (String name, double height, String color){
        this.name=name;
        this.height=height;
        this.color=color;
    }
}

package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human d1 = new Human("Иван", true, 60, null, null);
        Human d2 = new Human("Пётр", true, 70, null, null);
        Human b1 = new Human("Афдотья", false, 55, null, null);
        Human b2 = new Human("Агафья", false, 65, null, null);
        Human o = new Human("Сидор", true, 40, d1, b1);
        Human m = new Human("Варвара", false, 35, d2, b2);
        Human ch1 = new Human("Денис", true, 10, o, m);
        Human ch2 = new Human("Руслан", true, 8, o, m);
        Human ch3 = new Human("Марина", false, 6, o, m);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(o.toString());
        System.out.println(m.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());//напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;//напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
    }

}

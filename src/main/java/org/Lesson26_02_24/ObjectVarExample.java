package org.Lesson26_02_24;

public class ObjectVarExample {
    public static void main(String[] args) {
        //модификаторы доступа
        //private - доступ только внутри класса
        //default - доступ внутри пакета/папки
        //protected - доступ внутри папки/пакета и наследниках класса
        //public - доступ внутри всего проекта

        String s = new String("Hello");

        int someInt = 100;
        Student oleg = new Student(30, "Oleg");
        Student anton = new Student(40, "Anton");
        Student mikhail = new Student(50, "Mikhail");
        Student student4 = null;

        oleg.name = "Olga";

        oleg.learn();
        anton.learn();
        mikhail.learn();
    }
}
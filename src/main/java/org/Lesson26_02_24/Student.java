package org.Lesson26_02_24;

public class Student {  // создаём класс, класс может содержать переменные и методы
    static String groupName;
    static int count;
    int age = 18;        // переменные экземпляра
    String name;


    public Student(int age1, String name1) {  // конструктор класса, вызывается с помощью ключевого слова new
        age = age1;
        name = name1;
        count++;
    }

    public void learn() {           // метод класса
        System.out.println("Student has " + age);
        System.out.println("Student " + name + " is learning");
    }
}

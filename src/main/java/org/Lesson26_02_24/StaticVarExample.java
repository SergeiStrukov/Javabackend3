package org.Lesson26_02_24;

public class StaticVarExample {
    public static void main(String[] args) {
        Student oleg = new Student(30, "Oleg");
        Student anton = new Student(25 ,"Anton");
        oleg.groupName = "150124-m";

        Student michail = new Student(40, "Michail");
        Student sergey = new Student(40, "Sergey");
        System.out.println(oleg.groupName);
        System.out.println(anton.groupName);

        oleg.age = 20;

        oleg.learn();
        anton.learn();
        michail.learn();
        sergey.learn();

        Student.groupName = "150124-m-be";
        System.out.println(Student.groupName);
        System.out.println(Student.count);

        System.out.println("-------------");

        Product apple = new Product("apple", 2);
        Product banana = new Product("banana", 7);

        System.out.println(Product.shopName);
        System.out.println(apple.shopName);

        System.out.println(apple);
    }
}

package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        Person smith = new Person("smith", 2000, 50000);
        System.out.println("====smith's information=====");
        System.out.println(smith.info());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {//Constructor
    }

    public Person(String name, int age, double salary) {//Constructor
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("name length is incorrect, need 2-6 characters, use default name");
            this.name = "no name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Your age input is incorrect, needs to between 1 and 120, " +
                    "use a default age 18");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "Info is name=" + name + " age=" + age + " salary=" + salary;
    }
}
package com.company.models;

import com.company.Person;

import java.util.Objects;

class A{
    int a;

    public A() {
    }

    public A(int a) {
        this.a = a;
    }
}
class B extends A{
    public B(int a) {
        super(a);
    }

    public B() {
    }

    public B(int a, int b) {
        super(a);
        this.b = b;
    }

    int b;
}
class C extends B{


    public C() {
    }

    public C(int b, int c, int d, int a) {
        super(a, b);
        C = c;
        D = d;
    }

    public C(int a) {
        super(a);
    }

    int C;
    int D;
}

public class Student extends Person {
    String firstName;
    String lastName;
    int age;
    static int conut;

    static {
        conut++;
        System.out.println("Static init block");
    }
    {
        age = 1;
        firstName = "No name";
        System.out.println("Init block");
    }

    public Student() {
        System.out.println("Constructor block");
    }

    public Student(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

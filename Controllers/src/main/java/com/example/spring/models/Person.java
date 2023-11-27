package com.example.spring.models;

import org.springframework.lang.NonNull;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Person {
@NotNull(message = "Name cannot be null")
    String name;
    String lastname;
    String phone;
    int age;

    public Person(String name, String lastname, String phone, int age) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

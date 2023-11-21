package com.example.spring;

public class TestBean {
    private String name;
    private int age;

    private TestBean() {
    }

    private TestBean(String name) {
        this.name = name;
    }

    public static TestBean factoryMethod() {
        return new TestBean("Ivan");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TestBean{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    private void InitMethod() {
        System.out.println("Call InitMethod");
    }

    private void DestroyMethod() {
        System.out.println("Call DestroyMethod");
    }
}

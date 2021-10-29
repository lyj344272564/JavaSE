package com.richard.demo03.mansgeStudent;

import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id > 0){
            this.id = id;
        }
        else{
            System.out.println("学号不合理哦！！！");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if (id != student.id)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    public void setAge(Integer age) {
        if(age >= 4 && age <= 60){
            this.age = age;
        }
        else{
            System.out.println("年龄不合理哦！！！");
        }
    }

    public Student(Integer id, String name, Integer age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

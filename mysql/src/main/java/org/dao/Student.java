package org.dao;

public class Student {
    Integer id;
    String name;
    String class_id;

    public Student() {
    }

    public Student(Integer id, String name, String class_id) {
        this.id = id;
        this.name = name;
        this.class_id = class_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", class_id='" + class_id + '\'' +
                '}';
    }
}

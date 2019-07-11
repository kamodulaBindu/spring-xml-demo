package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    public void actorInfo(){
        System.out.println("Name:"+getName());
        System.out.println("Gender:"+getGender());
        System.out.println("Age:"+getAge());
    }
}

package com.shivani;

public class UserModel {
    int id;
    String name;
    int age;
    String course;

    public UserModel(){

    }
    public UserModel(int id,String name,int age,String course)
    {
        this.id= id;
        this.name= name;
        this.age= age;
        this.course = course;
    }

    public int getId(){
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public String getCourse(){
        return this.course;
    }
    public int getAge(){
        return this.age;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setCourse(String course)
    {
        this.course=course;
    }
    public void setAge(int age)
    {
        this.age = age;
    }




}

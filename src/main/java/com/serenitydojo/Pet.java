package com.serenitydojo;

public class Pet {
    private String name;
    private int age;
    private String play;

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    public String play() {
        return play;
    }
}

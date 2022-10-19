package com.serenitydojo;

public class Dog extends Pet {
    private String favoriteToy;
    private int age;

    private String play;
    private boolean isFed = false;

    public static final String DOG_NOISE = "Woof";
    public static final String DOG_GAME = "plays with bone";

    public Dog(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public boolean isFed() {
        return isFed;
    }
    public int getAge(){
        return age;
    }

    // Exercise 4
    public String makeNoise() {return DOG_NOISE;}

    public void feed() {
        this.isFed = true;
    }

//    @Override
    public String play() {
        return DOG_GAME;
    }
}
